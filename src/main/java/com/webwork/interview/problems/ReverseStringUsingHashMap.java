package com.webwork.interview.problems;

import java.util.HashMap;
import java.util.Map;

public class ReverseStringUsingHashMap {
	public static void main(String args[]) {
		String name = "Hello Good Morning";
		System.out.println(name);
		String reverseString = "";
		Map<Integer,Character> mapData = new HashMap<Integer,Character>();
		
		for(int i=0; i< name.length(); i++) {
			mapData.put(i, name.charAt(i));
		}
		
		for(int j = mapData.size()-1; j>=0; j--) {
			reverseString+=mapData.get(j);
		}
		System.out.println(reverseString);
	}
}
