package com.lottery.domain.prod;

import java.io.Serializable;
import java.util.Date;

import com.lottery.domain.base.BaseDomain;

/**
 * 商品详情
 * 
 * @author tangxiaojun
 *
 */
public class ProductDetail extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5575396782450549394L;

	public ProductDetail(Long productId, String detailInfo, int state, Date createAt) {
		this.productId = productId;
		this.detailInfo = detailInfo;
		super.state = state;
		super.createAt = createAt;
	}

	private Long productId;

	private String detailInfo;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

}
