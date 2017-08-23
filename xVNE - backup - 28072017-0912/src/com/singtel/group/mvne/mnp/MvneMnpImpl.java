package com.singtel.group.mvne.mnp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.jws.WebParam;

import com.singtel.group.mvne.mnp.types.Customer;
import com.singtel.group.mvne.mnp.types.Error;
import com.singtel.group.mvne.mnp.types.MVNO;
import com.singtel.group.mvne.mnp.types.Param;
import com.singtel.group.mvne.mnp.types.Params;
import com.singtel.group.mvne.mnp.types.PortDetails;
import com.singtel.group.mvne.mnp.types.Result;
import com.singtel.group.mvne.mnp.types.SubscriberSequence;
import com.singtel.group.mvne.mnp.types.XvneNPORequest;
import com.singtel.group.mvne.mnp.types.XvneNPOResponse;
import com.singtel.group.mvne.mnp.types.XvneNPOTRequest;
import com.singtel.group.mvne.mnp.types.XvneNPOTResponse;
import com.singtel.group.mvne.mnp.types.XvneSDRequest;
import com.singtel.group.mvne.mnp.types.XvneSDResponse;

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
	
	
	public XvneSDResponse xvneSD(XvneSDRequest xvneNpoReq) throws Exception {		
		return populateXvneSD();		
	}

	public XvneNPOTResponse xvneNPOT(XvneNPOTRequest npotReq)  throws Exception{
		return populateXvneNPOT();
	}
	
	
	
	XvneNPOTResponse populateXvneNPOT() throws XvneException{
			return new XvneNPOTResponse(populateNPOT(), populateMVNO(), populateSubSeq(), populateCustomer(),
					populateParams(), populateNPOTResult(), populateError());
			
		}
	
Result populateNPOTResult()  throws XvneException {
		
		Result result = new Result();
		result.setAction("Service Termination Done");
		result.setCode("NPOT");
		result.setDesc("Service Termination is recived by donor ");
		
		return result;
	}
	
	PortDetails populateNPOT() throws XvneException {
		PortDetails npo = new PortDetails();
		npo.setAuthor("Teleena");
		npo.setDonorTelco("001");
		npo.setMessageReceiverTelco("009"); //network to share the mvno code
		npo.setMessageSenderTelco("001");
		npo.setMessageType("NPOTResp");
		npo.setRecipientTelco("009"); //mvno code
		npo.setReferenceId("003-M-001-20170605-E9992");
		npo.setRequestId("999-06302542");
		npo.setServiceType("1");
		npo.setTimestamp(Calendar.getInstance());
		return npo;
	}
	
	 XvneSDResponse populateXvneSD() throws XvneException{
			return new XvneSDResponse(populateSD(), populateMVNO(), populateSubSeq(), populateCustomer(),
					populateParams(), populateSDResult(), populateError());			
		}

	Result populateSDResult()  throws XvneException {
		
		Result result = new Result();
		result.setAction("Disconnectoin Done");
		result.setCode("SD");
		result.setDesc("Service is disconnected  by donor ");
		
		return result;
	}

	PortDetails populateSD() throws XvneException {
		PortDetails npo = new PortDetails();

		npo.setAuthor("Teleena");
		npo.setDonorTelco("001");
		npo.setMessageReceiverTelco("009"); //network to share the mvno code
		npo.setMessageSenderTelco("001");
		npo.setMessageType("SDResp");
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
	
	XvneNPOResponse populateXvneNPOC() throws XvneException {
		return new XvneNPOResponse(populateNPO(), populateSubSeq(), populateCustomer(), populateMVNO(), populateParams(), populateResult(), populateError() );
	}
	
	PortDetails populateNPO() throws XvneException {
		PortDetails npo = new PortDetails();

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

	private void throwEx() throws Exception{
		// TODO Auto-generated method stub
		throw new MvneMnpException("Invalid Input", "Some Error");
	}
}
