package com.lottery.domain.purchase;

import com.lottery.domain.base.BaseDomain;

public class Purchase extends BaseDomain {

	private int periods;

	private String title;

	private int totalPerson;

	// 已参与人次
	private int participate;

	// 剩余参与人次
	private int residuePerson;

	// 限购人次
	private int limitPerson;

	private Long productId;

	private String productName;

	private String productImg;

	private Double productPrice;

	public int getPeriods() {
		return periods;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTotalPerson() {
		return totalPerson;
	}

	public void setTotalPerson(int totalPerson) {
		this.totalPerson = totalPerson;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public int getParticipate() {
		return participate;
	}

	public void setParticipate(int participate) {
		this.participate = participate;
	}

	public int getResiduePerson() {
		return residuePerson;
	}

	public void setResiduePerson(int residuePerson) {
		this.residuePerson = residuePerson;
	}

	public int getLimitPerson() {
		return limitPerson;
	}

	public void setLimitPerson(int limitPerson) {
		this.limitPerson = limitPerson;
	}
}
