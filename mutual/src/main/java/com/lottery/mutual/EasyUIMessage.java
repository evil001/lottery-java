package com.lottery.mutual;

import com.alibaba.fastjson.JSONObject;

/**
 * easyui 报文
 * 
 * @author tangxiaojun
 *
 */
public class EasyUIMessage {

	private static EasyUIMessage e = new EasyUIMessage();

	private Integer total;

	private Object rows;

	public EasyUIMessage() {
	}

	public final static EasyUIMessage easyJson(Integer total, Object rows) {
		e.setTotal(total);
		e.setRows(rows);
		return e;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public static void main(String[] args) {
		System.out.println(JSONObject.toJSONString(EasyUIMessage.easyJson(1, "2")));
	}
}
