package com.upskill.assignment_3;

import com.upskill.assignment_3.ChaseBank;

public class JavaAssignment_3_3 extends ChaseBank{

	public static void main(String[] args) {
		bank("City", 7);
		bank("Chase", 8);
		bank("TD", 9);

	}
	
	public static void bank (String BankName, int InterestRate){
		int Principal = 37000;
		int Time = 30;
		int SIR = (Principal*Time*InterestRate)/100 ;
		System.out.println(BankName + " bank gives " + SIR );
	}
	

}

//Bank is a class that provides functionality to get interest rate. 
//Display different interest rate using rate functionality for Chase, City and 
//TD banks followed by 8%, 7% and 9%. Hints: using method override
