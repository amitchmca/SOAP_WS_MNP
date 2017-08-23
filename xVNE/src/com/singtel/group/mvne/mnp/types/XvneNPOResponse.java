package com.singtel.group.mvne.mnp.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="MvneMNPNPORes")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType(propOrder= {"portDetails", "mvno",  "subscriberSequence", "customer", "params", "result", "error" })
public class XvneNPOResponse {

	PortDetails portDetails;
	MVNO mvno;
	SubscriberSequence subscriberSequence;
	Customer customer;
	Params params;
	Result result;
	Error error;
	
	public XvneNPOResponse() {
		// TODO Auto-generated constructor stub
	}



	/*public XvneNPOResponse(NPO npo, Customer customer, MVNO mvno, Params params, Result result, Error error) {
		super();
		this.npo = npo;
		this.customer = customer;
		this.mvno = mvno;
		this.params = params;
		this.result = result;
		this.error = error;
	}
*/


	public PortDetails getNpo() {
		return portDetails;
	}

	public XvneNPOResponse(PortDetails npo, SubscriberSequence subscriberSequence, Customer customer, MVNO mvno, Params params,
			Result result, Error error) {
		super();
		this.portDetails = npo;
		this.subscriberSequence = subscriberSequence;
		this.customer = customer;
		this.mvno = mvno;
		this.params = params;
		this.result = result;
		this.error = error;
	}



	public void setNpo(PortDetails npo) {
		this.portDetails = npo;
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

	public MVNO getMvno() {
		return mvno;
	}

	public void setMvno(MVNO mvno) {
		this.mvno = mvno;
	}

	/*public List<Param> getParamList() {
		return paramList;
	}

	public void setParamList(List<Param> paramList) {
		this.paramList = paramList;
	}*/

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Params getParams() {
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	
	
}
