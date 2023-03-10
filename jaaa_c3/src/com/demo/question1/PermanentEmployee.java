package com.demo.question1;

import java.security.PublicKey;

public class PermanentEmployee extends Employee {
	
	  

	private double basicPay;

	@Override
	public void calculateSalary() {
		double pfAmount=basicPay*0.12;
		
		   salary=basicPay-pfAmount;
		  
		
		
	}

	public PermanentEmployee(Integer empId,String empName,double basicPay) {
		super(empId, empName);
		
		this.basicPay=basicPay;
	}
	
	
}
