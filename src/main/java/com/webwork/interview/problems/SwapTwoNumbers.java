package com.webwork.interview.problems;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		int a =5;

		int b = 10;
		
		System.out.println("A:"+a+" B:"+b);
		
		a = a+b;
		
		b = a-b;
		
		a = a-b;
		
		System.out.println("A:"+a+" B:"+b);
	}
}
