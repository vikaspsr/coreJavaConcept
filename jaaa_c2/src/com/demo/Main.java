package com.demo;

import java.nio.channels.NonWritableChannelException;
import java.util.BitSet;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		String str1= "name1";
		String str2="name1";
		//System.out.println(str1==str2);
		
		//System.out.println(str1.equals("name1"));//its comare the reference
		
		
		String string1= new String("name1");
		String string2= new String("name1");
		
		//System.out.println(string1==string2);//its compare the reference of string 
		                                      //present inside the string pool area
		
		//System.out.println(string1.equals(string2));//its comapare the actual value not 
		                                            //the reference.
		
		Integer i=5;
		   Integer j=5;
		
	char c1='d';
		char c2='d';
		
		Boolean boolean1=true;
		Boolean boolean2=true;
		
		System.out.println(i.equals(j));
		
		
		
	System.out.println(boolean1.equals(j));
		
		
	}

}
