package com.class11;

import java.util.Scanner;

public class thursdayClassTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL
			
			*/ 
		/*
		 
		Scanner scan=new Scanner(System.in);
		
		String mom; 
		String dad;
		String expecting;
		String gen1="boy";
		String gen2= "girls";
		
		
		System.out.println("please enter Mom’s first name");
		mom=scan.nextLine();
		
		
		System.out.println("please enter Dad’s first name");
		dad=scan.nextLine();
		
	
		
		System.out.println("please enter your expectation about baby's gender");
		
		expecting = scan.nextLine();
		
		
		expecting.equalsIgnoreCase("boy");
		expecting.equalsIgnoreCase("girl");
				
		/*
		boolean equals=expecting.equalsIgnoreCase(expecting);
		boolean parent=mom.equalsIgnoreCase(mom);
				parent=dad.equalsIgnoreCase(dad);
		
		
		
		String suggestion1 = dad.substring(0,dad.length()/2);
		String babyname = null; 
		String suggestion2= mom.substring(0, mom.length()/2);
		
		switch(expecting) {
		
		
		case "boy": 
			
			babyname= suggestion1.concat(mom.substring(mom.length()/2));
		
		case "girl":
			
			babyname= suggestion2.concat(dad.substring(dad.length()/2));
		
		}
		
		
		System.out.println(babyname);
		
		*/
		
		//////////////////..........................
		
		String motherName,fatherName, gender, babyName;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if(gender.equalsIgnoreCase("girl")){
		babyName=motherName.substring(0, motherName.length()/2)+
				fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
			
		}
		System.out.println(babyName.toUpperCase());
		
	}

}
