package com.lottery.domain.category;

import java.io.Serializable;
import java.util.Date;

import com.lottery.domain.base.BaseDomain;

public class ProdType extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8690934671929356074L;

	private String categoryCode;

	private String typeName;

	private String typeCode;

	public ProdType(String categoryCode, String typeName, String typeCode, Date date) {
		this.categoryCode = categoryCode;
		this.typeName = typeName;
		this.typeCode = typeCode;
		super.createAt = date;
	}

	public ProdType() {
	}

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
