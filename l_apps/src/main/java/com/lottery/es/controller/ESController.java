package com.lottery.es.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lottery.controller.BaseController;
import com.lottery.domain.cart.ProdCart;
import com.lottery.domain.purchase.Purchase;
import com.lottery.es.domain.Medicine;
import com.lottery.es.service.ESService;
import com.lottery.mutual.constants.Constants;
import com.lottery.mutual.utils.JSONUtil;
import com.lottery.service.cart.CartService;
import com.lottery.service.puchase.PurchaseService;

@RestController
@RequestMapping("/api/es")
public class ESController extends BaseController {

	@Autowired
	private ESService esService;

	@Autowired
	private PurchaseService purchaseService;

	@Autowired
	private CartService cartService;

	@Value("${elasticsearch.index.prod}")
	private String indexName;

	@Value("${elasticsearch.type.product}")
	private String typeName;

	/**
	 * 根据ID查询商品信息
	 * 
	 * @param prod
	 * @return
	 */
	@RequestMapping("/query/prod/{id}")
	public Map<String, Object> searchProd(@PathVariable("id") String prodId) {
		QueryBuilder qb = QueryBuilders.idsQuery(typeName).ids(prodId);
		return esService.search(qb, indexName, typeName);
	}

	@RequestMapping("/query/prod/jsonp/{id}")
	public String searchProdJsonp(@RequestParam(required = false) String fun, @PathVariable("id") String prodId) {
		QueryBuilder qb = QueryBuilders.idsQuery(typeName).ids(prodId);
		Map<String, Object> map = esService.search(qb, indexName, typeName);
		return fun.concat("(").concat(JSONObject.toJSONString(map)).concat(")");
	}

	@RequestMapping("/query/cart")
	public String getCartInfo(@RequestParam(required = false) String fun, HttpServletRequest req,
			HttpServletResponse res) throws UnsupportedEncodingException {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		String cookie = URLDecoder.decode(super.getCookiePrefix(Constants.COOKIE_CART, req, res), "UTF-8");
		String cookieName = URLDecoder.decode(super.getCookieKey(Constants.COOKIE_CART, req, res), "UTF-8");
		cookieName = cookieName.substring(cookieName.lastIndexOf("_") + 1, cookieName.length());
		String jsonCookie = JSONUtil.str2Json(cookie);
		jsonCookie = jsonCookie.substring(1, jsonCookie.length() - 1);
		System.out.println(jsonCookie);
		JSONObject cartMap = JSON.parseObject(jsonCookie);
		JSONArray cartList = JSONObject.parseArray(cartMap.get("cartList").toString());
		List<String> periodsList = new ArrayList<String>();
		List<ProdCart> pcList = new ArrayList<ProdCart>();
		if (!cartList.isEmpty()) {
			for (Object object : cartList) {
				ProdCart pc = new ProdCart();
				pc.setUserId(Long.valueOf(cookieName));
				pc.setProdId(JSONObject.parseObject(object.toString()).getLong("id"));
				pc.setProdNum(JSONObject.parseObject(object.toString()).getInteger("subCount"));
				pcList.add(pc);
				periodsList.add(JSONObject.parseObject(object.toString()).get("id").toString());
			}
		}
		this.cartService.batchSaveCart(pcList);
		List<Purchase> purchaseList = this.purchaseService.getPurchaseList(periodsList);
		resultMap.put("code", 0);
		resultMap.put("listCart", JSONObject.toJSONString(purchaseList));
		resultMap.put("count", cartMap.get("totalCount"));
		resultMap.put("money", cartMap.get("totalMoney"));
		resultMap.put("listOutDate", "");
		resultMap.put("unvalid", "");
		return fun.concat("(").concat(JSONObject.toJSONString(resultMap)).concat(")");
	}

	@RequestMapping("/query/all")
	public List<Medicine> searchAll(Integer page, Integer rows, String sort, String order) {
		QueryBuilder qb = QueryBuilders.matchAllQuery();
		return esService.search(qb, indexName, typeName, page, rows, sort, order);
	}

	public static void main(String[] args) {
		// String jsonStr =
		// "{\"totalCount\":1,\"totalMoney\":5,\"cartList\":[{\"period\":\"2\",\"residue\":4688,\"subCount\":1}]}";
		String jsonStr = "{\"totalCount\":1,\"totalMoney\":5,\"cartList\":[{\"period\":\"2\",\"residue\":4688,\"subCount\":1}]}";
		JSONObject json = JSONObject.parseObject(jsonStr);
		System.out.println(json.get("totalCount"));
		// Double amount = 1100d;
		// System.out.println(BigDecimal.valueOf(amount).divide(BigDecimal.valueOf(100D),
		// 2, BigDecimal.ROUND_DOWN));

		String ca = "_CartData_0";
		System.out.println(ca.substring(ca.lastIndexOf("_") + 1, ca.length()));
	}
}
