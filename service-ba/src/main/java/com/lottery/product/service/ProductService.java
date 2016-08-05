package com.lottery.product.service;

import com.lottery.domain.Product;
import com.lottery.mutual.EasyUIMessage;

public interface ProductService {

	public void saveProduct(Product product, String productImg, String[] productImglist);

	void saveProductDetail(Long productId, String detailInfo);

	void updateProduct(Product product);

	public EasyUIMessage getProduct(String productName, String createAt, Integer state);

	public EasyUIMessage getProductImg(Long productId, int state, String startTime, String endTime, int pageNum,
			int pageSize);
}
