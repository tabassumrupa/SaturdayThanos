package com.upskil.java_3;

import com.upskill.java_2.MethodType;

public class Inheritance extends MethodType {      // Inheritance is the child class, MethodType is the parent class
	
/*
 * The process of obtaining the data members and methods from one class to another class is known as inheritance 
 - Single Inheritance 
 - Multiple Inheritance (Java doesn't support Multiple Inheritance directly rather through Inheritances) 
 - Multilevel Inheritance 
 */

	public static void main(String[] args) {
		Inheritance obj = new Inheritance ();    // Child class object 
		obj.annualIncomeVoid();
		obj.WeeklyIncomeVoid();

	}

}
