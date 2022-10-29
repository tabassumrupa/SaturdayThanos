package com.upskill.assignment_3;

public class ChaseBank {
	

	public static void main(String[] args) {
	}
	
	public static void bank (String BankName, int InterestRate){
		int Principal = 37000;
		int Time = 30;
		int SIR = (Principal*Time*InterestRate)/100 ;
		System.out.println(BankName + " gives " + SIR);
	}

}
