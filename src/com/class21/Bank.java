package com.class21;

public class Bank {

	/*
	 * 1. A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. 
	 * We have to print the money deposited by him in a particular bank. 
	 * Create a class ‘Bank’ with a method ‘getBalance’ which returns 0.
	 *  Make three subclasses named ‘BankA’, ‘BankB’ and ‘BankC’ with a method with the same name ‘getBalance’ 
	 *  which returns the amount deposited in that particular bank. 
	 *  Call the method ‘getBalance’ by the object of each of the three banks.

2. Write program in class A has final display method and try overload and override this method and observe result .
	 */
	
	static int moneyDeposited= 0;
	
	int getBalance() {
		
		return moneyDeposited;
	}
	
public static void main(String[] args) {
	
	Bank  obj= new Bank ();
	// System.out.println(obj.getBalance());
	System.out.println(obj.getBalance());
	
	BankA  obj1= new BankA ();
	// System.out.println(obj.getBalance());
	System.out.println(obj1.getBalance());
	
	BankB  obj2= new BankB ();
	// System.out.println(obj.getBalance());
	System.out.println(obj2.getBalance());
	
	BankC  obj3= new BankC ();
	// System.out.println(obj.getBalance());
	System.out.println(obj3.getBalance());
}
		
}


class A {
	
	// final method could be overloaded but cannot be overriding;
	
	final void method() {
		
	}
	
	final void method(int a) {
		
		
	}
	
	
}

class BankA {
	
	int moneyDeposited= 1000;

	int getBalance() {
		
	// System.out.println(moneyDeposited);
		
		return moneyDeposited;
}
}

class BankB extends BankA{
	
	int moneyDeposited= 1500;
	
int getBalance() {
		
	// System.out.println(moneyDeposited);
	
		return moneyDeposited;
}
}

class BankC extends BankB{
	
	int moneyDeposited= 2000;
	
int getBalance() {
		
	// System.out.println(moneyDeposited);
		return moneyDeposited;
}
}
