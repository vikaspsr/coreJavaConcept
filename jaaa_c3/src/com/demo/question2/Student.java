package com.demo.question2;

public class Student {
	
	
	private String name;
	
	private int marks;
	
	public Student() {
		
	}
	
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public void setMarks(Integer marks) {
		this.marks=marks;
	}

	public int getMarks() {
		return marks;
	}



	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
