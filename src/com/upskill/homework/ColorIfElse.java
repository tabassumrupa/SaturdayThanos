package com.upskill.homework;
import java.util.Scanner;

public class ColorIfElse {
	static String c;

	public static void main(String[] args) {
		System.out.println("Choose a color: Black, White, Red, Blue ");
		
		Scanner cool = new Scanner (System.in);
		c = cool.nextLine();
		
		color();
		
	}
	
	public static void color (){
		if (c.equals("Black")){
			System.out.println("You must be a Goth!");	
		}
		else if (c.equals("White")){
			System.out.println("You are a very pure person");
		}
		else if (c.equals("Red")){
			System.out.println("You are fun and outgoing");
		}
		else{
			System.out.println("You're not a Chelsea fan, are you?");
		}
	}

}



//write a program that asks a user to choose between four colours: black, white, red, or blue.
//Use IF … ELSE IF statements to display one of the following messages, 
//depending on which color was chosen:
//BLACK "You must be a Goth!"
//WHITE "You are a very pure person"
//RED "You are fun and outgoing"
//BLUE "You're not a Chelsea fan, are you?"