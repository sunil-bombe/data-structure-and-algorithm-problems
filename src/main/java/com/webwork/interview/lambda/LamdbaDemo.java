package com.webwork.interview.lambda;

import com.webwork.interview.lambda.functionalInterfaces.Calculate;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LamdbaDemo {

	public static <Predicate> void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 10, d = 12;

		// Custom functional interface for addition
		Calculate cal = (a, b) -> a + b;

		int sum = cal.calculate(c, d);

		System.out.println("Sum: " + sum);

		// Using Predicate to check if an object is null
		java.util.function.Predicate<Object> predicate = value -> value == null;

		System.out.println("Is null? " + predicate.test(null)); // Example to test null

		// Using BiFunction to add two integers
		BiFunction<Integer, Integer, Integer> biFunction = (i, j) -> i + j;
		System.out.println("BiFunction result: " + biFunction.apply(c, d));

	}

}
