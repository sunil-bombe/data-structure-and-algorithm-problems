package com.webwork.interview.problems;

import java.util.Scanner;

public class InterviewQuestion {

	public static void main(String[] args) {
		String example;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		example = sc.nextLine();
		
		String[] exampleArray = example.split(" ");
		
		for(String tempExample: exampleArray) {
			char initialChar = tempExample.charAt(0);
			if(initialChar =='b' || initialChar=='B') {
				System.out.println(tempExample);
			}
		}
	
	}

}
