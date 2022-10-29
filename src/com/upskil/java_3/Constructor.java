package com.upskil.java_3;

public class Constructor {
	
	// Constructor is instance of class, method name same as class name, java will execute constructor first
	// - Constructor can not be static or override nor void or return type.
	// - Default Constructor: No constructor is initialized 
	// - Parameterized Constructor: Add different signature 
	// - Constructor overloading: Different signature 
	
	String admin;
	int adAge;
	
	public Constructor (String name, int age){
		admin = name;
		adAge = age;
	}
	
	public Constructor (int a, String b){
		admin = b;
		adAge = a;
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor (29,"Rupa");
		System.out.println(obj.adAge);
		System.out.println(obj.admin);

	}

}
