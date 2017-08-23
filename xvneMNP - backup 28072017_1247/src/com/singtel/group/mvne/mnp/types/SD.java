package com.singtel.group.mvne.mnp.types;

public class SD {

	String MessageSenderTelco; 
	String MessageReceiverTelco; 
	String RequestId; // PortingRequestID.java
	//Timestamp Timestamp;
	String ReferenceId;
	String RecipientTelco;
	String DonorTelco;
	String SubscriberNumber;
	String ServiceType;
	String messageType;

	String Author;
	
	public SD() {
		// TODO Auto-generated constructor stub
	}

	public SD(String messageSenderTelco, String messageReceiverTelco, String requestId, String referenceId,
			String recipientTelco, String donorTelco, String subscriberNumber, String serviceType, String messageType,
			String author) {
		super();
		MessageSenderTelco = messageSenderTelco;
		MessageReceiverTelco = messageReceiverTelco;
		RequestId = requestId;
		ReferenceId = referenceId;
		RecipientTelco = recipientTelco;
		DonorTelco = donorTelco;
		SubscriberNumber = subscriberNumber;
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

	
	
}
