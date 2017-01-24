package com.lottery.dao.cart;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lottery.domain.cart.ProdCart;

@Repository
public interface CartDao {

	void saveCart(ProdCart pc);

	/**
	 * 查看购物车是否存在
	 * 
	 * @param pordId
	 * @param userId
	 * @return
	 */
	boolean isExsistCart(@Param("pordId") Long pordId, @Param("userId") Long userId);
}
