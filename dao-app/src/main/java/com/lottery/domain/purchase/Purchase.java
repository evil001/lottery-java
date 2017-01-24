package com.lottery.domain.purchase;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class Purchase extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer periods;

	private String title;

	private Integer totalPerson;

	private Integer participate;

	private Integer limitPerson;

	private Integer residuePerson;

	private Long productId;

	private Integer productNum;

	private String productImg;

	public Integer getPeriods() {
		return periods;
	}

	public void setPeriods(Integer periods) {
		this.periods = periods;
	}

	public Integer getProductNum() {
		return productNum;
	}

	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTotalPerson() {
		return totalPerson;
	}

	public void setTotalPerson(Integer totalPerson) {
		this.totalPerson = totalPerson;
	}

	public Integer getParticipate() {
		return participate;
	}

	public void setParticipate(Integer participate) {
		this.participate = participate;
	}

	public Integer getLimitPerson() {
		return limitPerson;
	}

	public void setLimitPerson(Integer limitPerson) {
		this.limitPerson = limitPerson;
	}

	public Integer getResiduePerson() {
		return residuePerson;
	}

	public void setResiduePerson(Integer residuePerson) {
		this.residuePerson = residuePerson;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
