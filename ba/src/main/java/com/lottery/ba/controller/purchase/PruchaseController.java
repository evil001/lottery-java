package com.lottery.ba.controller.purchase;

import java.util.List;
import java.util.Map;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.lottery.domain.ParamPage;
import com.lottery.domain.purchase.Purchase;
import com.lottery.es.domain.Medicine;
import com.lottery.es.service.ESService;
import com.lottery.mutual.ClientMessage;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.product.service.PurchaseService;

@RestController
public class PruchaseController {

	@Autowired
	private PurchaseService purchaseService;

	@Autowired
	private ESService esService;

	@Value("${elasticsearch.index.prod}")
	private String indexName;

	@Value("${elasticsearch.type.product}")
	private String type;

	@RequestMapping("/purchase/save")
	public ClientMessage savePurchase(Purchase purchase) {
		this.purchaseService.savePurchase(purchase);
		Map<String, Object> map = this.purchaseService.getPurchaseInES();
		this.esService.createIndexResponse(indexName, type, JSONObject.toJSONString(map));
		return ClientMessage.success();
	}

	@RequestMapping("/purchase/update")
	public ClientMessage updatePurchase(Purchase purchase) {
		this.purchaseService.updatePurchase(purchase);
		return ClientMessage.success();
	}

	@RequestMapping("/purchase/all")
	public EasyUIMessage getPurchaseAll(ParamPage param) {
		return this.purchaseService.getPurchaseAll(param);
	}

	@RequestMapping("/purchase/es/all")
	public EasyUIMessage getElasticProd(ParamPage param) {
		QueryBuilder queryBuilder = QueryBuilders.matchAllQuery();
		List<Medicine> list = this.esService.search(queryBuilder, indexName, type, param.getPage() - 1, param.getRows(),
				param.getSort(), param.getOrder());
		return EasyUIMessage.easyJson(list.get(0).getTotal(), list);
	}

	@RequestMapping("/purchase/es/del")
	public ClientMessage delElasticIndex(String id) {
		this.esService.delIndexResponse(indexName, type, id);
		return ClientMessage.success();
	}

}
