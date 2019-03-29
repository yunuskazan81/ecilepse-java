package com.class5;

import java.util.Scanner;

public class classTasks {

	private static final Readable Readable = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		 
		// Task 1;
		
		double h;
		
		
		Scanner heigth = new Scanner(System.in);
		
		
		System.out.println("Please enter your heigth as inch ");
		
		h= heigth.nextDouble();
		
		
		if (h<5) {System.out.println("short");}
		
		else if (h>=5 && h<6) {System.out.println("medium");}
		
		else if (h<=6) {System.out.println("tall");}
		
		
		*/
		
		// Task 2;
		
		
		
		int midTerm;
		int quiz;
		int finalS;
		
		String scoreGrade = "final grade";
		
		Scanner grade= new Scanner(System.in);
		
		
		System.out.println("Please Enter your Quiz score");
		
		
		quiz= grade.nextInt();
		
		System.out.println("please Enter your Mid term score");
		
		midTerm= grade.nextInt();
		
		System.out.println("please Enter your Final score");
		
		
		finalS=grade.nextInt();
		
		
		double avgScore= (quiz+midTerm+finalS)/3;
		
          
		
		
		
		String grade1= "A";
		String grade2=  "B";
		String grade3=  "C";
		String grade4=  "D";
		String grade5=  "F";
		
		

		
		if (avgScore>=90) {System.out.println("Your grade is "+grade1);}
		
		else if (avgScore>= 70 && avgScore<90) {System.out.println("Your grade is "+grade2);}
		
		else if (avgScore>=50 && avgScore<70) {System.out.println("Your grade is "+grade3);}
		
		
		else if (avgScore<50) {System.out.println("Your grade is "+grade5);}
		
		
		
		else { if (scoreGrade != grade5) {System.out.println("Congratulation!! You completed to java class ");}
	
	
		else {System.out.println("You are failed!! Please retake Java class again... ");}
	
		}
	
		
		
		/* 
		
		Class work; 
		
		  Scanner scan;
        int sales;
        int commission;
        
        scan =new Scanner(System.in);
        System.out.println("Please enter sales amount");
        sales=scan.nextInt();
        if (sales>0 && sales<100) {
            commission=2;
        }else if (sales>=100 && sales<200) {
            commission=5;
        }else if (sales>=200 && sales<500) {
            commission=10;
        }else if (sales>=500) {
            commission=20;
        }else {
            commission=0;
        }
        System.out.println("Your commision is "+commission);
        
        
         
		 */
		
		
		
		
		
		}
		
		
	}


