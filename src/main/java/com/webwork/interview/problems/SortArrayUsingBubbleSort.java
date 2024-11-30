package com.webwork.interview.problems;

public class SortArrayUsingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = {1,4,6,8,3,5,9,2};
		System.out.println("Before Sort");
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for(int i =0; i<numbers.length; i++) {
			for(int j =0; j<numbers.length; j++) {
				if(numbers[i]<numbers[j]) {
					numbers[i] = numbers[j];
				}
			}
			
		}
		
		System.out.println("After Sort");

		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
