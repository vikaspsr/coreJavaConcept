package com.demo;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the day to get day Name");
		
		
	    int day=scanner.nextInt();
		
		switch(day) {
		
		case 1:{
			System.out.println("Monday");
			break;
		}
		case 2:System.out.println("Tuesday");
		         break;
		         
		case 3:{
			System.out.println("Wednesday");
			break;
		}
		
		case 4:{
			System.out.println("Trusday");
			break;
		}
		case 5:{
			System.out.println("Friday");
			break;
		}
		case 6:{
			System.out.println("Studrday");
			break;
			
		}
		case 7:{
			System.out.println("Sunday");
			break;
		}
		default:{
			System.out.println("please enter the valid number");
		}
		
		
		}
		
		
		
		
		
		
	}
	
	

}
