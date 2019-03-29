package com.class8;

import java.util.Scanner;

public class task2WithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String item;
		double price;
		double payment;
		double totalPayment=0;
		double balance;
		double change;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter the item you want to buy");
		
		item = scan.nextLine();
		
		System.out.println("please enter the price for that item");
		
		price= scan.nextDouble();
		
		do {
			System.out.println("please enter your payment");
			
			payment= scan.nextDouble();
			
			totalPayment= totalPayment+payment;
			
			if (totalPayment>price) {
				
				change= totalPayment-price;
				
				System.out.println("please take your change $"+change);
				break;
			}
			else if (totalPayment<price) {
			
			
			balance = price-totalPayment;
			
			System.out.println("Please add more money by " +balance+ " to complete payment process");}
			
			
		}while(totalPayment!=price);
		
		System.out.println(" Thank you for your shopping !!!!");
		
	}

}
