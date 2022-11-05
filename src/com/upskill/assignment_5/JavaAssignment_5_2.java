package com.upskill.assignment_5;

public class JavaAssignment_5_2 {

	public static void main(String[] args) {
		
		System.out.println(fizbuzz (15));
		
	}
	
	public static String fizbuzz (Integer i){
		
		String result = "";
		
		if ( i % 3 == 0 ){
			result += "Fizz";  // += adding to the initial value 
		}
		
		if ( i % 5 == 0) {  // we are not using else if since we need to add buzz to fizz in case of multiples of 3 and 5
			result += "Buzz";
		}
		
		if (result.equals("")){
			result = i.toString();   // converting my string to integer 
		}
		return result;
		
	}

}

//Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
//For numbers which are multiples of both three and five return 'FizzBuzz'.
//For numbers that are neither, return the input number.
