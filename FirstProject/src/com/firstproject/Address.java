package com.firstproject;

public class Address {
	private Integer doorNo;
	private String street;
	private String state;
	private Integer pinNo;
	public Address(Integer doorNo, String street, String state, Integer pinNo) {
		this.doorNo = doorNo;
		this.street = street;
		this.state = state;
		this.pinNo = pinNo;
	}
	public Integer getDoorNo() {
		return doorNo;
	}
	public String getStreet() {
		return street;
	}
	public String getState() {
		return state;
	}
	public Integer getPinNo() {
		return pinNo;
	}
	
	
	

}
