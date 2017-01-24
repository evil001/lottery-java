package com.lottery.domain.cart;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class ProdCart extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long prodId;

	private Long userId;

	private Integer prodNum;

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getProdNum() {
		return prodNum;
	}

	public void setProdNum(Integer prodNum) {
		this.prodNum = prodNum;
	}

}
