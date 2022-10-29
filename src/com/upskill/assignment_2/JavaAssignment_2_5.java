package com.upskill.assignment_2;

public class JavaAssignment_2_5 {

	public static void main(String[] args) {
		forLoop();

	}
	
	public static void forLoop (){
		
		for (int i=1 ; i<=8 ; i++){
			for( int j = 1; j <=8; j++){
				int multiTable = i*j;
				System.out.print(multiTable + " ");
			}
			System.out.println(" ");
		}
	}

}

//Write a program in Java to display the multiplication table of (eight)8.