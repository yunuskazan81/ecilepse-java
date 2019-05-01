package com.class20;

public class Programing {

	
	
	
	
	Programing () {
		
		
		System.out.println("I love programming languages");
		
		
	}
	
	
	Programing (String name) {
		
		
		System.out.println("I love " + name);
		
	}
	
public static void main(String[] args) {
		
		Programing obj= new Programing ();
		
		Programing obj1 = new Programing ("Java");
		
		System.out.println(method());
		System.out.println(method(15.3));
		System.out.println(method("yunus"));
		
		System.out.println(method1());
		
	}
	
	static int method () {
		
	 int a= 5;
	 
	 return a;
	}
	
	
	static double method (double a) {
		
		return a;
		
	}
	
static String  method (String a) {
		
		return a;
		
	}

private static int method1 () {
	
	 int a= 5;
	 
	 return a;
	}
	
	
	private static double method1 (double a) {
		
		return a;
		
	}
	
private static String  method1 (String a) {
		
		return a;
		
	}


}
