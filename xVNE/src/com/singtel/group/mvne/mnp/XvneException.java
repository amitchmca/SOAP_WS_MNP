package com.singtel.group.mvne.mnp;


public class XvneException extends Exception{

	
	String errMsg=null;
	String reason=null;
	
	public XvneException() {
		// TODO Auto-generated constructor stub
	}

	public XvneException(String errMsg, String reason) {
		super();
		this.errMsg = errMsg;
		this.reason = reason;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

}
