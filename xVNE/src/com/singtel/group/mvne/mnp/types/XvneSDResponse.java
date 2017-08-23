package com.singtel.group.mvne.mnp.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="MvneMNPSDRes")
@XmlAccessorType (XmlAccessType.FIELD)
//@XmlType(propOrder= {"portDetails", "mvno",  "subscriberSequence", "customer", "params", "result", "error" })
@XmlType(propOrder= {"portDetails", "mvno",  "subscriberSequence", "customer", "params", "result", "error" })
public class XvneSDResponse {

	PortDetails portDetails;
	MVNO mvno;
	SubscriberSequence subscriberSequence;
	Customer customer;
	Params params;
	Result result;
	Error error;
	
	public XvneSDResponse() {
		// TODO Auto-generated constructor stub
	}

	public XvneSDResponse(PortDetails portDetails, MVNO mvno, SubscriberSequence subscriberSequence, Customer customer,
			Params params, Result result, Error error) {
		super();
		this.portDetails = portDetails;
		this.mvno = mvno;
		this.subscriberSequence = subscriberSequence;
		this.customer = customer;
		this.params = params;
		this.result = result;
		this.error = error;
	}

	public PortDetails getPortDetails() {
		return portDetails;
	}

	public void setPortDetails(PortDetails portDetails) {
		this.portDetails = portDetails;
	}

	public MVNO getMvno() {
		return mvno;
	}

	public void setMvno(MVNO mvno) {
		this.mvno = mvno;
	}

	public SubscriberSequence getSubscriberSequence() {
		return subscriberSequence;
	}

	public void setSubscriberSequence(SubscriberSequence subscriberSequence) {
		this.subscriberSequence = subscriberSequence;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Params getParams() {
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	
	
}
