package com.class5;

import java.util.Scanner;

public class shortCutMinAndMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		
		// FrankBahar [10:10 AM]
				//if else
				Scanner scanner = new Scanner(System.in);
				        double max = Double.MIN_VALUE;
				        System.out.println("Please enter 3 double values to compare: ");
				        double num1 = scanner.nextDouble();
				        double num2 = scanner.nextDouble();
				        double num3 = scanner.nextDouble();
				        if(num1 > num2 && num1 > num3) {
				            max=num1;
				        } else if(num2 > num1 && num2 > num3) {
				            max= num2;
				        } else if (num3> num1 && num3 > num2) {
				            max = num3;
				         }
				        System.out.println("Max Number is " + max);
				// nested if
				Scanner scanner1 = new Scanner(System.in);
				        double min = Double.MIN_VALUE;
				        System.out.println("Please enter 3 double values to compare: ");
				        double num11 = scanner1.nextDouble();
				        double num21 = scanner1.nextDouble();
				        double num31 = scanner1.nextDouble();
				        if(num11 > num21) {
				            if(num11 > num31) {
				                min=num11;    
				            }
				        }    
				        if(num21 > num11) {
				            if(num21 > num31) {
				                min= num21;
				            }
				        }
				        if (num31> num11) {
				            if(num31 > num21) {
				                min = num31;
				            }
				         }
				        System.out.println("Max Number is " + min);
		
		*/
		
double num1, num2, num3;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Please enter 3 distinct double values");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        num3=scan.nextDouble();
        
        if(num1>num2 && num1>num3) {
            System.out.println(num1+ " is the largest");
        }else if (num2>num1 && num2>num3) {
            System.out.println(num2+ " is the largest");
        }else if (num3>num1 && num3>num2) {
            System.out.println(num3+ " is the largest");
        }
		
        else {System.out.println("Sorry, your numbers are not distinct!! Try again");}
		
	}

}
