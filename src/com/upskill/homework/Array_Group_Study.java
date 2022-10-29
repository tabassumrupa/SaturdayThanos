package com.upskill.homework;

import java.util.HashMap;

public class Array_Group_Study {

	

	public static void main(String[] args) {
		//String name = "Student";
		String [] StudentName = new String [] {"Sami" , "Emad", "Saima", "Taeba", "Anis"};  //Single Array
	
		
		
		String [] [] StudentName2D = {{"Sami" , "Emad", "Saima", "Taeba", "Anis"},   //2D Array 
				                      {"Rasel", "Ava", "Farzana"}};
		//System.out.println("Student name is " + StudentName2D  [1][1]);
		
		HashMap <String, String> Country = new HashMap <String, String> ();
		
		Country.put("Dhaka", "Bangladesh");
		Country.put("Islamabad", "Pakistan");
		
		System.out.println("The name of the country is "+ Country.get("Islamabad"));
		}
	

	}
	



