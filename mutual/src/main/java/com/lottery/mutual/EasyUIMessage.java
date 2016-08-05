package com.lottery.mutual;

/**
 * easyui 报文
 * 
 * @author tangxiaojun
 *
 */
public class EasyUIMessage {

	private Integer total;

	private Object rows;

	public EasyUIMessage(Integer total, Object rows) {
		this.total = total;
		this.rows = rows;
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
}
