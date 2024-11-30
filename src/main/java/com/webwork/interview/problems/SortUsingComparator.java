package com.webwork.interview.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(70);
		list.add(80);
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(90);
		list.add(70);
		list.add(40);
		list.add(20);
		System.out.println("Before sorting: ");
		
		list.stream().forEach(System.out:: println);
		
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println("After sorting Ascending: ");
		
		list1.stream().forEach(System.out:: println);
		
	    System.out.println("After sorting Descending: ");
	    
	    
	    //To sort in decending order
	    // l1 = 10 and l2 = 20two number
	    // then comparator
	    // returns -ve if l1 comes before l2
	    // return +v if l1 comes after l2
	    // return 0 if l1 = l2
	    
	    List<Integer> list2 = list.stream().sorted((l1,l2) -> ((l1>l2) ? -1 : (l1<l2) ? 1 : 0)).collect(Collectors.toList());
		
		list2.stream().forEach(System.out:: println);
		
		  System.out.println("After sorting Ascending: ");
		
		 List<Integer> list3 = list.stream().sorted((l1,l2) -> l1.compareTo(l2)).collect(Collectors.toList());
			
		 list3.stream().forEach(System.out:: println);
		 
		 System.out.println("After sorting Decending: ");
			
		 List<Integer> list4 = list.stream().sorted((l1,l2) -> -l1.compareTo(l2)).collect(Collectors.toList());
			
		 list4.stream().forEach(System.out:: println);
		 
		 
		System.out.println("Min And Max values from the stream:");
		
		Integer min = list.stream().min((l1,l2)-> l1.compareTo(l2)).get();
		
		Integer max = list.stream().max((l1,l2)-> l1.compareTo(l2)).get();
		
		System.out.println("Min: "+min+" And Max: "+max);
		
		// conver list into Array
		
		Integer[] listArray = list.stream().toArray(Integer[]:: new);
		
		for(Integer i : listArray) {
			System.out.println(i);
		}
		
		
 	}

}
