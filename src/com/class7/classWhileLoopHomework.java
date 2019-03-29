package com.class7;

import java.util.Scanner;

public class classWhileLoopHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*Ask user to pay for a soda
	     *keep asking user to pay for soda until entered price is not equal to 1.99
	     *after user got a write amount print "Please enjoy your soda"*/

		Scanner  payment= new Scanner(System.in);
		
		double sodaPrice;
		
	
		do { 
			System.out.println("Please enter your payment for soda");
			sodaPrice= payment.nextDouble();
			double change= sodaPrice-1.99;
			
			if (sodaPrice>1.99) {System.out.println("Here is your change " + change);}
			
		} while(sodaPrice!=1.99 && sodaPrice<1.99); 
		
		
		
		System.out.println("Thank you for payment! Enjoy your drink");
		
		
		
		
		
			
		
	}

	}		
		
			
	
		
		
		
		
		
	

