package com.upskill.assignment_4;

import java.util.Arrays;

public class JavaAssignment_4_3 {

	public static void main(String[] args) {
		
		int values [] = {3,2,7,6,2,7,9,4,7};
		duplicateValues (values);	
		
	}
	
	public static void duplicateValues (int numbers []){
		
		Arrays.sort(numbers);   // sort the array in ascending order 
		int previous = numbers [0] - 1;  // index number 0 is minus the index before 
		int dupCount = 0;   // initializing the value (starting the count at 0)
		
		for (int i = 0; i < numbers.length; i ++){    // the loop is executing for the length of array
			if (numbers [i] == previous){             // the index value is getting compared with the previous index value 
				dupCount ++ ;         // count the duplicate values from the index 
			} else {
				previous = numbers [i];     
			}
		}
		
		System.out.println("There were " + dupCount + " duplicates in the array.");
		
	}
}

//Write a method which return count of duplicate value from a array
