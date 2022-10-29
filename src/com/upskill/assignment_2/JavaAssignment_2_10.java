package com.upskill.assignment_2;

public class JavaAssignment_2_10 {
	float C ;
	
	public JavaAssignment_2_10 (float F){
		
		C  = (float) ((F - 32)* 0.556);
	}

	public static void main(String[] args) {
		
		JavaAssignment_2_10 obj = new JavaAssignment_2_10 (45);
			System.out.println("The converted temperature in Celcius is = " + obj.C);
	

	}

}

//Write a Java program to convert temperature from Fahrenheit to Celsius degree