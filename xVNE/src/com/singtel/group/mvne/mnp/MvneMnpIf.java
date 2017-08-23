package com.singtel.group.mvne.mnp;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

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
	@WebResult(name="XvneMNPFrame")	
	//@WebResult(partName="XvneMNPFrame")
	//@SOAPBinding(parameterStyle=ParameterStyle.BARE)
	XvneNPOResponse xvneNPO(@WebParam(name="XvneMNPFrame") XvneNPORequest xvneNpoReq) throws Exception;

	//service Disconnection
	//@WebMethod(action="submitXvneSD", operationName="XvneSD" )
	@WebResult(name="XvneMNPFrame")
	XvneSDResponse xvneSD(@WebParam(name="XvneMNPFrame")XvneSDRequest sdReq)  throws Exception;
	
	//NPOT
	//@WebMethod(action="submitXvneNPOT", operationName="XvneNPOT")
	@WebResult(name="MvneMNPframe")
	XvneNPOTResponse submitNPOT(@WebParam(name="XvneMNPFrame")XvneNPOTRequest npotReq) throws Exception;

}