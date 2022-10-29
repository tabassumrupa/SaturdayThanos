package com.upskill.assignment_2;

public class JavaAssignment_2_8 {
	static int num = 8;
	

	public static void main(String[] args) {
		whileLoop();

	}
	
	public static void whileLoop (){
		int i =1;
	   int f = 1;
	   
		while (i <= num){
			f = f*i;
				i ++;
			}
			System.out.println("The factorial number of " + num + " is " + f);
		}
		
	}

//Write Java Program to display Factorial of Number 7
