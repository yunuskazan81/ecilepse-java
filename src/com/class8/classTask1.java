package com.class8;

import java.util.Scanner;

public class classTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		

		System.out.println("please enter starting number of your range");
		
		int start= scan.nextInt();
		
		
		System.out.println("please enter ending num of your range");
		
		int end= scan.nextInt();
		
		
		int sum1=0, sum2=0; 
		
		if (start<end) {
		
		for (int i=start; i<=end; i++) {
			
			
			if(i%2==0) { 
			sum1= sum1+i;		
			}
		
			else {
					sum2+=i;		
					
				}
				
			}
		}
			System.out.println("sum of the even numbers of your range is "+sum1+ " sum of the odd numbers of your range is " +sum2);
		
		
		
		
		
		
		
		
		
		
		
	}
	





}