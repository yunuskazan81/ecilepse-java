package com.class14;

public class Greetings {

	public static void main(String[] args) {
		
		Greetings obj =new Greetings();
		obj.hello();
		//how to find largest number
		obj.findLargest(20, 10);//calling method FindLargest and passing values as 20&10
		obj.findLargest(30, 31);//calling method FindLargest and passing values as 30&31
		obj.findLargest(2000, 664674);
		obj.helloToInstructor("Weqas");
		obj.helloToInstructor("Arif");
	}
	
	void helloToInstructor(String name) {//name="Awet",    this method has parameters, parenthesis has 1 parameters 
		System.out.println("Hello "+name);
	}

	void hello() {   // this method has no parameters, parenthesis has nothing, it's called signature method 
		System.out.println("Hello");
	}
	void findLargest(int a, int b) { // this method has 2 parameters
		
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
	}
	
}
