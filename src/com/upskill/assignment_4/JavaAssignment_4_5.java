package com.upskill.assignment_4;

import java.util.Arrays;

public class JavaAssignment_4_5 {

	public static void main(String[] args) {
		
		char string1 [] = ("geeksforgeeks").toCharArray();   // we are converting a string to an array in terms of character 
		char string2 [] = ("forgeeks").toCharArray();
		
		if (anagram(string1, string2))   // calling the method inside a if else statement since my method only return value if the 2 strings is anagram 
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
	}
	
	static boolean anagram (char [] string1, char [] string2){   // this method will return value only as true or false
						// the parameter here is individualizing the alphabets into an array to provide an index number to them
		int n1 = string1.length;     // counting how many alphabets are inside the string 
		int n2 = string2.length;
		
		if ( n1 != n2)     // if the length of 2 string is not same, then its not anagram 
			return false;
		
		Arrays.sort(string1);    // sorting the array (alphabets) on the basis of their index number 
		Arrays.sort(string2);
		
		for ( int i =0; i < n1; i ++)
			if (string1 [i] != string2 [i])   // if the alocated index number has different value (alphabet), then its not anagram
				return false;
		
		return true;      // otherwise it is anagram 
				
	}

}

// Check whether two strings are anagram of each other from an array 
