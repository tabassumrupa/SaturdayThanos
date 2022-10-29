//enter your age and fit that into a range. 
//Write a program that accepts user input from the console. 
//The program should take a number and then test for the following age ranges:
//0 to 10, 11 to 20, 21 to 30, 30 and over. Display a message in the Output window in the 
//following format:
//user_age + " is between 21 and 30"

package com.upskill.homework;
import java.util.Scanner;

public class HomeWork {

	static int a;
	
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		
		Scanner age = new Scanner(System.in);	
		
	    a = age.nextInt();
	    callAge();
		
	}
	
	public static void callAge(){

		if (a >= 0 && a <=10){
			System.out.println(a + " is between 0 and 10");	
		} 
		else if (a >= 11 && a <=20){
			System.out.println(a + " is between 11 and 20");
		} 
		else if (a >=21 && a <=30){
			System.out.println(a + " is between 21 and 30");
		} 
		else 
		{
			System.out.println(a + " is more than 30");
		}

	}

}
