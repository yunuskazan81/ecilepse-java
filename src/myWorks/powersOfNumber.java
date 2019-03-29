package myWorks;


import java.util.Scanner;


public class powersOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			      Scanner sc = new Scanner(System.in);
			      
			      int base;
			      int power;
			      
			      System.out.println("Enter the base number ::");
			      
			      base = sc.nextInt();
			      
			      System.out.println("Enter the power number ::");
			      
			      power = sc.nextInt();
			      
			      sc.close();
			      
			      
			      double result; 

			      for (int P=1; P<power; P++){
			         
			    	  result = Math.pow(base, power);	  	  
			      
			      System.out.println("Result of "+base+ " ^ "+ power +" is " + result);
			   
			     
			      
			      }

	
	
	}
	

}
		
		
		
		
		
	


