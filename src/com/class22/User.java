package com.class22;

public class User {

	long mobile;
	String name;

	/*
	 * 1. Write program as a student class   that has instance variables name and address.
	 *  Create a constructor that will initialize those variables. 
	 * Print name & address of given  student by the displayInfo method.

2. Write program: user class  has a constructor that takes name and mobile number.
 Extend this class  by userInfo that will have user address variable. 
 Print users name, mobile number and address in userDetails method. 
 Test your code. (edited) 
	 */
	
	User (String name, long mobile ){
		
		this.mobile= mobile;
		this.name=name;
	}
	
}


class UserInfo extends User{
	
	
      public String address;



	UserInfo(String name, long mobile, String address) {
		
		super(name, mobile);
		this.address= address;
	}
	


public void userDetails () {

	System.out.println("User name: "+ super.name+ ", Phone number: "+mobile+", Address: " + address);
	
} 
}