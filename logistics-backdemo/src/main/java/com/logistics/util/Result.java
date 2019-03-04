package com.logistics.util;

public class Result {
	
	private int code;//数据状态的字段名称
	
	private String msg;//状态信息的字段名称
	
	private int count;//数据总数的字段名称
	
	private Object data;//数据列表的字段名称
	
	public Result() {
		
	}

	public Result(int code, String msg, int count, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}
	
}
