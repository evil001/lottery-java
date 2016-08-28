package com.lottery.es.domain;

public class Medicine {

	private Integer id;

	private Long total;

	private Integer participate;

	private Integer limitPerson;

	private String productImg;

	private int isNew;

	private String categoryCode;

	private int residuePerson;

	private String productName;

	private Integer isShow;

	private String typeCode;

	private int totalPerson;

	private int periods;

	private int state;

	private Double productPrice;

	private int isHot;

	private String createAt;

	public Medicine() {
	}

	public Medicine(Integer id, Long total, Integer participate, Integer limitPerson, String productImg, int isNew,
			String categoryCode, int residuePerson, String productName, Integer isShow, String typeCode,
			int totalPerson, int periods, int state, Double productPrice, int isHot, String createAt) {
		this.id = id;
		this.total = total;
		this.participate = participate;
		this.limitPerson = limitPerson;
		this.productImg = productImg;
		this.isNew = isNew;
		this.categoryCode = categoryCode;
		this.residuePerson = residuePerson;
		this.productName = productName;
		this.isShow = isShow;
		this.typeCode = typeCode;
		this.totalPerson = totalPerson;
		this.periods = periods;
		this.state = state;
		this.productPrice = productPrice;
		this.isHot = isHot;
		this.createAt = createAt;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public int getIsNew() {
		return isNew;
	}

	public void setIsNew(int isNew) {
		this.isNew = isNew;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public int getResiduePerson() {
		return residuePerson;
	}

	public void setResiduePerson(int residuePerson) {
		this.residuePerson = residuePerson;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public int getTotalPerson() {
		return totalPerson;
	}

	public void setTotalPerson(int totalPerson) {
		this.totalPerson = totalPerson;
	}

	public int getPeriods() {
		return periods;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public int getIsHot() {
		return isHot;
	}

	public void setIsHot(int isHot) {
		this.isHot = isHot;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
}
