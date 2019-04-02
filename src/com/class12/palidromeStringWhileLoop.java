package com.class12;

import java.util.Scanner;

public class palidromeStringWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan= new Scanner(System.in);
		
		/* 
		String reverse = "";
        while (true) {
            System.out.println("Please enter string to check whether is palindrome or to exit q");
            str = scanner.nextLine();
            if (str.equals("q")) {
                break;
            } else {
                for (int i = str.length() - 1; i >= 0; i--) {
                    reverse += str.charAt(i);
                }
                if (str.equalsIgnoreCase(reverse)) {
                    System.out.println(str + " is palindrome");
                    break;
                } else {
                    System.out.println(str + " is not palindrome");
                }
            }
        }
				
		} 
		*/
		
		
		
		/* 
		String reverse;
		
        while (true) {
            reverse = "";
            System.out.println("Please enter string to check whether is palindrome or to exit q");
            String strr = scan.nextLine();
            
            if (strr.equalsIgnoreCase("q")) {
                break;
            } else {
                for (int i = strr.length() - 1; i >= 0; i--) {
                    reverse += strr.charAt(i);
                }
                if (strr.equalsIgnoreCase(reverse)) {
                    System.out.println(strr + " is palindrome");
                    break;
                } else {
                    System.out.println(strr + " is not palindrome");
                }
            }
        }
		
        */
        
System.out.println("\n");
		
		String paliword;
		
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
