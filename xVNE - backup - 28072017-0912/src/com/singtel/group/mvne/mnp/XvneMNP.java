package com.singtel.group.mvne.mnp;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(name="XvneMNP", targetNamespace="http://group.singtel.com/xvne/mnp")
public interface XvneMNP {

	/*@WebMethod(action="submitNPO", operationName="NPO")
	@WebResult(partName="XvneMNPframe")
	NPOResponse xvneNPO(NPORequest npoReq) throws Exception;*/

	
	@WebMethod(action="Hello", operationName="hello")
	@WebResult(partName="HelloFrame")
	String hello();
}