package com.upskill.assignment_2;

public class JavaAssignment_2_7 {
	int a = 25;
	int b = 30;
	
	public JavaAssignment_2_7 (int aS, int bS){
		b = aS ;
		a = bS;
	}

	public static void main(String[] args) {
		JavaAssignment_2_7 obj = new JavaAssignment_2_7 (25,30);
		System.out.println("Swap value of a = " + obj.a);
		System.out.println("Swap value of b = " + obj.b);
	}

}

//You are given two integer number (a=25, b=30), write a program to swap them and 
//display result on the screen