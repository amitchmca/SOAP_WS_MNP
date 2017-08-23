package com.singtel.group.mvne.mnp.types;

import java.sql.Timestamp;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="NPO")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType(propOrder= {"MessageSenderTelco", "MessageReceiverTelco",  "RequestId", "timeStamp", "ReferenceId", "RecipientTelco", "DonorTelco", "messageType", "ServiceType", "Author" })
public class NPO {

		String MessageSenderTelco; 
		String MessageReceiverTelco; 
		String RequestId; // PortingRequestID.java
		//Timestamp timeStamp;
		java.util.Calendar timeStamp;
		String ReferenceId;
		String RecipientTelco;
		String DonorTelco;
		String ServiceType;
		String messageType;
		String Author;
		
	public NPO() {
		// TODO Auto-generated constructor stub
	}

	/*public NPO(String messageSenderTelco, String messageReceiverTelco, String requestId, String referenceId,
			String recipientTelco, String donorTelco, List<String> subscriberNumber, String serviceType,
			String messageType, String author) {
		super();
		MessageSenderTelco = messageSenderTelco;
		MessageReceiverTelco = messageReceiverTelco;
		RequestId = requestId;
		ReferenceId = referenceId;
		RecipientTelco = recipientTelco;
		DonorTelco = donorTelco;
	//	SubscriberNumber = subscriberNumber;
		ServiceType = serviceType;
		this.messageType = messageType;
		Author = author;
	}*/


	public NPO(String messageSenderTelco, String messageReceiverTelco, String requestId, java.util.Calendar timestamp,
			String referenceId, String recipientTelco, String donorTelco, String serviceType, String messageType,
			String author) {
		super();
		MessageSenderTelco = messageSenderTelco;
		MessageReceiverTelco = messageReceiverTelco;
		RequestId = requestId;
		timeStamp = timestamp;
		ReferenceId = referenceId;
		RecipientTelco = recipientTelco;
		DonorTelco = donorTelco;
		ServiceType = serviceType;
		this.messageType = messageType;
		Author = author;
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

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public java.util.Calendar getTimestamp() {
		return timeStamp;
	}

	public void setTimestamp(java.util.Calendar timestamp) {
		timeStamp = timestamp;
	}

	
	
}
