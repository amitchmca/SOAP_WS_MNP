package com.singtel.group.mvne.mnp;

public class MvneMnpException extends Exception {

	String errMsg=null;
	String reason=null;
	public MvneMnpException() {
		// TODO Auto-generated constructor stub
	}

	public MvneMnpException(String msg,String reason) {
		this.errMsg= msg;
		this.reason=reason;
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
