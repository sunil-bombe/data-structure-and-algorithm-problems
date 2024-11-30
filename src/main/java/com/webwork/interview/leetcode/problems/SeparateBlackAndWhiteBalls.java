package com.webwork.interview.leetcode.problems;

public class SeparateBlackAndWhiteBalls {

	public static void main(String[] args) {

		String s = "1100110";

		char[] text = s.toCharArray();

		for (char t : text) {
			System.out.print(t);
		}

		for (int j = 0; j < text.length; j++) {
			for (int i = 0; i < text.length - 1; i++) {
				if ((text[i] == '1') && (text[i + 1] == '0')) {
					char temp = text[i];
					text[i] = text[i + 1];
					text[i + 1] = temp;
				}
			}
		}
		System.out.println();

		
		System.out.println(String.valueOf(text));
		
		

	
	}

}
