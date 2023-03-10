package com.demo.question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner =new Scanner(System.in);
		List<Student> studentsList=new ArrayList();
		
		Integer numberOfStudent=scanner.nextInt();
		
		
		for(int i=0;i<numberOfStudent;i++) {
			
			String sName=scanner.next();
			
			int  sMarks=scanner.nextInt();
			
			studentsList.add(new Student(sName, sMarks));
			
			
			
			
			
		}
		
		
		studentsList.forEach(s->System.out.println(s));
		
		int sumOfMarks=0;
		
		for(int i=0;i<studentsList.size();i++) {
			sumOfMarks+=studentsList.get(i).getMarks();
		}
		
		
		double avg=sumOfMarks/numberOfStudent;
		
		System.out.println("AverageMarks is :"+avg);
		
	}

}
