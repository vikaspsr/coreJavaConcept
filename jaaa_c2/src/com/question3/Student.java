package com.question3;

import java.net.Inet4Address;

public class Student {
	
	private int roll;
	private String name;
	private Address address;//here Student has a reference of the address.
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

}
