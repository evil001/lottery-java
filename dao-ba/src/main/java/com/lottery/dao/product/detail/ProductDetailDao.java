package com.lottery.dao.product.detail;

import org.springframework.stereotype.Repository;

import com.lottery.domain.prod.ProductDetail;

@Repository
public interface ProductDetailDao {

	/**
	 * 保存商品详情
	 * 
	 * @param pd
	 */
	void saveProductDetail(ProductDetail pd);

}
