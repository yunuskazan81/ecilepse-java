package com.class16;

import java.util.Scanner;

public class Student {

	static Scanner scan= new Scanner (System.in);
	static char grade;
	
	int score;
	
	//String palindrome;
	
	private String palindrome2;
	
	String getGrade(int score) {
		
		String myGrade;
		
		if(score>90) {
			
			grade= 'A';	
		} 
		
		else if(score>80) {
			
			grade='B';
		}
		else if (score>70) {
			grade= 'C';
		}
		else if (score>60) {
			
			grade='D';
		}
		
		else {
			
			grade= 'F';
		}
		
		myGrade= "My Sdet course grade is "+grade;
		
		System.out.println(myGrade);
		
		return myGrade;
	}
	
	public static void main(String[] args) {
		
		Student getGrate= new Student();
		
		getGrate.getGrade(91);
		
		Student Person= new Student();
		
		
		Person.person("yunus");
		
		Student palindrome2= new Student();
		
		 palindrome2.palindrome("kazak");
		 
		 
		 Student Array1 = new Student();
		 
		 Array1.Array("yunus kazan yigilca duzce turkey");
		
	}
	
	
	/*

		Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.
		
		Create a method that will take a String and return whether String is palindrome or not. Method should available to all classes within your projects.
		
		Create a method that will take a string and return array of words from that string. Method should be available only within same class.
		
	 */
	
	protected String person (String name) { // it could be default modifier also
		
		System.out.println(name);
		return name;
		
	}
	
	
	public String palindrome (String paliword) { // modifier is public because it's accessible from everywhere of the project;
		

		
		// System.out.println("Please enter any word or statement: ");
		
		while(true) {
		String reverses= "";
		
		
		
		// paliword= scan.nextLine();
		

		for(int i=paliword.length()-1; i>=0; i--) {
			reverses=reverses+paliword.charAt(i); }
		
		// System.out.println("Reversed String is: "+reverses);
	
			if (paliword.equalsIgnoreCase(reverses)) { System.out.println(paliword+ " is a palindrome string"); break; }
			
		else {System.out.println(paliword+ " is not a palindrome string"); }
		
			System.out.println("Please try again ");}
		
		return paliword;
		
	}
	
	
	private String Array (String arrayWord) { // modifier is private; it's accessible from only same class;
		
		String [] Arr = arrayWord.split(" ");
		
		String word = null;
		
		for (String substring:Arr) {
			
		word = substring;
			
			System.out.println(word);
			
		}
		
		return word;
		
	}
	
}
