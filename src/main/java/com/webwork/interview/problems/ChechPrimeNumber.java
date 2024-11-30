package com.webwork.interview.problems;

public class ChechPrimeNumber {
	
	public static void main(String args[]) {
		int number = 11;
		boolean status = false;
		for(int i =2; i< number; i++) {
			if(number%i==0) {
				status = true;
			}
		}
		
		if(status) {
			System.out.println("Number is not a prime number!");
		}else {
			System.out.println("Number is a prime number!");
		}
	}

}
