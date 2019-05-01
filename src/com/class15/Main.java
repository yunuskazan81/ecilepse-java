package com.class15;

public class Main {

	
	/*
	char getChar(String word, int index)	{
		
		char str;
		
	return str = word.charAt(index);
	
	
		  
		  }
			
	boolean bothEven (int num1, int num2)	{
		  
		  boolean result = false;

		  if (num1%2==0 & num2%2==0){
		    
		    result= true;
		    
		  }
			
			  return result;
				
				
			}
			
	
String makeThreeSubstr(String word, int startIndext, int endIndex) {
		
	String  word1 = null;
	
		
		for(int i=0; i<2; i++) {
		 
			word1=word.substring(startIndext,endIndex);
		  
			System.out.print(word1);
		 
		}
		
		return word1;
	}
*/

String mixString(String s1, String s2)	{
	
	char str1=' ';
	char str2=' ';
	String mix= " ";
	String mix1= " ";
	
	for (int i=0; i<s1.length(); i++) {
		
		str1=s1.charAt(i);
		str2=s2.charAt(i);
		
		mix= str1+""+str2;
		
		mix1= mix.substring(0, mix.length()-2);
		
		mix=mix+""+mix1;
		
		System.out.print(mix);
		
	}
	System.out.println("\n");
	return mix;
}
			
			
public static void main(String[] args){
	  
	  Main k= new Main ();
	  
		k.mixString("12345","abcde"); //should be 1a2b3c4d5e
		
		k.mixString("howdy","hello"); //should be hhoewldlyo
	}
}
	

