package myWorks;

import java.util.Scanner;

public class squareRootandCuberoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter a number for calculating square root: ");
		
		double number1 = scanner.nextDouble();
		
		
		double result = Math.sqrt(number1);
		
		System.out.println("The square root of " +number1+ " is: " +result);
		
       System.out.println("Enter a number for calculating cube root: ");
		
		double number2 = scanner.nextDouble();
		
		
	    result = Math.cbrt(number2);
		
		System.out.println("The cube root of " +number2+ " is: " +result);
		
		
	}

}
