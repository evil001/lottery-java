package com.lottery.domain.prod;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class Product extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6767697067008083417L;

	private String productName;

	private String productDesc;

	private Double productPrice;

	private String productImg;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

}
