package com.lottery.domain.prod;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class ProductImg extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2519661762307474285L;

	public ProductImg() {
	}

	public ProductImg(Long id, String productImg) {
		super.id = id;
		this.productImg = productImg;
	}

	private Long productId;

	private String productName;

	private String productImg;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
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

}
