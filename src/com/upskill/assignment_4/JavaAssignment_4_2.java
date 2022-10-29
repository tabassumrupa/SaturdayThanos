package com.upskill.assignment_4;

import java.util.Scanner;


public class JavaAssignment_4_2 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your String :");
		Scanner s = new Scanner (System.in);
		getBytes( s.nextLine());
		
		
	}
	
	public static void getBytes (String input){
		
		
		byte [] stringTobyte = input.getBytes();      // getBytes method here converting the string into byte array
		byte [] result = new byte [stringTobyte.length];    // here we are counting the byte array length and giving each string an array index
		
		for (int i = 0; i <stringTobyte.length; i ++)
			result [i] = stringTobyte [stringTobyte.length-i-1];    // here the for loop is reversing the byte array 
		
			System.out.println("The reverse string is : " + new String (result));   // here we are converting the reversed byte array to reversed string 
		
		
	}

}

//Write a method which will reverse a string
