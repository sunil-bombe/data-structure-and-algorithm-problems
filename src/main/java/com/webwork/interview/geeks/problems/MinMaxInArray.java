package com.webwork.interview.geeks.problems;

public class MinMaxInArray {

	public static void main(String[] args) {
		  int[] array = {10, 5, 7, 2, 8, 15};

	        findMinMax(array);
	}
	
	public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max);
    }

}
