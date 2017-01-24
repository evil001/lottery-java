package com.lottery.domain.user;

import java.io.Serializable;

import com.lottery.domain.base.BaseDomain;

public class UCUser extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -922399829240844091L;

	private String nickName;

	private String pass;

	private String email;

	private String mobilePhone;

	private Integer gender;

	private Integer birthY;

	private Integer birthM;

	private Integer birthD;

	private String birth;

	private Long constellationId;

	private String constellationName;

	private Integer province;

	private Integer city;

	private Integer district;

	private String address;

	private String qq;

	private String headImg;

	private Integer isBindEmail;

	private Integer isBindMobile;

	private Integer incomeM;

	private String remark;

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getConstellationName() {
		return constellationName;
	}

	public void setConstellationName(String constellationName) {
		this.constellationName = constellationName;
	}

	public String getBirth() {
		return this.birthY + "-" + this.birthM + "-" + this.birthD;
	}

	public void setBirth(String birth) {
		this.birth = this.birthY + "-" + this.birthM + "-" + this.birthD;
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

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getBirthY() {
		return birthY;
	}

	public void setBirthY(Integer birthY) {
		this.birthY = birthY;
	}

	public Integer getBirthM() {
		return birthM;
	}

	public void setBirthM(Integer birthM) {
		this.birthM = birthM;
	}

	public Integer getBirthD() {
		return birthD;
	}

	public void setBirthD(Integer birthD) {
		this.birthD = birthD;
	}

	public Long getConstellationId() {
		return constellationId;
	}

	public void setConstellationId(Long constellationId) {
		this.constellationId = constellationId;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getDistrict() {
		return district;
	}

	public void setDistrict(Integer district) {
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

	public Integer getIsBindEmail() {
		return isBindEmail;
	}

	public void setIsBindEmail(Integer isBindEmail) {
		this.isBindEmail = isBindEmail;
	}

	public Integer getIsBindMobile() {
		return isBindMobile;
	}

	public void setIsBindMobile(Integer isBindMobile) {
		this.isBindMobile = isBindMobile;
	}

	public Integer getIncomeM() {
		return incomeM;
	}

	public void setIncomeM(Integer incomeM) {
		this.incomeM = incomeM;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
