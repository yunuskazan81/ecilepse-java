package com.class6;

import java.util.Scanner;

public class ClassSwitchActivity {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// Task 1;
		
		
        String country;
        String Language;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please enter which country you are from? ");
        
        country=scan.nextLine();
        
        switch (country) {
        
        case "USA":
        	Language="English";
            break;
    
        case "Russia":
        	Language="Russian";
            break;
        case "Italy":
        	Language="Italian";
            break;
        case "Turkey":
            Language="Turkish";
            break;
        case "Morocco":
        	Language="Arabic";
            break;
        case "Kazakhstan":
        	Language="Kazakhs";
            break;
        case "Pakistan":
        	Language="Urdu";
            break;
        default:
        	Language="Unknown";
        }
        System.out.println("Your native language is "+Language);
        
        
        
		
		
		/*
		
		
	 // Task 2;
        char grade ='G';
        String G;
        
       Scanner scan1 = new Scanner(System.in);
        
        System.out.println("Please enter your grade ");
        
        G = scan1.nextLine();
		
switch (G) {
        
        case "A":
        	G="Excellent";
            break;
    
        case "B": 
        	G="Good";
            break;
        case "C":
        	G="Average";
            break;
        case "D":
            G="Bad";
            break;
            
        case "F":
        	G="Not Acceptable";
            break;
        
        default:
        
        	G="Invalid";
        }
        System.out.println("Your grade is "+G);
     
        
        */ 
        
		
		/*
		
        
        // Task 3;
        
        double a;
        
        double b;
         
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Please Enter a number ");
        
        a= sc.nextDouble();
       
        
        System.out.println("Please Enter a number ");
        
        b= sc.nextDouble();
        
        double add= (a+b);
        double subs= (a-b);
        double mult= (a*b);
        double div= (a/b);
        double result=0;
        
        System.out.println("Please Enter your operator?");
        
        char operator;
        
        operator=sc.next().charAt(0);
       
        
        switch (operator) {
        
        case '+':
           result = add;
            break;
        case '-':
            result= subs;
            break;
        case '*':
            result= mult;
            break;
        case '/':
            result = div;
            break;
            
         default: 
        	 System.out.println("There is no any result for this operation"); 
        	 
        }
        
        System.out.println("Result of the operation is " + result);
        	 
        	 */
        
      
        
        
        
        }
        
	}
       
       
	
   
        
        
	
