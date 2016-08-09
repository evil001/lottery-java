package com.lottery.domain.prod;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class ProductImgCollect extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4678522584842502626L;

	private Long productId;

	private String productName;

	private String imgTitle;

	private String imgUrl;

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

	public String getImgTitle() {
		return imgTitle;
	}

	public void setImgTitle(String imgTitle) {
		this.imgTitle = imgTitle;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
