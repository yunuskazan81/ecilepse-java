package com.class4;

import java.util.Scanner;

public class salaryAndBonusTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salary;
		
		int bonus1= 5000;
		
		int bonus2= 3000;
		
		int years;
		
		var bonus= new Scanner(System.in);
		
		
		System.out.println("How many years have you worked in this company");
		
		
		years = bonus.nextInt();
		
		
		if(years>=5) {System.out.println("you are eligible to get bonus");
		
		
		
		System.out.println("How much is your yearly salary");
		
		
		salary = bonus.nextInt();
		
		
		
		if(salary>=50000) {System.out.println("your bonus is " + bonus1);}
		
		else {System.out.println("your bonus is " +bonus2);}
		
		}
		
		
		else {System.out.println("Unfortunately, you are not eligible to get bonus");}
		
		
		
		
	}

}
