package com.upskill.assignment_5;

import java.util.Scanner;

public class JavaAssignment_5_3 {

	public static void main(String[] args) {
		
		System.out.println("Please enter your word : ");
		Scanner s = new Scanner (System.in);
		
	System.out.println(	"The word satisfy the palindrome theory : " + isPalindrome (s.next()));
		
	}
	
	public static boolean isPalindrome (String word){
		
		int i1 = 0;  // forward 
		int i2 = word.length()-1;  //its referring to "b" from "abcba"  //backward 
		
		while (i2 > i1){  // has to be same character if palindrome for forward and backward 
			if (word.charAt(i1) != word.charAt (i2)){  
				return false;
			}
			
			++ i1;
			-- i2;
		}
		return true;
	}

}

//A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
//	Write a method that detects if a string is a palindrome.
//	Tip: Use word.charAt(i) to get the character at position i
