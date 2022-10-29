package com.upskill.homework;

public class JavaAssignement_1 {

	public static void main(String[] args) {
		//1.A triangle three arms are: 5, 7 and 11 inches. 
		//Write a method to display the parameter of triangle in console output.
		triangle();
		
		//2.A rectangle width and length are: 9 and 13 inches. 
		//Write a method to display the parameter of rectangle in console output
		rectangle();
		
		//3.A function which returns the multiply value of a and b where a = 9 and b = 11.      
		//Write a program which will display addition of a +b + function returns value
		int a = 9;
		int b = 11;
		System.out.println("The value of the sum function is " + (sum(9,11)+a+b) + " inch.");
		
		//4.A function returns 30, another function returns 50. 
		//Write a java program which will display subtraction value from bigger number to smaller
		
		int subtraction = functionTwo() - functionOne();
		System.out.println("The value of subtraction function is " + subtraction + " inch.");
		
		//5.Write a java program which will display name and guestimated age of 
		//every students in your class.(write separate method for every student)
		System.out.println(meem() + " - " +ageMeem());
		System.out.println(amina() + " - " + ageAmina());
	
	}
	
	//1.
	public static void triangle (){
		int a = 5;
		int b = 7;
		int c = 11;
		int T = a+b+c;
		System.out.println("The parameter of the triangle is " + T + " inch.");
	}
	
	//2. 
	public static void rectangle (){
		int x = 9;
		int y = 13;
		int R = 2 * (x+y);
		System.out.println("The parameter of the rectangle is " + R + " inch.");
	}
	//3.
	public static int sum (int a, int b){
		return a*b;
	}
	//4.
	public static int functionOne(){
		return 30;
	}
	public static int functionTwo(){
		return 50;
	}
	//5.
	public static int ageMeem (){
		return 25;
	}
	public static int ageAmina (){
		return 27;
	}
	public static String amina(){
		return "amina";
	}
	public static String meem (){
		return "meem";
	}



}

