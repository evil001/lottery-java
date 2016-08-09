package com.lottery.domain.category;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class Category extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1450954904882277353L;

	private String categoryName;

	private String categoryCode;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
}
