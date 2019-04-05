package com.class14;

import java.util.Scanner;

public class classTask {

	
	
	
	
	public static void main(String[] args) {
	
		classTask evenOdd = new classTask();
		
		
		evenOdd.number(25);
		
		classTask pal= new classTask();
		
		pal.palindrome("yunus");
		
		
	}	
	
	void number (int num) {
			
		if (num%2==0) {
			
			System.out.println(num+ " is a even number");
			
		} else {System.out.println(num +" is a odd number");}
		
				
	}
	
	
	void palindrome (String word ) {
		
		
		Scanner scan= new Scanner(System.in);

	       String paliword = null;
	       
		  word = paliword;
		
		
		System.out.println("Please enter any word or statement: ");
		
		while(true) {
		String reverses= "";
		
		
		paliword= scan.nextLine();
		

		for(int i=paliword.length()-1; i>=0; i--) {
			reverses=reverses+paliword.charAt(i); }
		
		// System.out.println("Reversed String is: "+reverses);
	
			if (paliword.equalsIgnoreCase(reverses)) { System.out.println("Your input "+paliword+ " is a palindrome string"); break; }
			
		else {System.out.println("Your input "+paliword+ " is not a palindrome string"); }
		
			System.out.println("Please try again ");}
		
		
		
	}
	
	

}
