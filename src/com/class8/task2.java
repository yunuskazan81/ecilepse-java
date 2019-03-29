package com.class8;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan= new Scanner(System.in);
			
			System.out.println("Please enter the item you want to buy");
			
			String item= scan.nextLine();
			
			Scanner scan2= new Scanner(System.in);
			
			System.out.println("please enter the item price");
			
			double price= scan2.nextDouble();
			
			double paidAmount;
			
			System.out.println("please enter your payment");
			
			paidAmount= scan2.nextDouble();
			
			
			while (paidAmount<price) {
				
				System.out.println("you still need to pay "+ (price-paidAmount));
				
				Scanner scan3= new Scanner(System.in);
				
				System.out.println("please enter payment amount");
				
				paidAmount= paidAmount+scan3.nextDouble();	
			}
			
			if(paidAmount==price) {
				
				System.out.println("your item fully paid, thank you for shopping");
			}
			else {
				
				System.out.println("Thank you for your payment.Here is your change " +(paidAmount-price));
				
			}
		}
		
		
		
	}


