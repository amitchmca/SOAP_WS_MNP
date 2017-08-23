package com.singtel.group.mvne.mnp.types;

public class MVNO {

	String name;
	String code;
	
	public MVNO() {
		// TODO Auto-generated constructor stub
	}

	
	public MVNO(String name, String code) {
		this.name=name;
		this.code=code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}
	
	
}
