package com.lottery.dao.product;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lottery.domain.prod.Product;
import com.lottery.domain.prod.ProductF;

@Repository
public interface ProductDao {

	/**
	 * 添加商品
	 * 
	 * @param product
	 */
	void saveProduct(Product product);

	/**
	 * 修改商品基本信息
	 * 
	 * @param product
	 */
	void updateProduct(Product product);

	/**
	 * 添加商品封面
	 * 
	 * @param map
	 */
	void saveProductImg(Map<String, Object> map);

	/**
	 * 添加图片列表
	 * 
	 * @param map
	 */
	void saveProductImgList(@Param("productId") Long productId, @Param("productImgList") String[] productImgList);

	/**
	 * 获取商品信息
	 * 
	 * @param productName
	 * @param createAt
	 * @param state
	 * @return
	 */
	List<Product> getProduct(@Param("productName") String productName, @Param("createAt") String createAt,
			@Param("state") int state);

	/**
	 * 添加商品到列表
	 */
	void saveProductF(ProductF productF);

	/**
	 * 获取最新商品
	 * 
	 * @return
	 */
	Map<String, Object> getNewProductF();
}
