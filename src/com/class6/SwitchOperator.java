package com.class6;


import java.util.Scanner;


public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch operatot is to check out Quality usually;
		//make sure when we declare to variable; 
		
		
		


		    
		        /*Prompt user to enter their country
		         * Based on the country --> specify favorite food
		         */

		        int a=18;
		        char b='c';
		        String c="Hello";
		        
		        Scanner scan;
		        String country;
		        String favoriteFood;
		        
		        scan=new Scanner(System.in);
		        
		        System.out.println("Please enter which country you are from");
		        
		        country=scan.nextLine();
		        
		        switch (country) {
		        
		        case "USA":
		            favoriteFood="Burger";
		            break;
		        case "Afghanistan":
		            favoriteFood="Palau";
		            break;
		        case "Russia":
		            favoriteFood="Pelmeni";
		            break;
		        case "Italy":
		            favoriteFood="Pasta";
		            break;
		        case "Turkey":
		            favoriteFood="Baklava";
		            break;
		        case "Morocco":
		            favoriteFood="Couscous";
		            break;
		        case "Kazakhstan":
		            favoriteFood="Beshparmak";
		            break;
		        case "Pakistan":
		            favoriteFood="Biryani";
		            break;
		        default:
		            favoriteFood="Unknown";
		        }
		        System.out.println("Your favorite food is "+favoriteFood);
		        
		        
		        
		        
		        
		        
		        
		        
		    }
		
		
		
	}


