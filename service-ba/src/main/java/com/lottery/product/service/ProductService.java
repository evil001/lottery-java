package com.lottery.product.service;

import java.util.Map;

import com.lottery.domain.ParamPage;
import com.lottery.domain.prod.Product;
import com.lottery.domain.prod.ProductF;
import com.lottery.domain.prod.ProductImg;
import com.lottery.mutual.EasyUIMessage;

public interface ProductService {

	public void saveProduct(Product product, String productImg, String[] productImglist);

	void saveProductDetail(Long productId, String detailInfo);

	void updateProduct(Product product);

	public EasyUIMessage getProduct(String productName, String createAt, Integer state, ParamPage param);

	public EasyUIMessage getProductImg(Long productId, int state, String startTime, String endTime, ParamPage param);

	void updateProductImg(ProductImg img);

	/**
	 * 获取列表集合
	 * 
	 * @param productName
	 * @param state
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public EasyUIMessage getProductCollect(String productName, int state, String startTime, String endTime,
			ParamPage param);

	/**
	 * 保存商品到列表
	 * 
	 * @param product
	 */
	public void saveProductF(ProductF product);

	/**
	 * 获取最新商品
	 * 
	 * @return
	 */
	Map<String, Object> getNewProductF();
}
