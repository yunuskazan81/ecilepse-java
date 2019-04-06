package com.class14;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		calculator C= new calculator();
		
	System.out.println(C.sum(156,20));
		
		
		
		
	}

	
	public int sum (int a, int b) {
		
		
		return a+b;
	
	}
	
	public int subs(int a, int b) {
		
		return a-b;

	}
	
	
	
public	int div (int a, int b) {
		
		return a/b;
			
	}
	
public 	int mult (int a, int b) {
		
		
		return a*b;
		
	}
	
public int definiteValue (int a) {
		
		
		int c = 0;
		
		if(a<0) {
		
			c= -(a);
				
		}
		
		return c;
	
	}
	
}
