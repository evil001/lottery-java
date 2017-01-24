package com.lottery.service.cart;

import java.util.List;

import com.lottery.domain.cart.ProdCart;

public interface CartService {

	/**
	 * 购物车添加
	 * 
	 * @param prodId
	 * @param userId
	 * @param prodNum
	 */
	void saveCart(Long prodId, Long userId, Integer prodNum);

	/**
	 * 批量添加
	 * 
	 * @param list
	 */
	void batchSaveCart(List<ProdCart> list);

	/**
	 * 查看用户购物车是否存在
	 * 
	 * @param proId
	 * @param userId
	 * @return
	 */
	boolean isExsistCart(Long proId, Long userId);
}
