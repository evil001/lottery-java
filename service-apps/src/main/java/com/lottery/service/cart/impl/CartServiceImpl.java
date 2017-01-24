package com.lottery.service.cart.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.cart.CartDao;
import com.lottery.domain.cart.ProdCart;
import com.lottery.service.cart.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;

	@Override
	public void saveCart(Long prodId, Long userId, Integer prodNum) {
		ProdCart pc = new ProdCart();
		pc.setProdId(prodId);
		pc.setUserId(userId);
		pc.setProdNum(prodNum);
		pc.setState(1);
		pc.setCreateAt(new Date());
		this.cartDao.saveCart(pc);
	}

	@Override
	public void batchSaveCart(List<ProdCart> list) {
		for (ProdCart prodCart : list) {
			if (!this.isExsistCart(prodCart.getProdId(), prodCart.getUserId())) {
				this.saveCart(prodCart.getProdId(), prodCart.getUserId(), prodCart.getProdNum());
			}
		}
	}

	@Override
	public boolean isExsistCart(Long proId, Long userId) {
		return this.cartDao.isExsistCart(proId, userId);
	}

}
