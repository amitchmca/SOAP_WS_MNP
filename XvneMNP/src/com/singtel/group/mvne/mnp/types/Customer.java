package com.singtel.group.mvne.mnp.types;

public class Customer {
	
	String ownerName;
	String ownerId;
	int typeOfId;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String ownerName, String ownerId, int typeOfId) {
	
		this.ownerName=ownerName;
		this.ownerId=ownerId;
		this.typeOfId=typeOfId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public int getTypeOfId() {
		return typeOfId;
	}

	public void setTypeOfId(int typeOfId) {
		this.typeOfId = typeOfId;
	}

	
	
}
