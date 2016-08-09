package com.lottery.domain.category;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class ProdType extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8690934671929356074L;

	private String categoryCode;

	private String typeName;

	private String typeCode;

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
}
