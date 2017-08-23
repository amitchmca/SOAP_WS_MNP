package com.singtel.group.mvne.mnp.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Params")
@XmlAccessorType (XmlAccessType.FIELD)

public class Params {
	
	
	@XmlElement(name = "Param")
    private Param[] params = null;

	public Params(Param[] params) {
		super();
		this.params = params;
	}
	
	public Params() {
		super();
	}

	public Param[] getParams() {
		return params;
	}

	public void setParams(Param[] params) {
		this.params = params;
	}
	
	
	
	/*@XmlElement(name = "Param")
    private List<Param> params = null;
	


	public Params() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Params(List<Param> params) {
		super();
		this.params = params;
	}


	public List<Param> getParams() {
		return params;
	}


	public void setParams(List<Param> params) {
		this.params = params;
	}*/
	
	
	
}
