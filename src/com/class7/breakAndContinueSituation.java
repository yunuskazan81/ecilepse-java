package com.class7;

public class breakAndContinueSituation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Break to jump out of the loop whereever it comes to inside of the loop code;
		for (int i=0; i<=10; i++) {
			
			if (i==5) {
			break; }
			
			System.out.println(i);
		}
		
		
		for(int i=0; i<=10; i++) {
			
			System.out.println("Hello");
			break;  // if there is no if condition when it comes to the break; complier jump out of for loop
		}
		
		
		// Continue; if you want take out the specific items including to the all condition when you run your code;
		// you have to put if condition for your exception and put "continue;"  operator
		
		 for (int i=0; i<=10; i++) {  
	            
	            if(i==2 || i==3) {  // for example here we want to take out 2 and 3 from all conditional result;
	            					// so our result will be 1,4,5,6,7,8,9,10
	                continue;
	            }
	            System.out.println(i);

	        }
	        System.out.println("I am outside of foor loop");
	        
	        /*I want to print number from 1 to 20 but skip those that divisible by3*/
	        
	        for (int a=1; a <=20; a++) {
	            
	            if (a%3==0) {
	                continue;
	            }
	            
	            System.out.println(a);
	        }
	        
		
	        
	        
	        
	        
	}

}
