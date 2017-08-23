package com.singtel.group.mvne.mnp.types;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="MvneMNPReq")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType(propOrder= {"portDetails", "mvno",  "subscriberSequence", "customer", "params" })
public class XvneNPOTRequest {

	PortDetails portDetails;
	MVNO mvno;
	SubscriberSequence subscriberSequence;
	Customer customer;
	Params params;
	
	public XvneNPOTRequest() {
		// TODO Auto-generated constructor stub
	}

	public XvneNPOTRequest(PortDetails portDetails, MVNO mvno, SubscriberSequence subscriberSequence, Customer customer,
			Params params) {
		super();
		this.portDetails = portDetails;
		this.mvno = mvno;
		this.subscriberSequence = subscriberSequence;
		this.customer = customer;
		this.params = params;
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

	
	

}
