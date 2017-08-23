package com.singtel.group.mvne.mnp.types;

public class Result {

	String code;
	String desc;
	String action;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(String code, String desc, String action) {
		super();
		this.code = code;
		this.desc = desc;
		this.action = action;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	

}
