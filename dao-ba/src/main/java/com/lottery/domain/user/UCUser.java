package com.lottery.domain.user;

import java.io.Serializable;
import java.util.Date;

public class UCUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -922399829240844091L;

	private Long id;

	private String nickName;

	private String email;

	private String mobilePhone;

	private int gender;

	private int birthY;

	private int birthM;

	private int birthD;

	private Long constellationId;

	private int province;

	private int city;

	private int district;

	private String address;

	private String qq;

	private String headImg;

	private int isBindEmail;

	private int isBindMobile;

	private int incomeM;

	private String remark;

	private int state;

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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getBirthY() {
		return birthY;
	}

	public void setBirthY(int birthY) {
		this.birthY = birthY;
	}

	public int getBirthM() {
		return birthM;
	}

	public void setBirthM(int birthM) {
		this.birthM = birthM;
	}

	public int getBirthD() {
		return birthD;
	}

	public void setBirthD(int birthD) {
		this.birthD = birthD;
	}

	public Long getConstellationId() {
		return constellationId;
	}

	public void setConstellationId(Long constellationId) {
		this.constellationId = constellationId;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public int getIsBindEmail() {
		return isBindEmail;
	}

	public void setIsBindEmail(int isBindEmail) {
		this.isBindEmail = isBindEmail;
	}

	public int getIsBindMobile() {
		return isBindMobile;
	}

	public void setIsBindMobile(int isBindMobile) {
		this.isBindMobile = isBindMobile;
	}

	public int getIncomeM() {
		return incomeM;
	}

	public void setIncomeM(int incomeM) {
		this.incomeM = incomeM;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
