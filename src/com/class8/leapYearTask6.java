package com.class8;

import java.util.Scanner;

public class leapYearTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		
		Scanner scan= new Scanner(System.in);
		
		
		for (int i=0; i<10; i++) {
			
			System.out.println("please enter a year");
			
			year=scan.nextInt();
			
			
			if(year%400==0) {
				
				System.out.println("this is a leap year");
				break;
			} else if(year%4==0 && year%100!= 0) {
				
				System.out.println("this is a leap year");
				break;
			}else {
				
				System.out.println("this is not a leap year");
				
			}
			
		} 
		
		System.out.println("Congragulation !!!");

	}

}
