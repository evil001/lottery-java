package com.lottery.domain.atten;

import com.lottery.domain.base.BaseDomain;

public class Attention extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long userId;

	private Long prodId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
}
