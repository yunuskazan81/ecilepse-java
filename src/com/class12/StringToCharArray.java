package com.class12;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str= "saturday";
		
		char [] array= str.toCharArray();
		
		for(char y:array) {
			
			
			System.out.println(y);
		}
		
		
		// interview question most common, please reverse to string without using reverse function;
		
		String str1= "Today is Java class";
		String reverse= "";
		
		
		char[] array1= str1.toCharArray();
		
		for (int i=array1.length-1; i>=0; i--) {
			
			reverse= reverse+ array1[i];
			
		}
		
		System.out.print("Reversed string is: "+reverse);
		
		// 2. way using charAt() to reverse;
		
		String reverse1="";
		
		
		
for (int i=array1.length-1; i>=0; i--) {
			
			reverse1= reverse1+ str1.charAt(i);
		
}
System.out.print("\nReversed string is: "+reverse1);




// 3.way using substring;


String reverse2="";

for (int i=array1.length; i>0; i--) {
	
	reverse2= reverse2+ str1.substring(i-1,i);
		
	}

System.out.println("\nReversed string is: "+reverse2);


	}
}
