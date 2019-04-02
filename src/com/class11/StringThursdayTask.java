package com.class11;

import java.util.Scanner;

public class StringThursdayTask {

	public static void  main (String[] args) {
		// TODO Auto-generated method stub

		/*
		 	Create a String and print it in reverse order (Sunday → yadnuS).

			Create a String and if the String is not empty perform the following: 
			if the String has an odd number of characters and has 3 or more characters, 
			print the character in the middle of the String
		  
		 
		 */
		
		
		String lastDay= "Sunday";
		
		
		for (int i=lastDay.length()-1; i>=0; i--) {
			
			
			
			char day= lastDay.charAt(i);
			
			
			System.out.print(day);
				
		}
				
		
		String yunus;  
		
		Scanner scan= new Scanner(System.in);
		
		yunus= scan.nextLine();
	
		
		

		
		if (!(yunus.isEmpty())) {
			
			
			if (yunus.length() %2==0 & yunus.length()>3) {
				
				System.out.println("\n "+yunus.charAt(yunus.length()/2-1));
			}
			
		}
		
	
		
		
		
		
		
			
		}
		
	}


