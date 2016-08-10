package com.lottery.domain.category;

import java.io.Serializable;
import java.util.Date;

import com.lottery.domain.base.BaseDomain;

public class Category extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1450954904882277353L;

	private String categoryName;

	private String categoryCode;

	public Category() {
	}

	public Category(String categoryName, String categoryCode, Date createAt) {
		this.categoryName = categoryName;
		this.categoryCode = categoryCode;
		super.createAt = createAt;
	}

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
