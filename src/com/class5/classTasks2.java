package com.class5;

import java.util.Scanner;

public class classTasks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1;
		double num2;
		double num3;
		boolean b = true;
	
		Scanner numbers= new Scanner(System.in);
		
		System.out.println("Please Enter your first number; ");
		
		num1=numbers.nextDouble();
		
		System.out.println("Please Enter your second number; ");
		
		num2=numbers.nextDouble();
		
		
		System.out.println("Please Enter your third number; ");
		
		num3=numbers.nextDouble();
		
		b=(num1 != num2 && num1 != num3 && num2 != num3);
		
		
		/*
		
		if (b) {System.out.println("Good, These numbers are distinct");
		
		if (num1>num2 && num1>num3) {System.out.println("first input, "+num1 + ", is your largest number. ");}
		
		else if (num2>num1 && num2>num3) {System.out.println("second input, "+num2 + ", is your largest number. ");}
		
		else if (num3>num1 && num3>num1) {System.out.println("third input, "+num3 + ", is your largest number. ");}
		
		} else {System.out.println("Sorry, your numbers are not distinct");}
		
		
		*/
		
		
		
		
			
		if (num1>num2) {
			
			if(num2>num3) {System.out.println("first input, "+num1 + ", is your largest number. ");}
		
			} else if (num2>num1) {
			
			if (num1>num3) {System.out.println("second input, "+num2 + ", is your largest number. ");}
			
			} else if (num3>num2) {
				
				if (num2>num1) {System.out.println("third input, "+num3 + ", is your largest number. ");}	
				
			} else {System.out.println("Sorry, your numbers are not distinct! Try again");}
		
		
		
		
		
		
		
		}  
		
	}


