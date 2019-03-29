package com.class4;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cityName;
		int temp;
		
		
		Scanner scanner= new Scanner(System.in);
		
	System.out.println("Please enter the City Name");
	
	cityName= scanner.nextLine();
	
	System.out.println("Please enter the temperature in Fahrenheite");
		
		temp=scanner.nextInt();
		
		int convertedtemp= (temp-32)*5/9;
		
		System.out.println("The temperature in the city "+cityName+" is " +convertedtemp+" C");
		
	}

}
