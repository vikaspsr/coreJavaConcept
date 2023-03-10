package com.question6;

import javax.lang.model.element.NestingKind;

public class Demo {
	
	
	public static String returnPartOfSting(String string,int N) {
		
		
	return	string.substring(0,N);
		
		

	}
	
	
	
	public static void main(String[] args) {
		
		
		String string="abcdefghijklmnopqrstuvwxyz";
		
		String resultantString=Demo.returnPartOfSting(string, 3);
		
		System.out.println(resultantString);
		
		
	}

}
