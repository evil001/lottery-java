package com.lottery.mutual;

public class ClientMessage {

	public final static String SUCCESS = "success";

	public final static String FAILD = "faild";

	private Object data;

	private int errorCode = 0;

	private String errorMsg;

	private static int responseCode = 10000;

	public static final ClientMessage success() {
		return new ClientMessage(null, null);
	}

	public static ClientMessage success(Object data) {
		return new ClientMessage(data, null);
	}

	public static ClientMessage success(Object data, String msg) {
		return new ClientMessage(data, msg);
	}

	public static ClientMessage success(Object data, int errorCode) {
		return new ClientMessage(data, errorCode, null, responseCode);
	}

	public static ClientMessage faild() {
		return new ClientMessage(null, null);
	}

	public static ClientMessage faild(Object data, String msg) {
		return new ClientMessage(data, msg);
	}

	public static ClientMessage faild(Object data) {
		return new ClientMessage(data, null);
	}

	public static ClientMessage faild(Object data, int errorCode) {
		return new ClientMessage(data, errorCode, null, responseCode);
	}

	public ClientMessage(Object data, String errorMsg) {
		this.data = data;
		this.errorMsg = errorMsg;
	}

	public ClientMessage(Object data, int errorCode, String errorMsg, int responseCode) {
		this.data = data;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
}
