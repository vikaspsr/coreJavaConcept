package com.demo;

public class Demo {
	
	
	
	
	public static void main(String[] args) {
		
		int i=1;
		int count=0;
		
		do {
			if(i%2==0) {
				System.out.println(i);
			
				count++;
				
				i++;
			}else {
				i++;
				continue;
				
			}
			
			
		} while (count<10);
		
		
		
	}

}
