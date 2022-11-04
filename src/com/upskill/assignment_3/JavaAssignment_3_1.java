package com.upskill.assignment_3;

import java.util.Scanner;

public class JavaAssignment_3_1 {
	
	String accName ;
	float amount ;
	boolean bool;
	Scanner s = new Scanner (System.in);
	
	public JavaAssignment_3_1 (String accName){
		this.accName = accName ;
		System.out.println("Account name : " + this.accName);
		System.out.println("Please enter the initial amount : " + accName + " account : ");
		this.amount = s.nextFloat() ;
		
		if (this.amount <= 0){
			bool = false;
			System.out.println("Invalid amount! Try again with valid amount.");
		} else  {
			System.out.println("Initial Amount : " + this.amount);
			bool = true ;
		}
		
		while (bool == false){
			System.out.println("Invalid amount! Try again with valid amount.");
			System.out.println("Please enter a valid amount : " + accName + " account : ");
			this.amount = s.nextFloat();
			if (this.amount > 0){
				System.out.println("Initial amount : " + this.amount);
				bool = true;
			}
		}
		
	}
	
	public void deposit (float amount){
		this.amount = this.amount + amount;
		System.out.println("New amount after deposit : " + this.amount);
	}
	
	public void withdraw (float amount){
		if (this.amount < amount){
			System.out.println("Insufficient Balance!");
		} else {
			this.amount = this.amount-amount;
			System.out.println("New Balance after withdraw : " + this.amount);
		}
	}

	public static void main(String[] args) {
		JavaAssignment_3_1 obj1 = new JavaAssignment_3_1 ( "Savings");
		JavaAssignment_3_1 obj2 = new JavaAssignment_3_1 ("Checkings");
		obj1.deposit(5000);
		obj2.deposit(3000);
		obj2.withdraw (1000);
		

	}

}

/*1. Write a class name BankAccount which has savings and checking class. 
BankAccount class that has a name and an initial amount, which are both set in the constructor. 
Also, it lets users make deposits. Note that the account name must be set when an account is created. 
Demonstrates the account class hierarchy with output of: 
a. account name: savings
b. initial amount: 10000
c. new amount after deposit: 15000
d. account name: checking
e. initial amount: 20000
f. new amount after deposit: 26000
g. new amount after withdrawal: 23000
*/
