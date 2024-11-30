package com.webwork.interview.problems;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Hello Good Morning";
		System.out.println(name);
		String reverseString = "";
		
		for(int i= name.length()-1; i>=0; i--) {
			reverseString=reverseString+name.charAt(i);
		}
		System.out.println(reverseString);

	}

}
