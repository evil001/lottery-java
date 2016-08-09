package com.lottery.dao.product.collect;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lottery.domain.prod.ProductImgCollect;

@Repository
public interface ProductCollectDao {

	List<ProductImgCollect> getProductImgCollect(@Param("productName") String productName, @Param("state") int state,
			@Param("startTime") String startTime, @Param("endTime") String endTime);
}
