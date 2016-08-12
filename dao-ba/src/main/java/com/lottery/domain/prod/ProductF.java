package com.lottery.domain.prod;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class ProductF extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7475622003761064865L;

	private Long productId;

	private String categoryCode;

	private String typeCode;

	private Integer isHot = 0;

	private Integer isNew = 0;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Integer getIsHot() {
		return isHot;
	}

	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}
}
