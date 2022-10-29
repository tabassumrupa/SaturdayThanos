package com.upskill.java_1;


	// Variables in Java
	// Instance OR global variable - Variables declared in Class level, outside method
	// Static variables - Variables belong to class and don't require creating object
	// Local variables - Variables declared in methods
	// Method parameter - Variables used as method parameter, pass value  


public class Variables {
	
	String country = "USA"; //Global variables 
	
	static String name = "Rupa"; //Static variables 

	public static void main(String[] args) {
		
		String city = "NYC"; //Local variables 	
		myMethod2("Queens"); 

	}

	public static void myMethod (){
		
		String city = "Long Island"; //Local variables
	}
	
	public static void myMethod2(String county){  //Method parameter
		
		String city ="Bloomfield"; //Local variables
		System.out.println("Method Parameter ::: " + county );
	}
}
