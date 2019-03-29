package com.class10;

import java.util.Scanner;

public class ReplHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner input= new Scanner(System.in);
		
		int [] numbers= new int [5];
		
		System.out.print("Input: ");
		
		for (int i=0; i<5; i++) {
			
		
		
			numbers[i]= input.nextInt();}
		
		System.out.println("Output");
			
		for (int a=0; a<numbers.length; a++) {	
			
			System.out.println(numbers[a]*10);
			
			}
		*/ 
		
		/*
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		
		
		
		  for (double [] x:a ) {
			  
			  for (double j:x) {
				  
				  System.out.print(" "+j*2+", ");
				   
			  }
			  System.out.println();
		  }
		  
		  */
		
		/*
		  
		  // repl 61;
		  
		  
		  
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
		};
		     //should print 10
		  int sum =0;
		  int sum1=0;
		  int sum2=0;
		  int sum3=0;
		  
			  for(int j=0; j<a.length-1; j++ ) {//0  //1  //2
			      
				  // System.out.print(arr[i][j]+" ");
			      
			      sum = sum+ a[0][j];
			      sum1= sum1+ a[1][j];
			      sum2= sum2+ a[2][j];
			      sum3= sum3+ a[3][j];
			      
			  }
			  
		
		  System.out.println(sum);
		  System.out.println(sum1);
		  System.out.println(sum2);
		  System.out.println(sum3);
		
		  
		  
		  // repl 65;
		  
		  
		  int[][] a1 = {
					{-5,-2,-3,7},
					{1,-5,-2,2},
					{1,-2,3,-4}
				};
		  
		int z=0;  
for (int [] x:a1 ) {
			  
			  for (int y:x) { 
				  
				  // for (y=0; y<a1.length; y++) {
				  
				  if (y<0 & y%2!=0) {
					 
				 System.out.println(y);	  
				// System.out.println(a1[y]); 
				 
				 y=z;
			  }
				  
		  }		  
}  
	
	
	System.out.println(a1[z].length-1);
		  
	*/ 
		
		
		
		String s1= "hello";
		  String s2= "";

		  boolean empty1 = s1.isEmpty();
		  
		  boolean empty2=s2.isEmpty();
		  			
		  			
		  			System.out.println(empty1);
		  			System.out.println(empty2);
		  			
		  			
		  			/*
		  
		if (s1.isEmpty()) {
			System.out.println("s1 is "+empty);
			
		} else if (s2.isEmpty()) {
			
			System.out.println("s2 is "+empty);
			
		} else {
			
			System.out.println(empty);
		}
		
		*/
		
		  			String new1;
		  		  
		  		  Scanner scan= new Scanner(System.in);
		  		  
		  		  System.out.println("please enter a string");
		  		  
		  		  new1= scan.nextLine();
		  		  
		  		  String task= new1.substring(0,3);
		  		  
		  		  System.out.println(task);
		
		
		
	}

}
