package com.lottery.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品详情
 * 
 * @author tangxiaojun
 *
 */
public class ProductDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5575396782450549394L;

	public ProductDetail(Long productId, String detailInfo, int state, Date createAt) {
		this.productId = productId;
		this.detailInfo = detailInfo;
		this.state = state;
		this.createAt = createAt;
	}

	private Long id;

	private Long productId;

	private String detailInfo;

	private int state = 1;

	private Date createAt;

	private String createUser;

	private Date updateAt;

	private String updateUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}
