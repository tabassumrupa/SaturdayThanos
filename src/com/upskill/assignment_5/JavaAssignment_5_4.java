package com.upskill.assignment_5;

import java.util.Scanner;

public class JavaAssignment_5_4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter your letter : ");
		System.out.println("The replaced letter is : " + decode (s.next()));

	}
	
	public static String decode (String code){
		String decoded = "";
		int lastCharValue = 'z';  //converting to index value where a = 0
		int alphabetLength = 'z' - 'a' + 1; //total number of alphabet = 26
		for ( char character : code.toCharArray ()){  //change the char value to integer value (index array)
			int charNoRotation = character + 5;
			int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength ;
			// variable = (statement) ? true : false (work like if else) 
			decoded += ((char) charValue ); //converting the int index value to char value 
		}
		return decoded;
	}

}

//The Ceasar cipher is a basic encryption technique used by 
//Julius Ceasar to securely communicate with his generals. 
//Each letter is replaced by another letter N positions down the english alphabet. 
//For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'. 
//In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
//Implement a decoder for the Ceasar cipher where N = 5.
//TIP: Use code.toCharArray() to get an array of characters
