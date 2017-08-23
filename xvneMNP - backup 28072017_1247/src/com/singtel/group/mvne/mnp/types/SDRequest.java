package com.singtel.group.mvne.mnp.types;

import java.sql.Timestamp;

/**
 * @author achaudhary
 *
 */
public class SDRequest {

	String MessageSenderTelco; 
	String MessageReceiverTelco; 
	String RequestId; // PortingRequestID.java
	//Timestamp Timestamp;
	String ReferenceId;
	/*String RecipientTelco;
	String DonorTelco;*/
	String SubscriberNumber;
	String ServiceType;
	/*String OwnerName;
	String OwnerId;
	String TypeOFId;*/
	String Author;
	
	
	
	public SDRequest() {
		// TODO Auto-generated constructor stub
	}


	

	@Override
	public String toString() {
		return "NPORequest [MessageSenderTelco=" + MessageSenderTelco + ", MessageReceiverTelco=" + MessageReceiverTelco
				+ ", RequestId=" + RequestId + ", Timestamp=" + "timeStamp" + ", ReferenceId=" + ReferenceId
				+ ", RecipientTelco=" /*+ RecipientTelco + ", DonorTelco=" + DonorTelco*/ + ", SubscriberNumber="
				+ SubscriberNumber + ", ServiceType=" + ServiceType + ", OwnerName=" +/* OwnerName + ", OwnerId="
				+ OwnerId + ", TypeOFId=" + TypeOFId + */", Author=" + Author + "]";
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



/*	public Timestamp getTimestamp() {
		return Timestamp;
	}



	public void setTimestamp(Timestamp timestamp) {
		Timestamp = timestamp;
	}*/



	public String getReferenceId() {
		return ReferenceId;
	}



	public void setReferenceId(String referenceId) {
		ReferenceId = referenceId;
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




	public String getAuthor() {
		return Author;
	}



	public void setAuthor(String author) {
		Author = author;
	}
	
	
	
	
	

}
