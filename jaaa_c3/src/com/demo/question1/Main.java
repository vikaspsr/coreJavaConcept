package com.demo.question1;

public class Main {
	
	
	
	public static void main(String[] args) {
	
		
		
		Loan loanobjLoan=new Loan();
		
		PermanentEmployee empPermanentEmployee= new PermanentEmployee(1, "PermanentEmployeeq",100.0);
		
		empPermanentEmployee.calculateSalary();
		
		
		double loanAmout=loanobjLoan.calculateLoanAmoutn(empPermanentEmployee) ;
		
		System.out.println(loanAmout);
		
		
		TemporaryEmployee temporaryEmployee=  new TemporaryEmployee(2, "empTemporary", 10, 10);
		
		temporaryEmployee.calculateSalary();
		
		System.out.println(loanobjLoan.calculateLoanAmoutn(temporaryEmployee));
		
		
		System.out.println(loanobjLoan.calculateLoanAmoutn(null));
		
		
		
		
	}

}
