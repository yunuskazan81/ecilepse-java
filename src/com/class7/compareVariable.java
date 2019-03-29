package com.class7;

import java.util.Scanner;

public class compareVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* prompt user to enter 2 integers and compare At the end print largest
        */

       Scanner myScanner;
       int num1, num2;
       int largest = 0;

       myScanner = new Scanner(System.in);
       
       for (int i = 1; i <= 5; i++) {
           
           System.out.println("Please enter 2 numbers");
           num1 = myScanner.nextInt();
           num2 = myScanner.nextInt();

               if (num1 > num2) {
                   largest = num1;
               } else if (num2 > num1) {
                   largest = num2;
               } else {
                   System.out.println(num1 + " is queals to" + num2);
               }

           System.out.println(largest + " is the largest");
       }
		
		
		
		/* let user define a range of numbers to print */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a starting number");
        int startNumber = scan.nextInt();

        System.out.println("Please enter ending number");
        int endNumber = scan.nextInt();

        if (startNumber > endNumber) {

                for (int i = startNumber; i <= endNumber; i++) {
                    System.out.println(i);
                }
            
        } else {
            System.out.println("I won't run your code");
        }
	}

}
