package com.class8;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int secret=5;
		int guess;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 an 20 ");
		
		guess= scan.nextInt();
		
		
		while(secret!=guess) {
			
			if (guess>secret) {
				
				System.out.println("too large ");
			}
			else {
				System.out.println("too small");
			}
			
			System.out.println("please enter a number again");
			
			guess= scan.nextInt();
			
		}		
		
		if(guess==secret) {
			
			System.out.println("Congratulation! You got it!");
			
		}
		
	}

}
