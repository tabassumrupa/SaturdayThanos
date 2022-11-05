package com.upskill.assignment_5;

public class JavaAssignment_5_1 {
	
	static int [] list = new int [] {12,99,45,2,78,44,31};
	
	public static void main(String[] args) {
	
		int maximum = list [0];
		for ( int i : list){
			if (i > maximum){
				maximum = i;
			}
		}
		System.out.println(maximum);
	}
	


}

//Write a method that returns the largest integer in the list. 
//You can assume that the list has at least one element
