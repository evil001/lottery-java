package com.lottery.mutual;

/**
 * easyui 报文
 * 
 * @author tangxiaojun
 *
 */
public class EasyUIMessage {

	private static EasyUIMessage e = new EasyUIMessage();

	private Long total;

	private Object rows;

	public EasyUIMessage() {
	}

	public final static EasyUIMessage easyJson(Long total, Object rows) {
		e.setTotal(total);
		e.setRows(rows);
		return e;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public static void main(String[] args) {
	}
}
