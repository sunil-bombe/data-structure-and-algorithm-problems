package com.webwork.interview.leetcode.problems;

import java.util.PriorityQueue;

public class LongestHappyString {
	
	static class CharCount {
		char ch;
		int count;
		
		CharCount(char ch, int count){
			this.ch = ch;
			this.count = count;
		}
	}

	public static void main(String[] args) {

	}
	
	public String longestHappyString(int a, int b, int c) {
		PriorityQueue<CharCount> maxHeap = new PriorityQueue<>((x, y) -> y.count - x.count);
		return null;
		
	}

}


