package com.singtel.group.mvne.mnp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.singtel.group.mvne.mnp.types.XvneNPORequest;
import com.singtel.group.mvne.mnp.types.XvneNPOResponse;
import com.singtel.group.mvne.mnp.types.XvneNPOTRequest;
import com.singtel.group.mvne.mnp.types.XvneNPOTResponse;
import com.singtel.group.mvne.mnp.types.XvneSDRequest;
import com.singtel.group.mvne.mnp.types.XvneSDResponse;

@WebService(name="XvneMNP", targetNamespace="http://group.singtel.com/mvne/mnp")
public interface MvneMnpIf {

	// new xVNE NPO
	//@WebMethod(action="submitXvneNPO", operationName="XvneNPO")
	@WebMethod(operationName = "xvneNPO", action = "urn:XvneNPO")
	@RequestWrapper(className = "com.singtel.group.mvne.mnp.jaxws.XvneNPO", localName = "xvneNPO", targetNamespace = "http://group.singtel.com/mvne/mnp")
	@ResponseWrapper(className = "com.singtel.group.mvne.mnp.jaxws.XvneNPOResponse", localName = "xvneNPOResponse", targetNamespace = "http://group.singtel.com/mvne/mnp")
	@WebResult(name="XvneMNPFrame")	
	//@WebResult(partName="XvneMNPFrame")
	//@SOAPBinding(parameterStyle=ParameterStyle.BARE)
	XvneNPOResponse xvneNPO(@WebParam(name="XvneMNPFrame") XvneNPORequest xvneNpoReq) throws Exception;

	//service Disconnection
	//@WebMethod(action="submitXvneSD", operationName="XvneSD" )
	@WebMethod(operationName = "xvneSD", action = "urn:XvneSD")
	@RequestWrapper(className = "com.singtel.group.mvne.mnp.jaxws.XvneSD", localName = "xvneSD", targetNamespace = "http://group.singtel.com/mvne/mnp")
	@ResponseWrapper(className = "com.singtel.group.mvne.mnp.jaxws.XvneSDResponse", localName = "xvneSDResponse", targetNamespace = "http://group.singtel.com/mvne/mnp")
	@WebResult(name="XvneMNPFrame")
	XvneSDResponse xvneSD(@WebParam(name="XvneMNPFrame")XvneSDRequest sdReq)  throws Exception;
	
	//NPOT
	//@WebMethod(action="submitXvneNPOT", operationName="XvneNPOT")
	@WebMethod(operationName = "submitNPOT", action = "urn:SubmitNPOT")
	@RequestWrapper(className = "com.singtel.group.mvne.mnp.jaxws.SubmitNPOT", localName = "submitNPOT", targetNamespace = "http://group.singtel.com/mvne/mnp")
	@ResponseWrapper(className = "com.singtel.group.mvne.mnp.jaxws.SubmitNPOTResponse", localName = "submitNPOTResponse", targetNamespace = "http://group.singtel.com/mvne/mnp")
	@WebResult(name="MvneMNPframe")
	XvneNPOTResponse submitNPOT(@WebParam(name="XvneMNPFrame")XvneNPOTRequest npotReq) throws Exception;

}