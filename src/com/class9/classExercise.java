package com.class9;

import java.util.Scanner;

public class classExercise {

	
	public static void classMethod () {
		
		
		Scanner scan= new Scanner(System.in);
		
		
		
		boolean found = false;
		    int num=15;  
		    int value;
        	
        	int[] numbers=new int[num];
        	
        	// System.out.println("\nThe array contains "+num+" elements");
        	
        	for (int i=0; i<=num; i++) {
        	
        		
        		value= i*8-i%2;
        		
        		// System.out.println("the array element "+i+"'s value is "+value);
        	}
        	
        	System.out.println("\nPlease enter a number of element ");
        	
        	int num1= scan.nextInt();
        	
        	
		        for(int i =num1; i<=num1; i++) {
		        
		        	
		            if(i<=num) {
		            	
		                found = true;
		                
		                
		                if(found == true) {
		                	
		                	value= i*8-i%2;
		                	
		                	if (i==1) {
		                		System.out.println("The value of "+i+ "st. element of the array is equals to "+value);}
		                	
		                	else if(i==2) {System.out.println("The value of "+i+ "nd. element of the array is equals to "+value);}
		                	
		                	else if (i==3) {System.out.println("The value of "+i+ "rd. element of the array is equals to "+value);}
		                	
		                	else {
		                	
				            System.out.println("The value of "+i+ "th element of the array is equals to "+value);
				            } }
		                else {
		                	
		                	System.out.println("The array does not contain "+i+"th element." );
		                	break;
		                }
		            } else {
		            	System.out.println("The array does not contain "+i+"th element." );
	                	break;
		            	
		            }
		            
		        }
		        
		        
		        
		
	}
	
	
}
