package com.upskill.java_2;

public class IfElseStatement {
	
	static int age = 107;
	
	public static void main(String[] args) {
		age ();

	}
	
	//If Else Statement 
	
	public static void age (){
		if (age < 13){
			System.out.println("You are children");
		} else if (age > 13 && age < 18){
			System.out.println("You are teenager");
		} else if ( age >= 60){
			
			
			//Nested If Else Statement 
			if (age > 100)
			{
				System.out.println("You are Hero");
			} 
			else {
				System.out.println("You are senior citizen");
		} 
		} 
		else { 
		
			System.out.println("You are adult");
		}
		
	}

}
