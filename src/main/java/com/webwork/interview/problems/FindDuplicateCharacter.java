package com.webwork.interview.problems;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateCharacter {
	
	public static void main(String args[]) {
		List<Character> characterList = new ArrayList<>();
		
		String message =" hello Good Morning Rahul!!";
		
		for(int i =0; i < message.length(); i++) {
			if(characterList.contains(message.charAt(i))) {
				System.out.println("Duplicate Character:"+ message.charAt(i));
			}else {
				characterList.add(message.charAt(i));
			}
		}
	}

}
