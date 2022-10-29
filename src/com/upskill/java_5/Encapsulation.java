package com.upskill.java_5;

public class Encapsulation {
	
  // Encapsulation used to hide the data using setter and getter method 
	
	private String name = "Ava";					  // Write & Read
	private int ssn = 12345678;						 // Write only
	private String username = "Mizu";				// Read only
	
	// Setter method - name
		public void setName (String value){				   // Set the data - Write
			name = value;	
		}	
		
	// Getter Method - name
		public String getName(){						// Get the data - Read
			return name;
		}
		
	// Setter Method
		public void setSSN (int value){
			ssn = value;
		}
		
	// Getter Method
		public String getUsername(){
			return username;
		}
			

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation ();
		obj.setName("Rupa");
		System.out.println(obj.getName());
		
		
		obj.setSSN(87654321);
		
		System.out.println(obj.getUsername());
	}

}


