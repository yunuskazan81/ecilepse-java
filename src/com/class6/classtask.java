package com.class6;

import java.util.Scanner;

public class classtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Write a program that prints out if it is good weather to go for any activity or not
		* If the temperature is between 40 degrees and 80 degrees inclusive & no rain--> we will go for hiking
		* otherwise--> we will not go hiking
		* If temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
		* we are not going snowboarding
		* it if temperature is more than 80 & sunny--> go to the beach
		* otherwise --> not go to the beach
		
		*/  
		
		
		boolean raining= true;
		boolean snowing=true;
		boolean sunny=true;
		int temp;
		String activity;
		
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("Please Enter Temperature");
		
		
		temp= scan.nextInt();
		
		
		
					if (temp >=40 && temp <=80){System.out.println("is it raining? ");
					
					raining=scan.nextBoolean();
					
				        if (raining){ activity= "Watching Movie";
				                        
				        }else {activity= " Go Hiking";
				            
				        }
					}
					
					
					
					else if (temp >=25 && temp <40){ System.out.println("is it snowing? ");
				
				snowing =scan.nextBoolean();
				
				    if (snowing) {activity= "Snowboarding";
				        
				    }else {activity= "Do coding";
				        
				    }
				}
					
					
					else if( temp >80){ System.out.println("is it sunny? ");
				
				sunny =scan.nextBoolean();
				
				    if (sunny) {activity= "Go to the Beach";
				        
				    }else {activity= "Do More Coding";
				        
				    }
				}
					
					
					else {
				    System.out.println("Please enter different temp");
				    
				    temp=scan.nextInt();
				    
				    activity= "Unknown";}
					
					System.out.println(" My activitiy is " +activity);
					
	

}
	
	
				    
				}
					
					
				
			

