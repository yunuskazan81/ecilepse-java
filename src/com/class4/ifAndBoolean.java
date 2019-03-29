package com.class4;

public class ifAndBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double gpa=3.6;
		double expectedgpa=3.5;
		boolean hasdiploma=true;
		
		if(hasdiploma) {
			System.out.println("Congratulation");
			
			if(gpa>expectedgpa) {System.out.println("You are hired");}
			
			else {System.out.println("But, Unfortunately, We cannot hire you for this time");}
			
			
		} else { System.out.println("please get your degree first before applying");}
		
		
		
		
	}

}
