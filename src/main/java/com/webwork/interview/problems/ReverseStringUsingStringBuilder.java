package com.webwork.interview.problems;

public class ReverseStringUsingStringBuilder {
	
	public static void main(String args[]) {
		
		String name = "Hello Good Night!";
		
		System.out.println(name);
		
		System.out.println(new StringBuilder(name).reverse().toString());
		
	}

}
