package com.class9;

import java.util.Scanner;

public class homeworkArraysRpl56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		
		
		String[] days= new String[7];
		
		
		
		
		for(int i=0; i<days.length; i++) {
			
			System.out.println("Please enter day "+(i+1)+" of the week");
			
			days[i]=scan.nextLine();			
			
		}
		
		
		
		for (int y=0; y<days.length; y++) {
			
		
			
			System.out.println(days[y]);
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
