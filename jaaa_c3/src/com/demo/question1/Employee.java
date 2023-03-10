package com.demo.question1;

public abstract class Employee {
	
    Integer employeeId;
	
    String employeeName;
	
     Double salary;

	
	public Employee(Integer empId,String empName) {
		
		
		this.employeeId=empId;
		
		this.employeeName=empName;
	}
	
	
	public abstract void calculateSalary();


	

}
