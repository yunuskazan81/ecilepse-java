package com.class12;

public class stringClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1- Create a String that will hold a sentence. Write a program to get a new String without any spaces.
	
		2- Create a String that should be combination of letters, numbers and special characters. 
		
		Find out how many alpha characters are there in the String.

		3- You have a String a=“Is it saturday! Is it raining! 
		
		
		4- Do we have a Java Class today?” How would you find out how many sentences are in that String?
		
		*/ 
		
		// Task 1;
		
		/*
		String s= "hello everyone welcome to world class flight";
		
		String[] array=s.split(" ");
		
		System.out.println(array.length);
		
		for(int i=0; i<array.length; i++) {
		
			System.out.println(array[i]);
			*/
			
		
			//Task 2
			
			
			String str= "123 ksdjfiusdh %^&#$ kbsdskdn ";
			
			String str1= str.replaceAll("[^%^&#$]", "");
			
			System.out.println(str1);
			
			
			System.out.println(str1.length());
			
			
			// Task3 
			
			
			String a= "Is it saturday? Is it raining? Do we have a Java Class today? How would you find out how many sentences are in that String.";
							
			
			String[] stra= a.split("\\?");
			
			System.out.println(stra.length);
			
			
		}
		
	}


