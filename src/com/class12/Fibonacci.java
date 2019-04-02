package com.class12;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 8. Write a Java Program to print first 10 numbers of Fibonacci series.
		
		// 0,1,1,2,3,5,8,13,21,34
					
					
					
			long a=1;
			long b=0;
			long c=0;
					
			for (int i=0; i<10; i++) {
				
				c= a+b;
				a=b;
				b=c;
				
				
			System.out.print(a+" ");
			}		
	
		
	}

}
