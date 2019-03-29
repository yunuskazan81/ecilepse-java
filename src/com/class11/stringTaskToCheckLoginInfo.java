package com.class11;

import java.util.Scanner;

public class stringTaskToCheckLoginInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
					Accept username, password and confirm password and check following requirements:
			
			1-Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
			2-Password should be minimum 8 characters, if less → message=”Password is too short”.
			3-Password cannot contain username if so, → message=”Password cannot contain username”.
			4-Password should match confirmed password, if not  → message “Passwords do not match”.
			
			--> Only after all requirements met → message “Your username and password has been created”
			PLEASE DO NOT SEND ANSWERS TO THE CHAT
					*/
		
		
		Scanner scan= new Scanner(System.in);
		String Name;
		String lastName;
		String username; 
		String password;
		String confirmpassword;
		String message = null; 
		
		System.out.println("Please enter firstName and lastName");
		
		Name= scan.nextLine();
		
		
		do  {
			
			
			System.out.println("Please enter username");
			
			username= scan.nextLine();
			
	        System.out.println("Please enter passwaord");
			
			password= scan.nextLine();
			
			System.out.println("Please confirm your password");
			
			confirmpassword= scan.nextLine();
			
			
			if(!(username.isEmpty() && password.isEmpty())) {
				
			if(!username.contains(Name)) {
				
				if (password.length()>8) {
				
				
				if (password.contains(username)) {
				
					
					if (password.equals(confirmpassword)) {
						
						message= "You signed up succesfully";
						
					
						
						
					} else { System.out.println("your password does not macth confirmation"); }
		
				} else {message="Your password can not contain username"; }
				
				
				
			} else { message = "your password can not be less than 8 characters";}
			
			
		} else  {message= "username can not contains your name";}
		
			}else { message= "username or password can not be empty";}
			
			System.out.println(message);
			
			} while ((message!= "You signed up succesfully"));
			
	}
		
	}

