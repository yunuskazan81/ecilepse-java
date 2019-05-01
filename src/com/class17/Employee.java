package com.class17;

import java.util.Scanner;

public class Employee {

	
	/* Create a Class called Employee:
		Create three  variables  eID , salary and set the CEO to “Sumair”
		Create two objects of the class Employee
		Set the value of eID, salary for each of the objects
		Print out the eID , salary and  CEO for each of the objects
	*/ 
	static Scanner scan= new Scanner(System.in);
	
		static String eID;
			
		static  int salary;
		     
		static   String employee;
		   
		static String title;  
      
     
     
	
	public static void main(String[] args) {
		
		Employee obj= new Employee();
		
		obj.emp(title, employee, eID, salary);	
	}
	
	
	


	public void emp (String title, String employee, String eID, int salary) {
		
		String output = null; 
		
//		 System.out.println("Title\t"+"Name\t"+"eID\t"+"\tSalary");
//		
//		System.out.println("--------------------------------------------------------------");
		
		/*
		
		title= "Ceo";
		employee="Sumair";
		eID= "SM160457836521";
		salary = 200000;
		System.out.println(title+"\t"+employee+"\t"+eID+"\t"+salary);
		
		title= "Dev";
		employee="John";
		eID= "JN524636952366";
		salary= 90000;
		System.out.println(title+"\t"+employee+"\t"+eID+"\t"+salary);
		title= "ScrM.";
		employee= "Mike";
		eID= "MK896748635625";
		salary= 75000;
		System.out.println(title+"\t"+employee+"\t"+eID+"\t"+salary);
		
		title= "Test";
		employee= "Yunus";
		eID= "MK812654898523";
		salary= 95000;
		System.out.println(title+"\t"+employee+"\t"+eID+"\t"+salary);
		
		output= title+"\t"+employee+"\t"+eID+"\t"+salary;
		// System.out.println(output);
		return output;
		
		*/
		for (int i=0; i<4; i++) {
		
		System.out.println("Please enter employe title ");
		title= scan.nextLine();
		
		System.out.println("Please enter employe name ");
		employee= scan.nextLine();
		
		System.out.println("Please enter employe ID ");
		eID= scan.nextLine();
		
		System.out.println("Please enter employe Salary ");
		salary= scan.nextInt();
		
		output= output+"\t"+ title+"\t"+employee+"\t"+eID+"\t"+salary;
		
		
		}
		
		
		System.out.println("Title\t"+"Name\t"+"eID\t"+"\tSalary");
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println(output);
		
		// return output;
	}
	
}
