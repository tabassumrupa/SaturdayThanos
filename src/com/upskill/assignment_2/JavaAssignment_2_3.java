package com.upskill.assignment_2;

public class JavaAssignment_2_3 {
	static int a = 45;
	static int b = 67;

	public static void main(String[] args) {
		compare ();
	}
	
	public static int bigNumber (){
		return a;
	}
	
	public static int smallNumber (){
		return b;
	}
	
	public static void compare (){
		if (bigNumber() > smallNumber()){
			System.out.println(a + " is bigger than " + b);
		} else {
			System.out.println(a + " is smaller than " +b);
		}
	}
}

//Write two java functions which will return two different integer values, write a 
//program to compare those numbers and send message that one number is bigger 
//than other. (hints: using if..else)
