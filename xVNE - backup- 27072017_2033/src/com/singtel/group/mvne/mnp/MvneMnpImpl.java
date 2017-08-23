package com.singtel.group.mvne.mnp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.singtel.group.mvne.mnp.types.Customer;
import com.singtel.group.mvne.mnp.types.MVNO;
import com.singtel.group.mvne.mnp.types.NPO;
import com.singtel.group.mvne.mnp.types.NPORequest;
import com.singtel.group.mvne.mnp.types.NPOResponse;
import com.singtel.group.mvne.mnp.types.Param;
import com.singtel.group.mvne.mnp.types.Params;
import com.singtel.group.mvne.mnp.types.Result;
import com.singtel.group.mvne.mnp.types.Error;
import com.singtel.group.mvne.mnp.types.SDRequest;
import com.singtel.group.mvne.mnp.types.SDResponse;
import com.singtel.group.mvne.mnp.types.SubscriberSequence;
import com.singtel.group.mvne.mnp.types.XvneNPORequest;
import com.singtel.group.mvne.mnp.types.XvneNPOResponse;

public class MvneMnpImpl {

	static int count=1;
	
	
	
	
	public XvneNPOResponse xvneNPO(XvneNPORequest xvneNpoReq) throws Exception {
		/*try {
			if((count++)%2==0)
				throwEx();
						
		}catch(XvneException ex) {
			throw new XvneException("Invalid Input", "Some Error");
		}*/
		return populateXvneNPOC();
		
	}
	
	/*	
	//public Object mvneNPO(NPORequest npoReq) {
		public NPOResponse mvneNPO(NPORequest npoReq) throws Exception {
			try {
				if(count++/2==0)
					throwEx();
							
			}catch(MvneMnpException ex) {
				throw new MvneMnpException("Invalid Input", "Some Error");
			}
			return sendNPOC();
			
		}
		*/
		private void throwEx() throws Exception{
			// TODO Auto-generated method stub
			throw new MvneMnpException("Invalid Input", "Some Error");
		}

				//public Object mvneNPO(NPORequest npoReq) {
				public SDResponse mvneSD(SDRequest sdReq) {
					System.out.println(sdReq);
					//System.out.println(npoReq.toString());
					/*if(count++%2==0)
						return new NPOResponse().sendNPOC();*/
					//return sendNPOR();
					return sendSDRespSuccess();
				}
				
				
		
	
/*	public NPOResponse mvneNPO(String s) {
		System.out.println(s);
		return sendNPOR();
	}*/
	
	NPOResponse sendNPOR() {
		return populateNPOR();
	}
	
	NPOResponse sendNPOC() throws MvneMnpException, XvneException {
		return populateNPOC();
	}
	
	NPOResponse populateNPOR(){
		NPOResponse npor = new NPOResponse();
		npor.setMessageReceiverTelco("002");
		npor.setMessageSenderTelco("999");
		npor.setRequestId("002-00004567");
		npor.setReferenceId("003-M-002-20070701-A0001");
		npor.setTimestamp(new java.sql.Timestamp(System.currentTimeMillis()));
		npor.setSubscriberNumber("900010001");
		npor.setResultCode("1");
		npor.setResultText("Owner Id not match");
		
		return npor;
	}
	
	NPOResponse populateNPOC(){
		NPOResponse npoc = new NPOResponse();
		npoc.setMessageReceiverTelco("002");
		npoc.setMessageSenderTelco("999");
		npoc.setRequestId("002-00004567");
		npoc.setReferenceId("003-M-002-20070701-A0001");
		npoc.setTimestamp(getTimeStamp());
		npoc.setSubscriberNumber("900010001");
		npoc.setResultCode("1");
		npoc.setResultText("Success");
		
		return npoc;
	}
	
	public  java.sql.Timestamp getTimeStamp(){
		// 1) create a java calendar instance
		Calendar calendar = Calendar.getInstance();

		// 2) get a java.util.Date from the calendar instance.
//		    this date will represent the current instant, or "now".
		java.util.Date now = calendar.getTime();

		// 3) a java current time (now) instance
		java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
		
		return currentTimestamp;
		
	}
	
