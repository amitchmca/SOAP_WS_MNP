package com.singtel.group.mvne.mnp.types;

import java.util.List;

public class XvneSDResponse {

	SD sd;
	Customer customer;
	MVNO mvno;
	List<Param> paramList;
	Result result;
	
	public XvneSDResponse() {
		// TODO Auto-generated constructor stub
	}

	public XvneSDResponse(SD sd, Customer customer, MVNO mvno, List<Param> paramList, Result result) {
		super();
		this.sd = sd;
		this.customer = customer;
		this.mvno = mvno;
		this.paramList = paramList;
		this.result = result;
	}

	public SD getSd() {
		return sd;
	}

	public void setSd(SD sd) {
		this.sd = sd;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public MVNO getMvno() {
		return mvno;
	}

	public void setMvno(MVNO mvno) {
		this.mvno = mvno;
	}

	public List<Param> getParamList() {
		return paramList;
	}

	public void setParamList(List<Param> paramList) {
		this.paramList = paramList;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	
	
}
