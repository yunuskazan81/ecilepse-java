package myWorks;

import java.util.Scanner;

public class helpToclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner inp= new Scanner(System.in);
		
		System.out.println("In:");
		
		num=inp.nextInt();
		
		if (num>0) {System.out.println(num+ " is positive");}
		
		else if (num<0) {System.out.println(num+ " is negative");}
		
		else {System.out.println("no output for zero");}
		
		
	}

}
