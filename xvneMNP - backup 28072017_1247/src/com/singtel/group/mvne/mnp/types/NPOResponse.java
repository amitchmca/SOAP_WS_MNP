package com.singtel.group.mvne.mnp.types;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MvneMNP" )
public class NPOResponse {

	
	String MessageSenderTelco; 
	String MessageReceiverTelco; 
	String RequestId; // PortingRequestID.java
	Timestamp Timestamp;
	String ReferenceId;
	
	String RecipientTelco;
	String DonorTelco;
	String SubscriberNumber;
	String ServiceType;
/*	String OwnerName;
	String OwnerId;
	String TypeOFId;*/
	
	String ResultCode;
	String ResultText;
	
	public NPOResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getMessageSenderTelco() {
		return MessageSenderTelco;
	}

	public void setMessageSenderTelco(String messageSenderTelco) {
		MessageSenderTelco = messageSenderTelco;
	}

	public String getMessageReceiverTelco() {
		return MessageReceiverTelco;
	}

	public void setMessageReceiverTelco(String messageReceiverTelco) {
		MessageReceiverTelco = messageReceiverTelco;
	}

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	public Timestamp getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		Timestamp = timestamp;
	}

	public String getReferenceId() {
		return ReferenceId;
	}

	public void setReferenceId(String referenceId) {
		ReferenceId = referenceId;
	}

	public String getRecipientTelco() {
		return RecipientTelco;
	}

	public void setRecipientTelco(String recipientTelco) {
		RecipientTelco = recipientTelco;
	}

	public String getDonorTelco() {
		return DonorTelco;
	}

	public void setDonorTelco(String donorTelco) {
		DonorTelco = donorTelco;
	}

	public String getSubscriberNumber() {
		return SubscriberNumber;
	}

	public void setSubscriberNumber(String subscriberNumber) {
		SubscriberNumber = subscriberNumber;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}

	public String getResultCode() {
		return ResultCode;
	}

	public void setResultCode(String resultCode) {
		ResultCode = resultCode;
	}

	public String getResultText() {
		return ResultText;
	}

	public void setResultText(String resultText) {
		ResultText = resultText;
	}

		
	
}
