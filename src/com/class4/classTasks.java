package com.class4;

import java.util.Scanner;

public class classTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Task 1;
		
		/*
		
		String toApprove;
        int min=200000;
		int loan;
		
		Scanner loanApproval= new Scanner(System.in);
		
		System.out.println("please enter the loan amount that your requested amount ");
				
		
		loan= loanApproval.nextInt();
		
		if(loan>200000) {
			System.out.println("the loan is Approved");}
		
		else if (loan<200000) {System.out.println("minimum loan amount is " +min);}
			
		else {System.out.println("the loan is Rejected");}
		
		toApprove= loanApproval.nextLine();
		
	System.out.println("please enter the requested amoun bigger than " +min+ "to be approved");

		
		
	loan= loanApproval.nextInt();
	
	if(loan>200000) {
		System.out.println("the loan is Approved");}
	
	else if (loan<200000) {System.out.println("minimum loan amount is " +min);}
		
	else {System.out.println("the loan is Rejected");} 
			
	*/		
	
	// task 2;
	
	
	int minAge;
	
	
	Scanner legalAge = new Scanner(System.in);
	
	System.out.println("please enter your age");
	
	minAge=legalAge.nextInt();
	
	if(minAge>18) {System.out.println("your request is approved and your driver license will be issued");}
	
	else if (minAge==18) {System.out.println("your request is approved and your driver license will be issued");}
	
	
	
	else {System.out.println("your request is rejected because your age is below the legal limit");
	
	System.out.println("please try agin ");
	
	minAge=legalAge.nextInt();
	
	
    if(minAge>18) {System.out.println("your request is approved and your driver license will be issued");}
	
	else if (minAge==18) {System.out.println("your request is approved and your driver license will be issued");}
	
	else {System.out.println("your request is rejected because your age is below the legal limit");}

	}






			
		}
		
		
		
	}


