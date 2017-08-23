package com.singtel.group.mvne.mnp.types;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SubscriberSequence")
@XmlAccessorType (XmlAccessType.FIELD)

public class SubscriberSequence {
	
	
	@XmlElement(name = "Subscriber")
    private List<String> subscriber = null;
	


	public SubscriberSequence() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SubscriberSequence(List<String> subscriber) {
		super();
		this.subscriber = subscriber;
	}


	public List<String> getSubscriber() {
		return subscriber;
	}


	public void setSubscriber(List<String> subscriber) {
		this.subscriber = subscriber;
	}



	
	
}
