package com.upskill.assignment_2;

public class JavaAssignment_2_2 {

	public static void main(String[] args) {
		grade (95);
	}
	
	public static void grade (int mark){
		if (mark >= 90 && mark <=100){
			System.out.println("Grade A");
			
		} else if (mark >=80 && mark <=89){
			System.out.println("Grade B");
			
		} else if (mark >=70 && mark <=79){
			System.out.println("Grade C");
			
		} else if (mark >= 60 && mark <= 69){
			System.out.println("Grade D");
			
		} else if (mark <60 ) {
			System.out.println("Grade F");
		} else {
			System.out.println("Invalid Marks!");
		}
	}
}

//A school conducts a 100 mark exam for its student and grades them as follows:
 	//Grade:
 	//	Grade A: Marks>=90
 	//	Grade B: Marks>=80-89
 	//	Grade C: Marks>=70-79
 	//	Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60

 //    Write a java program to calculate the grade for a student in a method passing 
 //    parameter for grade to display every grade type, using if..else statement.

