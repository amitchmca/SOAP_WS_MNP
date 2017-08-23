package com.singtel.group.mvne.mnp;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.singtel.group.mvne.mnp.types.SDRequest;
import com.singtel.group.mvne.mnp.types.SDResponse;
import com.singtel.group.mvne.mnp.types.XvneNPORequest;
import com.singtel.group.mvne.mnp.types.XvneNPOResponse;


@WebService(endpointInterface="com.singtel.group.mvne.mnp.MvneMnpIf", portName="MvneMnpPort", serviceName="SingtelXvneMnpService")
public class MvneMnp implements MvneMnpIf {

	MvneMnpImpl mvneMnpImpl = new MvneMnpImpl();

	@Override
	public XvneNPOResponse xvneNPO(@WebParam(partName="XvneNPORequest") XvneNPORequest xvneNpoReq) throws Exception{
		return mvneMnpImpl.xvneNPO(xvneNpoReq);
	}
	
/*	@Override
	public SDResponse submitSD(@WebParam(partName="SDRequest") SDRequest sdReq){
		return mvneMnpImpl.mvneSD(sdReq);
	}*/
		
	/*// Termination
	@WebMethod(action="submitNPOT", operationName="submitNPOT")
	@WebResult(partName="NPOTResponse")
	public NPOTResponse submitNPOT(@WebParam(partName="NPOTRequest") NPOTRequest npotReq){
		return mvneMnpImpl.mvneNPOT(npotReq);
	}
	*/
	
/*	@Override
	public NPOResponse submitNPO(@WebParam(partName="NPORequest") NPORequest npoReq) throws Exception{
		return mvneMnpImpl.mvneNPO(npoReq);
	}*/
	
}
