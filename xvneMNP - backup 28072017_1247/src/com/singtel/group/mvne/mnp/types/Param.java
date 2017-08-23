package com.singtel.group.mvne.mnp.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Param")
@XmlAccessorType (XmlAccessType.FIELD)
public class Param {
	
	
	private String name;
	private String value;
	
	
	
	public Param() {
		// TODO Auto-generated constructor stub
	}
	
	public Param(String name, String value) {
		// TODO Auto-generated constructor stub		
		this.name=name;
		this.value=value;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	
/*	public static java.util.List getParam(String name, String val) {
		List param= new ArrayList<>();
		param.add(new Param(name, val));
		return param;		
	}*/
	
	
}
