package com.class11;

public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//length() function/or method - returns number of character in the String
        String str="Syntax";
        
        int lengthOfString=str.length();
        System.out.println(lengthOfString);
        
        String str1="Syntax Technologies";
        
        int lengthOf2String=str1.length();
        System.out.println(lengthOf2String);
        
        String str2="Welcome, students!";
        System.out.println(str2.length());
        //toUpperCase()-> convert all character to UpperCase
        //toLowerCase()-> convert all character to LowerCase
        String str3="Hello";
        
        String newString=str3.toUpperCase();
        System.out.println(newString);
        
        String lowerCaseString=newString.toLowerCase();
        System.out.println(lowerCaseString);
        
        //equals() - compares 2 strings, if strings are equal--> true, else --> false
        String str4="Hello";
        String str5="hello";
        
        boolean equality=str4.equals(str5);
        System.out.println(equality);
        //equalsIgnoreCase() - compares 2 strings but ignores case
        String expectedBrowser="chrome";
        String actualBrowser="CHROME";
        
        boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
        System.out.println(equals);
		
      //contains() --> checks for specific value in the string
        //if value is present--> true , else--> false
        String str0="Good morning, students!";
        boolean contains=str0.contains("students");
        System.out.println(contains);
        
        String present="Welcome, Mehmet5465464";
        String neededValue="WELCOME,";
        
        boolean flag=present.contains(neededValue);
        System.out.println(flag);
        
        boolean flag1=present.toUpperCase().contains(neededValue);
        System.out.println(flag1);
        
        //startsWith(), endsWith(), --> will return true if String starts/ends with specific value
        //else --> false
        System.out.println("______StartWith & EndsWith________");
        String str6="syntax";
        
        boolean starts=str6.startsWith("s");
        System.out.println(starts);
        
        System.out.println(str6.endsWith("X"));
        
        //isEmpty() if length of a string is =0--> string is empty else -> it is not
        
        System.out.println("______isEmpty()________");
        String str7="";
        boolean isEmpty=str7.isEmpty();
        System.out.println(isEmpty);
        
        //concat() --> will concatenate 1 string to the end of another
        System.out.println("_______concat()________");
        String str8="Hello ";
        String str9="Ali!";
        
        System.out.println(str8+str9);
        System.out.println(str8.concat(str9));
        
        //trim()--> will remove spaces at the beginning and at the end of your String
        System.out.println("_______--________");
        String expected="You may qualify for a multi-policy discount!";
        String actual=" You may qualify for a multi-policy discount!";
        
        actual=actual.trim();
        System.out.println(expected.equals(actual));
		
	}

}
