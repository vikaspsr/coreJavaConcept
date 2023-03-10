package com.question3;

public class Address {

	private String state;
	
	private String city;
	
	private String pinCode;
	
	
	
	public Address() {
		
	}
	
	public Address(String state,String city,String pincode) {
		
		this.city=city;
		this.state=state;
		this.pinCode=pincode;
	}
	
	
	public String getState() {
		
		return state;
	}
	
	
}
