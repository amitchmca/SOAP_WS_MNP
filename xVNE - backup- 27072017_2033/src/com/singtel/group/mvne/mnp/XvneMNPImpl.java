package com.singtel.group.mvne.mnp;

import javax.jws.WebService;

@WebService(endpointInterface="com.singtel.group.xvne.mnp.XvneMNP", portName="XvneMNPPort", serviceName="SingtelXvneMNPService")
public class XvneMNPImpl implements XvneMNP {
	
/*	int count=1;
	NPOResponse npo;
	*/
	public XvneMNPImpl() {
	}
	
	@Override
	public String hello() {		
		return "Hello Yes ";
	}
	
/*
	@Override
	public NPOResponse xvneNPO(NPORequest npoReq) throws Exception {
		try {
			if((count++)%2==0)
				throwEx();
						
		}catch(XvneException ex) {
			throw new XvneException("Invalid Input", "Some Error");
		}
		return sendNPOC();
		
	}
	
	private void throwEx() throws Exception{
		throw new XvneException("Invalid Input", "Some Error");
	}
	
	NPOResponse sendNPOC() throws XvneException {
		return populateNPOC();
	}
	
	NPOResponse populateNPOC() throws XvneException {
		return new NPOResponse(populateNPO(), populateCustomer(), populateMVNO(), populateParams(), populateResult() );
	}
	
	NPO populateNPO(){
		NPO npo = new NPO();

		npo.setAuthor("BCC OMS");
		npo.setDonorTelco("001");
		npo.setMessageReceiverTelco("009"); //network to share the mvno code
		npo.setMessageSenderTelco("001");
		npo.setMessageType("NPOC");
		npo.setRecipientTelco("009"); //mvno code
		npo.setReferenceId("003-M-001-20170605-E9992");
		npo.setRequestId("999-06302542");
		npo.setServiceType("1");
		
		List<String> subscirberNumbers= new ArrayList<String>();
		subscirberNumbers.add("6597990809");
		npo.setSubscriberNumber(subscirberNumbers);		
		
		return npo;
	}
	
	Customer populateCustomer(){
		Customer cust = new Customer();
		cust.setOwnerId("A1234567B");
		cust.setOwnerName("TomDickHarry");
		cust.setTypeOfId(1);
		return cust;
	}
	
	MVNO populateMVNO(){
		
		MVNO mvno = new MVNO();
		mvno.setName("Teleena");
		mvno.setCode("021");
				
		return mvno;		
	}
	
	List<Params> populateParams() {
		List<Params> paramlist= new ArrayList<Params>();
		
		Params param1 = new Params();
		param1.setName("ExtraParamName1");
		param1.setValue("Extra1");
		Params param2 = new Params();
		param1.setName("ExtraParamName2");
		param1.setValue("Extra2");
		
		paramlist.add(param1);
		paramlist.add(param2);
		
		return paramlist;
		
	}
	
	Result populateResult() {
		
		Result result = new Result();
		result.setAction("NPO Confirm");
		result.setCode("NPOC");
		result.setDesc("Port request is accepted by donor ");
		
		return result;
	}*/
	
}
