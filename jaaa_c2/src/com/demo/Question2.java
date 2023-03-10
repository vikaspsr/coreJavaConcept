package com.demo;

public class Question2 {
	
	
	public static void main(String[] args) {
		//String immutability means once String object is created its values can 
		//not be change.
		
		String string1="hello";
		
		String concatString=string1.concat("world");//here contamination does not change the value 
		//of the string //it will create a new String.
		
		//System.out.println(concatString);
		//System.out.println(string1);
		
		
		String upperCaseString=string1.toUpperCase();
		
		System.out.println(string1);
		System.out.println(upperCaseString);
	
	//here string1 is still same its values is not change.	
		
		
	}

}
