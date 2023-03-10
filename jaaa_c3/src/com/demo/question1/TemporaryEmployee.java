package com.demo.question1;

public class TemporaryEmployee extends Employee {
	
	
	private int hourWork;
	
	private int hourlyWages;

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
     salary=(double) (hourlyWages*hourWork);
	     
	    
		
	}

	public TemporaryEmployee(Integer empId, String empName, int hourWork, int hourlyWages) {
		super(empId, empName);
		this.hourWork = hourWork;
		this.hourlyWages = hourlyWages;
	}
	
	
	
	
	

}
