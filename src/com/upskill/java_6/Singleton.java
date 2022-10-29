package com.upskill.java_6;

public class Singleton {
	
	// Singleton is single class that can have only one object 
	
	// Private constructor, it prevents any other class from instantiating 
	
	private Singleton (){
		
	}
	
	// Private static object of the class
	private static Singleton SingLetonObj = new Singleton ();
	
	// Static instance method
	public static Singleton getInstance (){
		return SingLetonObj ;
	}
	
	protected static void demo (){
		System.out.println("Demo method for singleton class");
		
		
	}
}
