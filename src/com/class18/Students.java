package com.class18;

public class Students {

	/*
	Task 2;
	Write a java program of Class Students that takes students name and 3 subject grades. 
	Inside your class also have a method to Calculate Average Grade. 
	Test Student class for 5 different students with different marks. 
	Your program should print an average mark of each students name.
	
	NOTE: please make different names for instance and local variables.
	*/
	
	
	static String studentName;
	static char grade;
	public static int avgPoint;
	
	
public static int Average (int a, int b, int c) {
		
		int avgPoint= (a+b+c)/3;
		
		return avgPoint;
		
	}
	
	
public static char CalculateAverageGrade(int avgPoint) {
	
	
	if(avgPoint>90) {
		
		grade= 'A';
		
	}else if (avgPoint>75) {
		
		grade= 'B';
		
	}
	
	else if (avgPoint>60) {
		
		grade= 'C';
	}
	
	else if(avgPoint>50) {
		
		grade='D';
	}
	
	else {
		grade='F';
		
	}
	
	return grade;

}

   	Students (String studentName, int avgPoint){
	
	System.out.println(studentName+"'s grade is "+ Students.CalculateAverageGrade(avgPoint));
	
}
   
   		
   	

public static void main(String[] args) {
	
	Students student1= new Students("yunus",Students.Average(70, 90, 97));
	
	Students student2= new Students("Jony", Students.Average(30, 55, 82));
	
	Students student3= new Students("Mike", Students.Average(70, 20, 95));
	
	
	
	
}

	
}
