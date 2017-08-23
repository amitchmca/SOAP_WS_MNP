package com.singtel.group.mvne.mnp.types;


import java.util.List;


public class XvneNPORequest {
	
	NPO npo;
	Customer customer;
	MVNO mvno;
	//List<Param> paramList;
	
	

	public XvneNPORequest() {
		// TODO Auto-generated constructor stub
	}



	public XvneNPORequest(NPO npo, Customer customer, MVNO mvno, List<Param> paramList) {
		super();
		this.npo = npo;
		this.customer = customer;
		this.mvno = mvno;
		//this.paramList = paramList;
	}



	public NPO getNpo() {
		return npo;
	}



	public void setNpo(NPO npo) {
		this.npo = npo;
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


/*
	public List<Param> getParamList() {
		return paramList;
	}



	public void setParamList(List<Param> paramList) {
		this.paramList = paramList;
	}*/

	
	
}
