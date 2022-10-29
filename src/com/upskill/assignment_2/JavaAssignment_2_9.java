package com.upskill.assignment_2;

public class JavaAssignment_2_9 {
	String a = "Talent";
	String b = "Tech";
	
	public JavaAssignment_2_9 (String aS, String bS){
		a = aS;
		b = bS;
	}

	public static void main(String[] args) {
		JavaAssignment_2_9 obj = new JavaAssignment_2_9 ("Tech", "Talent");
		System.out.println("New swap value of a = " + obj.a);
		System.out.println("New swap value of b = " + obj.b);
		

	}

}

//Write a program to swap two string variables (Talen, Tech) and display result on the screen
