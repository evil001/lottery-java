package com.lottery.ba.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.domain.ParamPage;
import com.lottery.domain.prod.Product;
import com.lottery.domain.prod.ProductImg;
import com.lottery.mutual.ClientMessage;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	/**
	 * 保存产品信息
	 * 
	 * @param product
	 * @param productImg
	 * @param productImgList
	 * @return
	 */
	@RequestMapping("/prod/saveProduct")
	public ClientMessage saveProduct(Product product, @RequestParam("productImg") String productImg,
			@RequestParam String[] productImgList) {
		this.productService.saveProduct(product, productImg, productImgList);
		return ClientMessage.success();
	}

	/**
	 * 查询产品信息
	 * 
	 * @param productName
	 * @param createAt
	 * @param state
	 * @param param
	 * @return
	 */
	@RequestMapping("/prod/query")
	public EasyUIMessage queryProduct(@RequestParam(required = false) String productName,
			@RequestParam(defaultValue = "1") int isNew, @RequestParam(defaultValue = "1") int isHot,
			@RequestParam(required = false) String categoryCode, @RequestParam(required = false) String typeCode,
			@RequestParam(required = false) String createAt,
			@RequestParam(defaultValue = "1", required = false) int state, ParamPage param) {
		return this.productService.getProduct(productName, isNew, isHot, categoryCode, typeCode, createAt, state,
				param);
	}

	/**
	 * 修改产品基本信息
	 * 
	 * @param pro
	 * @return
	 */
	@RequestMapping("/prod/update")
	public ClientMessage updateProduct(Product pro) {
		this.productService.updateProduct(pro);
		return ClientMessage.success();
	}

	/**
	 * 保存产品详情
	 * 
	 * @param productId
	 * @param detailInfo
	 * @return
	 */
	@RequestMapping(value = "/prod/detail/save", method = RequestMethod.POST)
	public ClientMessage saveProductDetail(Long productId, String detailInfo) {
		this.productService.saveProductDetail(productId, detailInfo);
		return ClientMessage.success();
	}

	/**
	 * 产品详情查询
	 * 
	 * @param productId
	 * @param state
	 * @param startTime
	 * @param endTime
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "/prod/detail/query")
	public EasyUIMessage getProductImg(@RequestParam(required = false) Long productId, int state,
			@RequestParam(required = false) String startTime, @RequestParam(required = false) String endTime,
			ParamPage param) {
		return this.productService.getProductImg(productId, state, startTime, endTime, param);
	}

	/**
	 * 修改产品封面
	 * 
	 * @param id
	 * @param productImg
	 * @return
	 */
	@RequestMapping(value = "/prod/img/update")
	public ClientMessage saveProductImg(Long id, String productImg) {
		this.productService.updateProductImg(new ProductImg(id, productImg));
		return ClientMessage.success();
	}

	/**
	 * 查询商品列表
	 * 
	 * @param productName
	 * @param state
	 * @param startTime
	 * @param endTime
	 * @param param
	 * @return
	 */
	@RequestMapping("/prod/img/collect")
	public EasyUIMessage getProductCollectImg(String productName, int state, String startTime, String endTime,
			ParamPage param) {
		return this.productService.getProductCollect(productName, state, startTime, endTime, param);
	}

}
