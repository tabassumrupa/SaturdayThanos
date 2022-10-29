package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;

public class Array_Practice {

	public static void main(String[] args) {
		
		String [] name = new String [] {"Rupa", "Ava", "Taieba", "Saima", "Farzana"};
		//System.out.println("Student's name is " + name[3]);
		
		//System.out.println("Total number os student is " + name.length);
		
		HashMap <String, String > Country = new HashMap <String, String> ();
		
		Country.put("Dhaka", "Bangladesh");
		Country.put("NYC", "USA");
		Country.put("Sylhet", "Bangladesh");
		Country.put("Delhi", "India");
		
		//System.out.println("Country name is : " + Country.get("Dhaka"));
		
		HashSet<Integer> age = new HashSet<Integer>();
		
		age.add(15);
		age.add(22);
		age.add(45);
		
		System.out.println("Age are " + age);
		
		
		
		
		
	}
}
