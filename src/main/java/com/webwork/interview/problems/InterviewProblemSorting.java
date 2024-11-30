package com.webwork.interview.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterviewProblemSorting {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Ganesh",23));
		employeeList.add(new Employee("Rajesh",24));
		employeeList.add(new Employee("Ramesh",24));
		employeeList.add(new Employee("Sahil",27));
		employeeList.add(new Employee("Rahul",48));
		
		System.out.println("Before Sort");
		
	    employeeList.stream().forEach(item -> System.out.print(item.getName() +"\n" + item.getAge()+"\n"));
	    
	   Collections.sort(employeeList, Comparator.comparing(Employee:: getAge).thenComparing(Employee:: getName));
	   System.out.println("After Sort");
	    		
	   employeeList.stream().forEach(item -> System.out.print(item.getName() +"\n" + item.getAge()+"\n"));
	   http://localhost:8000
	   	System.out.println(5 == 6 ? 8 : 9 );

	}

}


 class Employee {
	 private String name;
	 private int age;
	 
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	 
 }