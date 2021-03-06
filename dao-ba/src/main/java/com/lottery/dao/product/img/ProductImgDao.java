package com.lottery.dao.product.img;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lottery.domain.prod.ProductImg;

/**
 * 商品封面
 * 
 * @author tangxiaojun
 *
 */
@Repository
public interface ProductImgDao {

	/**
	 * 封面搜索
	 * 
	 * @param productId
	 * @param startTime
	 * @param endTime
	 * @param state
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<ProductImg> getProductImgList(@Param("productId") Long productId, @Param("startTime") String startTime,
			@Param("endTime") String endTime, @Param("state") int state);

	/**
	 * 修改产品封面
	 * 
	 * @param img
	 */
	void updateProductImg(ProductImg img);
}
