package com.lottery.domain.banner;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class BannerInfo extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7717880984226862072L;

	private String title;

	private String imgUrl;

	private Integer imgWidth;

	private Integer imgHeight;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getImgWidth() {
		return imgWidth;
	}

	public void setImgWidth(Integer imgWidth) {
		this.imgWidth = imgWidth;
	}

	public Integer getImgHeight() {
		return imgHeight;
	}

	public void setImgHeight(Integer imgHeight) {
		this.imgHeight = imgHeight;
	}
}
