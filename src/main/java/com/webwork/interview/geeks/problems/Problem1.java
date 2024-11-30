package com.webwork.interview.geeks.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given two strings wild and pattern. Determine if the given two strings can be matched given that, wild string may contain * and ? but string pattern will not. * and ? can be converted to another character according to the following rules:
 * --> This character in string wild can be replaced by any sequence of characters, it can also be replaced by an empty string.
 * --> This character in string wild can be replaced by any one character.
 * @author sunilbombe
 *
 */
public class Problem1 {

	public static void main(String[] args) {
		       match("g*ge?ks*","geeksforgeeks");

	}
	
	 public static boolean match(String wild, String pattern)
	    {
		 
		 Pattern PATTERN_NON_ALPHNUM_USASCII = Pattern.compile("[^a-zA-Z0-9]+");
		
	        int wildLength = wild.length();
	        int patternLength = pattern.length();
	        for(int i=0; i< patternLength; i++){
	        	if(i<wildLength) {
	            if(wild.charAt(i) != pattern.charAt(i)){
	            
	            	char to = wild.charAt(i);
	                char replace = pattern.charAt(i);
	            	Matcher matcher = PATTERN_NON_ALPHNUM_USASCII.matcher(String.valueOf(to));
	            	if(matcher.find()) {
	            		
	            	}else {
	            		if(i!=0) {
	                     wild = wild.replace(to, replace);
	            		}
	            	}
	            }
	        	}else {
	        		char replace = pattern.charAt(i);
	        		wild = wild+replace;
	        	}
	            
	        }
	        if(wild.toLowerCase().equals(pattern.toLowerCase())){
	            System.out.println("Yes");
	            return true;
	        }else{
	              System.out.println("No");
	            return false;
	        }
	    }

}
