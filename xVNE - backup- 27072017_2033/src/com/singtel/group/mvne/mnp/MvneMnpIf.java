package com.singtel.group.mvne.mnp;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

import com.singtel.group.mvne.mnp.types.XvneNPORequest;
import com.singtel.group.mvne.mnp.types.XvneNPOResponse;

@WebService(name="XvneMNP", targetNamespace="http://group.singtel.com/mvne/mnp")
public interface MvneMnpIf {
	
	// new xVNE NPO
	@WebMethod(action="submitXvneNPO", operationName="XvneNPO")
	//@WebResult(partName="XvneMNPFrame")
	@WebResult(name="XvneMNPFrame")
	//@SOAPBinding(parameterStyle=ParameterStyle.BARE)
	XvneNPOResponse xvneNPO(XvneNPORequest xvneNpoReq) throws Exception;

/*	//service Disconnection
	@WebMethod(action="submitSD", operationName="SD" )
	@WebResult(partName="SDResponse")
	SDResponse submitSD(SDRequest sdReq)  throws Exception;*/
	
	/*	//NPO
	@WebMethod(action="submitNPO", operationName="NPO")
	@WebResult(partName="MvneMNPframe")
	NPOResponse submitNPO(NPORequest npoReq) throws Exception;*/

}