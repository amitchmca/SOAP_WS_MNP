package com.singtel.group.mvne.mnp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.singtel.group.mvne.mnp.types.XvneNPORequest;
import com.singtel.group.mvne.mnp.types.XvneNPOResponse;
import com.singtel.group.mvne.mnp.types.XvneNPOTRequest;
import com.singtel.group.mvne.mnp.types.XvneNPOTResponse;
import com.singtel.group.mvne.mnp.types.XvneSDRequest;
import com.singtel.group.mvne.mnp.types.XvneSDResponse;

@WebService(name="XvneMNP", targetNamespace="http://group.singtel.com/mvne/mnp", endpointInterface="com.singtel.group.mvne.mnp.MvneMnp", portName="MvneMnpPort", serviceName="SingtelXvneMnpService")
//@WebService(endpointInterface="com.singtel.group.mvne.mnp.MvneMnpIf", portName="MvneMnpPort", serviceName="SingtelXvneMnpService")
public class MvneMnp /*implements MvneMnpIf */{

	MvneMnpImpl mvneMnpImpl = new MvneMnpImpl();

	/*@Override
	public XvneNPOResponse xvneNPO(@WebParam(partName="XvneNPORequest") XvneNPORequest xvneNpoReq) throws Exception{
		return mvneMnpImpl.xvneNPO(xvneNpoReq);
	}
	
	@Override
	public XvneSDResponse xvneSD(@WebParam(partName="SDRequest") XvneSDRequest sdReq) throws Exception{
		return mvneMnpImpl.xvneSD(sdReq);
	}
		
	// Termination
	@Override
	public XvneNPOTResponse submitNPOT(@WebParam(partName="NPOTRequest") XvneNPOTRequest npotReq)  throws Exception{
		return mvneMnpImpl.xvneNPOT(npotReq);
	}*/
	
	@WebMethod(action="submitXvneNPO", operationName="XvneNPO")
	@WebResult(name="XvneMNPFrame")	
	public XvneNPOResponse xvneNPO(@WebParam(partName="XvneNPORequest") XvneNPORequest xvneNpoReq) throws Exception{
		return mvneMnpImpl.xvneNPO(xvneNpoReq);
	}
	
	@WebMethod(action="submitXvneSD", operationName="XvneSD" )
	@WebResult(name="XvneMNPFrame")
	public XvneSDResponse xvneSD(@WebParam(partName="SDRequest") XvneSDRequest sdReq) throws Exception{
		return mvneMnpImpl.xvneSD(sdReq);
	}
		
	// Termination
	@WebMethod(action="submitXvneNPOT", operationName="XvneNPOT")
	@WebResult(name="MvneMNPframe")
	public XvneNPOTResponse xvneNPOT(@WebParam(partName="NPOTRequest") XvneNPOTRequest npotReq)  throws Exception{
		return mvneMnpImpl.xvneNPOT(npotReq);
	}

}
