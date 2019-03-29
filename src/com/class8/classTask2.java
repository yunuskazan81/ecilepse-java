package com.class8;

import java.util.Scanner;

public class classTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		double total=0;
		double price; 
		String item;
		double money;
		double change = 0;
		double rest = 0;
		double sum=0;
		
		System.out.println("Please enter the item you want to buy");
		Scanner scan= new Scanner(System.in);
		item = scan.nextLine();
		
		System.out.println("please enter the price for that item");
		
		price= scan.nextDouble();
		
		System.out.println("please enter your payment");
		
		money= scan.nextDouble();
		
		if (money<price) {
		
		for (double i=money; i<price*1000000; i+=money) {  
			
		total= total+i; 
		
		rest= price-total;
		
		if(rest==0) {
			
			System.out.println("You complete your payment process ");
			
			System.out.println("Thank you for shopping at our store "); 
		}
		
	else if (rest>0) {
			
			System.out.println("Please add more money by " +rest+ " to complete payment process");
			
			money= scan.nextDouble();
		}
		
	else {
		for (double a=money; a<total; a+=money)
		
		sum = sum+a;
		
		
		change= (total-sum)+rest;
		
		System.out.println("please take your change money "+change+" Thank you for your shopping");
		
		break;
	}
		
	}
		}
		
		else {
			change= money-price;

			System.out.println("please take your change money "+change+" Thank you for your shopping");
		}
	
	}
		
		
	}
	

