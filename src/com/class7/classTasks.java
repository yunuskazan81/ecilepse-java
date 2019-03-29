package com.class7;

public class classTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
				create a boolean variable workDay and assign true
				    * create int variable day and assign it to 1
				    * as long as it is workDay print--> "I need a day off" and increment day
				    * day once day is 6 --> your condition for your loop should become false
		*/
		
		
		boolean workday= true;
		
		int day= 1;
		
		while(workday) {
			
			if(day<=6) { workday= true;
			
			System.out.println("I need a day off");
			
			} 
			
			else { workday = false;
			
			
			System.out.println("I dont need day off ");}
			
			day++;
			
		}
		
		
		
		
		
		
		
		
		
	}

}
