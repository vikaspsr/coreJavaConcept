package com.demo.question1;

public class Loan {
	
	
	public double calculateLoanAmoutn(Employee employee) {
		
	//	double loanAmount;
//		if(employee.getClass().getName().equals("PermanentEmployee")) {
//			
//			
//			 loanAmount=employee.salary*15/100;
//		}
//		else {
//			loanAmount=employee.salary*10/100;
//		}
//		
//		return loanAmount;
		
		
		
		if(employee instanceof PermanentEmployee) return employee.salary*0.15;
		else if(employee instanceof TemporaryEmployee) return employee.salary*0.10;
		else return -1;

		
		
	}

}
