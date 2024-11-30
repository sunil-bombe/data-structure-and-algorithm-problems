package com.webwork.interview.problems;

public class Parent {
	
	private String name;
	
	private int age;
	
	protected void getParentDetails(String name , int age) {
		
		this.name = name;
		this.age = age;
		
		System.out.println(this.name +" "+ this.age);
		
	}
	

}
