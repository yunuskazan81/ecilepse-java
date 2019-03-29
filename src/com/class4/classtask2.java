package com.class4;

import java.util.Scanner;

public class classtask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Task1
		
		double interestRate= 5.5;
		int term=12;
		
		double loanCalculation;
		int loanTerm1;
		int loanTerm;
		double morRate;
		int morPrice;
		
		Scanner morgage= new Scanner(System.in);
		
		
		System.out.println("Please enter your mortgage rate expectation");
		
		
		morRate=morgage.nextDouble();
		
		
		if (morRate > 10 ) {
			System.out.println(" you will not able to buy this house because Rate is so high for you ");}
		
			else {
				
			
			
				System.out.println(" Please enter house price");
				
				morPrice=morgage.nextInt();
				
				
				
				if (morPrice>=200000) { 
					
					// System.out.println("The costumer will take a loan");
				
					
				 System.out.println(" Please enter the loan term as year");
				 
				 
				 loanTerm=morgage.nextInt();
				 
				 
				 
				 if (loanTerm<10) { 
					 
					 double loanCalculation1= (morPrice* Math.pow(((12+(interestRate/100))/12), loanTerm))/(loanTerm*12);
					 
					 
					 System.out.println("Your Monthly Payment will be " +loanCalculation1);}
				
				 else { 
					 if (loanTerm>=10) {
					
					 
					 // System.out.println("please enter your interest rate expectation");
				 
				 // interestRate= morgage.nextDouble();
				
				
				 double loanCalculation2= (morPrice* Math.pow(((12+(morRate/100))/12), loanTerm))/(loanTerm*12);
				 
				 System.out.println("your motnly payment will be " +loanCalculation2);
				 
				 if (loanCalculation2<1000) {
					 
					 System.out.println("I will definitely buy the house");
					 
				 } else { System.out.println("please enter new term");}
				 
				 loanTerm1=morgage.nextInt();
				 
				 if ((loanTerm1-loanTerm)>5) { 
					 
					 
					 System.out.println("Congratulation, you win 10 percent discount");
					 
					 double discount= loanCalculation2-(loanCalculation2*0.10);
					 
					 System.out.println("Your discounted new montly payment is " +discount); 
				 
				 
				 } else {System.out.println("your montly payment is not changed and same as " +loanCalculation2);}
					 
					 
				 
				 
				 }
				 
				 
				 
				 }
				
				
				}
				
				
				else {System.out.println(" pay in cash");}
			
		
				
			}

				
		
		
				
	}
	}
