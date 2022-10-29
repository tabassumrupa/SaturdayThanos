package com.upskill.assignment_2;

public class JavaAssignment_2_6 {

	public static void main(String[] args) {
		forLoop();

	}
	
	public static void forLoop (){
		int i;
		
		for (i=2 ; i<=100 ; i ++){
		int maxFactor = (int) Math.sqrt(i);
		boolean isPrime = true;
		int factor = 2;
		
		while (isPrime && factor <= maxFactor){
			if (i % factor == 0){
				isPrime = false;
			}
			++ factor;
		}
		if (isPrime)
			System.out.println(i);
		}
	}
	
}

//Write a java program to find the prime number from 1 to 100 and print them.
