package com.upskill.assignment_4;

public class JavaAssignment_4_1 {
	
	private  String userName = "miru";
	private  String password = "QueenHeart#2854";
	private  String email = "miru@gmail.com";
	private  String firstName = "Mizan";
	private  String lastName = "Chowdhury";
	
	public String userName (){
		return userName;
	}
	
	public String password (){
		return password;
	}
	
	public String email (){
		return email;
	}
	
	public String firstName (){
		return firstName;
	}
	
	public String lastName (){
		return lastName;
	}

	public static void main(String[] args) {
		
		JavaAssignment_4_1 obj = new JavaAssignment_4_1 ();
		System.out.println("Username : " + obj.userName());
		System.out.println("Password : " + obj.password());
		System.out.println("Email : " + obj.email());
		System.out.println("First Name : " + obj.firstName());
		System.out.println("Last Name : " + obj.lastName());
		
	}

}

//Write a user program using encapsulation that contains the username, password, email, 
//first and last names of a user of our application. Display the user information in console output?
