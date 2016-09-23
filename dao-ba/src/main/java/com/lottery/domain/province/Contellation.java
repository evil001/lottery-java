package com.lottery.domain.province;

import java.io.Serializable;

/**
 * 星座表
 * 
 * @author tangxiaojun
 *
 */
public class Contellation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long code;

	private String contellationName;

	private String contellationDesc;

	private String startTime;

	private String endTime;

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getContellationName() {
		return contellationName;
	}

	public void setContellationName(String contellationName) {
		this.contellationName = contellationName;
	}

	public String getContellationDesc() {
		return contellationDesc;
	}

	public void setContellationDesc(String contellationDesc) {
		this.contellationDesc = contellationDesc;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
