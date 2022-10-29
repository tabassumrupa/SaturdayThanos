package com.upskill.assignment_4;

import java.util.Scanner;

public class JavaAssignment_4_4 {


	public static void main(String[] args) {
		
		System.out.println("Enter the year : ");
		Scanner s = new Scanner (System.in);
		 leapYear (s.nextInt());
		 
	}

	public static void leapYear ( int year){
		if (( year % 4 == 0) && (year % 100 != 0)){      // if the year can be divided by 4 and not 100 , then leap year
			System.out.println(year + " is a leap year.");
		} else if ((year % 4 == 0 ) && (year % 100 ==0) && (year % 400 == 0)){   // if the year can be divided by 4, 100 and 400, then leap year
			System.out.println (year + " is leap year.");
		} else {
			System.out.println ( year + " is not leap year");
		}
			
	}
}


// Write a method to check leap year