	SDResponse sendSDRespSuccess() {
		
		SDResponse sd = new SDResponse();
		sd.setMessageReceiverTelco("002");
		sd.setMessageSenderTelco("999");
		sd.setRequestId("002-00004567");
		sd.setReferenceId("003-M-002-20070701-A0001");
		sd.setTimestamp(new java.sql.Timestamp(System.currentTimeMillis()));
		sd.setSubscriberNumber("900010001");
		sd.setResultCode("1");
		sd.setResultText("Servcie Disconnected");
		
		return sd;
	}

	SDResponse sendSDRespFailure() {
		SDResponse sd = new SDResponse();
		sd.setMessageReceiverTelco("002");
		sd.setMessageSenderTelco("999");
		sd.setRequestId("002-00004567");
		sd.setReferenceId("003-M-002-20070701-A0001");
		sd.setTimestamp(new java.sql.Timestamp(System.currentTimeMillis()));
		sd.setSubscriberNumber("900010001");
		sd.setResultCode("2");
		sd.setResultText("Service can not be disconnected");
		return sd;
	}

	
	
	//Amit
	
	XvneNPOResponse populateXvneNPOC() throws XvneException {
		return new XvneNPOResponse(populateNPO(), populateSubSeq(), populateCustomer(), populateMVNO(), populateParams(), populateResult(), populateError() );
	}
	
	NPO populateNPO() throws XvneException {
		NPO npo = new NPO();

		npo.setAuthor("Teleena");
		npo.setDonorTelco("001");
		npo.setMessageReceiverTelco("009"); //network to share the mvno code
		npo.setMessageSenderTelco("001");
		npo.setMessageType("NPOC");
		npo.setRecipientTelco("009"); //mvno code
		npo.setReferenceId("003-M-001-20170605-E9992");
		npo.setRequestId("999-06302542");
		npo.setServiceType("1");
		
		//Calendar calendar = Calendar.getInstance();
	   // java.sql.Timestamp timeStamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
	   // npo.setTimestamp(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
		npo.setTimestamp(Calendar.getInstance());
		
		return npo;
	}
	
	SubscriberSequence populateSubSeq()  throws XvneException {
		SubscriberSequence subscriberSequence = new SubscriberSequence();
		List<String> subSeq = new ArrayList<String>();
		subSeq.add("6597990809");		
		subscriberSequence.setSubscriber(subSeq);
		return subscriberSequence;
		
	}
	
	Customer populateCustomer() throws XvneException {
		Customer cust = new Customer();
		cust.setOwnerId("A1234567B");
		cust.setOwnerName("TomDickHarry");
		cust.setTypeOfId(1);
		return cust;
	}
	
	MVNO populateMVNO() throws XvneException {
		
		MVNO mvno = new MVNO();
		mvno.setName("Teleena");
		mvno.setCode("021");
				
		return mvno;		
	}
	
	Params populateParams()  throws XvneException {
		
		/*List<Params> paramlist= new ArrayList<Params>();		
		Params param1 = new Params();
		param1.setName("ExtraParamName1");
		param1.setValue("Extra1");
		Params param2 = new Params();
		param1.setName("ExtraParamName2");
		param1.setValue("Extra2");		
		paramlist.add(param1);
		paramlist.add(param2);		
		return paramlist;*/
		
		/*List<List<Param>> paramlist= new ArrayList<List<Param>>();
		
		paramlist.add(Param.getParam("Param1", "value1"));
		paramlist.add(Param.getParam("Param2", "value2"));
		
		return paramlist;*/
		
		List<Param> paramlist= new ArrayList<Param>();	
		
		Params params=new Params();
		Param param1 = new Param();
		param1.setName("ExtraParamName1");
		param1.setValue("Extra1");
		Param param2 = new Param();
		param1.setName("ExtraParamName2");
		param1.setValue("Extra2");
		
		paramlist.add(param1);
		paramlist.add(param2);
		params.setParams(paramlist);
		
		return params;
		
	}
	
	Result populateResult()  throws XvneException {
		
		Result result = new Result();
		result.setAction("NPO Confirm");
		result.setCode("NPOC");
		result.setDesc("Port request is accepted by donor ");
		
		return result;
	}

	Error populateError()  throws XvneException {
		Error error = new Error();
		error.setErrCode("NONE");
		error.setErrDesc("No error");
		error.setErrAction("NPO faces no error");
		//error.setErrString("nothind");
		return error;		
	}
}
