package com.upskill.assignment_3;

import java.util.Scanner;

public class JavaAssignment_3_6 {

	public static void main(String[] args) {
		int vowel = 0;
		int consonant = 0;
		int digit = 0;
		int space = 0;
		int tab = 0;
		
		System.out.println("Enter your sentence: ");
		Scanner obj = new Scanner (System.in);
		String sentence = obj.nextLine();
		
		for (int i = 0 ; i < sentence.length() ; i ++){
			char ch = sentence.charAt(i);
			if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowel ++;
			} else if (ch >= 'a' && ch <= 'z'){
				consonant ++;
			} else if (ch >= '0' && ch <= '9'){
				digit ++;
			}else if ( ch == ' '){
				space++;
			} else if (ch == '	'){
				tab++;
			}
		
		}
		System.out.println("The number of vowel is " + vowel);
		System.out.println("The number of consonant is " + consonant);
		System.out.println("The number of digit is " + digit);
		System.out.println("The number of space is " + space);
		System.out.println("The number of tab is " + tab);
		
	
	}

}


//Write a java program which will count the number of vowels, consonants, digits, 
//tabs and blank spaces from a string “A quick brown fox jumps over the lazy dog”

