package com.class18;

public class ClassTaskConstructor {


	/*
	 
	 
	 Task 1;
	 
	  	Write a program that will have a constructor: one with parameters and second without any parameters. 
	  	Create a separate Test class where you will execute both of the constructors.

Task 2;
		Write a java program of Class Students that takes students name and 3 subject grades. 
		Inside your class also have a method to Calculate Average Grade. 
		Test Student class for 5 different students with different marks. 
		Your program should print an average mark of each students name.
		
		NOTE: please male different names for instance and local variables.
		
	Task 3;
	
		Write a program  that will have a private default constructor class and create 2 objects of this class: 1 - inside same class; 
		2 - from outside the class.

Task4

		Write program that have static constructor and observe result.
		
	 */
	
	
	// task1;
	
	ClassTaskConstructor(){
		
		System.out.println("im constructor without parameter");
		
	}
	
ClassTaskConstructor(String name){
		
		System.out.println("im constructor with parameter which is declared string name is "+name);
	
}
	public static void main(String[] args) {
		
		ClassTaskConstructor cons1= new ClassTaskConstructor();
		ClassTaskConstructor cons2= new ClassTaskConstructor("yunus");
		
	}
	
	
}
