package com.class16;

import java.util.Scanner;

public class Task {
	
	static Scanner scan =new Scanner(System.in);
	
	static String name;
	
	static String lastname;
	
	static String emailType;
	
	static String email;
	
	
public static void main(String[] args) {
		
		
		createEmail();
		
		System.out.println(email);
		
	}
	
	static String createEmail() {
		
	
		System.out.println("please enter name");
		
		name= scan.nextLine();
		
		
		System.out.println("please enter lastname");
		
		lastname= scan.nextLine();
		
		System.out.println("please enter email type");
		
		emailType= scan.nextLine();
		
		email= name+lastname+"@"+emailType+".com";
		
		return email.toLowerCase();
		
	}
	
	
	
	

}
