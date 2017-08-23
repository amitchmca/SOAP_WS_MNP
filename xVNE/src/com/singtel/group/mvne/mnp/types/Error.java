package com.singtel.group.mvne.mnp.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Error")
@XmlAccessorType (XmlAccessType.FIELD)

public class Error {

//	String errString;
	String errCode;
	String errDesc;
	String errAction;
	
	public Error() {
		// TODO Auto-generated constructor stub
	}

	public Error(String errString, String errCode, String errDesc, String errAction) {
		super();
	//	this.errString = errString;
		this.errCode = errCode;
		this.errDesc = errDesc;
		this.errAction = errAction;
	}

	/*public String getErrString() {
		return errString;
	}

	public void setErrString(String errString) {
		this.errString = errString;
	}*/

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrDesc() {
		return errDesc;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}

	public String getErrAction() {
		return errAction;
	}

	public void setErrAction(String errAction) {
		this.errAction = errAction;
	}

	

}
