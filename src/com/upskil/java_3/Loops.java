package com.upskil.java_3;

public class Loops {
	
/*
 * Type of Loops
 	1. For Loop
 	2. While Loop
 	3. Do While Loop
 	4. Infinite Loop
 */

	public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedForLoop();

	}
	
	public static void practiceForLoop (){       				  // For Loop - Do again and again upto upper limit 
		int i;													 // Initialize the variable 
		for (i = 1; i <=100; i++){                  			// Setting lower limits, Upper limit, Increment or decrement 
			System.out.println("For Loop's numbers =  " + i);  // Statement 
		}
	}
	
	public static void practiceWhileLoop (){       							    // While Loop - Do again and again until the condition match 
		int i = 1;															   // Initialize the variable
		while (i<=100){														  // Setting the condition
			System.out.println("While Loop's numbers = " + i);				 // Statement
			i ++;															// Increment or decrement 
		}
	}
	
	public static void practiceDoWhileLoop (){					    // Do While Loop - Do action then match condition 
		int i = 1;												   // Initialize the variable 
		do {
			System.out.println("Do While Loop's numbers = " + i); // Statement 
			i ++;												 // Increment or decrement 
		} while (i<=100);										// Checking condition 
		
	}
	
	public static void practiceInfiniteLoop (){				    // Infinite Loop - Never ending loop
		int  i;												   // Initialize the variable 
		for (i =1;  ;i ++){									  // Setting lower limit, No upper limit, Increment or decrement 
			System.out.println("For Loop's numbers = " + i); // Statement 
		}
	}
	
	public static void practiceNestedForLoop (){			     // Nested Loop - Loop inside another loop
		int i;	                                                // Initialize the variable i
		int j;											       // Initialize the variable j
		for (i = 1; i <=10; i ++){							  // First loop for i
			for (j = 1; j <=10; j++){					     // Second loop for j
				int multiplicationTable = i * j;			// Statement for second loop
				System.out.print(multiplicationTable + " ");
			}
			System.out.println(" ");					 // Statement for first loop
		}
	}

}
