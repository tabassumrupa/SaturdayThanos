package com.upskill.java_6;

public class myException extends Exception{
	
	String a;

	public myException (String b) {
		a=b;
	}
	
	public String demo (){
		return a;
	}

}
