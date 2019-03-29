package com.class5;

import java.util.Scanner;

public class logicalOrDifferentWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		       String day;
		       
		Scanner days= new Scanner(System.in);
		
		System.out.println("Please Enter  today");
		
		day= days.nextLine();
		

				if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
				           System.out.println("Weekdays");

				       }else if (day.equals("Saturday") || day.equals("Sunday")) {
				           System.out.println("Weekend");
				       }else {
				           System.out.println("Not valid");
				       }
				
				System.out.println("Please Enter  tomorrow");
				
				day= days.nextLine();
				
				if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
				          System.out.println("Weekday");

				      }else if (day.equals("Saturday") || day.equals("Sunday")) {
				          System.out.println("Weekend");
				      }else {
				          System.out.println("Not valid");}
				
System.out.println("Please Enter  other day");
				
				day= days.nextLine();
				
				if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
				          System.out.println("Weekdays");

				      }else if (day.equals("Saturday") || day.equals("Sunday")) {
				          System.out.println("Weekend");
				      }else {
				          System.out.println("Not valid");}
	
	}
}	
		
		
	


