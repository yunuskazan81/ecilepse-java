package com.class6;

public class LogicalNotOperator {
 
	 public static void main(String[] args) {
	        /*
	         *  not operator !
	         */

	        // (Common way) boolean a = !true; and System.out.println("The value of boolean variable is "+a);
	        
	        // OR 
	
	        // boolean a = true;  System.out.println("The value of boolean variable is "+!a);
	        
	        boolean snow=true;
	        
	        //if it is not snowing --> I will come to the class otherwise I will stay at home
	        
	        
	        if (!snow) {
	            System.out.println("I will come to the class");
	        }
	        
	        int x=10;
	        int y=20;
	        
	        if (!(x>y)) {
	            System.out.println("Hello");
	        }
	        
	        
	        
	    }
	
	
	
	
	
}
