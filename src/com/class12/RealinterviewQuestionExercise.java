package com.class12;

import java.util.Scanner;

public class RealinterviewQuestionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner(System.in);
		
		
		/*
				
						1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?

						2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

						3. Find out how many alpha characters present in a string?

						4.How to find out the part of the string from a string? What is substring? Find number of words in string?

						5. Write a java program to reverse String? Reverse a string word by word?
						
						6. Write a Java Program to find whether a String is palindrome or not?

						7. Write a java program to check whether a given number is prime or not?
						
						8. Write a Java Program to print first 10 numbers of Fibonacci series.
						
		*/
				
				
				//  1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
				
				
				int a= 10;
				int b=20;
				
				
				a= a+b;
				b=a-b;
				a=a-b;
				
				
				System.out.println("The value of a= "+a+" the value of b= "+b);
				
				
				String Str1="Hello";//5
				String Str2="World";//5
				
				Str1=Str1+Str2;//HelloWorld-->10
				Str2=Str1.substring(0, Str1.length()-Str2.length());//Hello
				Str1=Str1.substring(Str2.length());
				
				System.out.println("The value of str1="+Str1+" value of str2="+Str2);
				
				
				String strb = "Best";
		        String strc = "Group";

		        System.out.println("After swap strb is: " + strb.replace("Best", "Group"));
		        System.out.println("After swap strc is: " + strc.replace("Group", "Best"));
				
				
				
				
				// 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
				
				int [] array= {12,25,36,78,954,26,35};
				
				int largest= 0;
				
				int secondlargest= 0;
				int minimum= array[0];
				
				for (int i =0; i<array.length; i++) {
					
					
					if (largest<array[i]) {
						
						secondlargest=largest;
						
						largest=array[i];
					}	
				}
				
				System.out.println("largest number of the array is "+largest);
				System.out.println("second largest number of the array is "+secondlargest);
				
				
				for (int i =0; i<array.length; i++) {
					
					
					if (array[i]<minimum) {
						
						minimum=array[i];
					}	
				}
				
				System.out.println("minimum number of the array is "+minimum);
				
				
				// 3. Find out how many alpha characters present in a string?
				
				
				String str= "hello yunus kazan, how are you doing12989375043 !@#$#$%^&^&**";
				
				
				String replace= str.replaceAll("[^A-Z a-z]", "");
				
				System.out.println("Replaced string length is  "+replace.length());
				
				System.out.println("task 4................................................");
				
				// 4.How to find out the part of the string from a string? What is substring? Find number of words in string?
				
				String str1= "How123456 to 12&**(&*(find out the part of $#%^%^^%the string from a string? What is substring? Find number of words in string?";
				
				String [] array2= str1.split(" ");
				
				for(int i=0; i<array2.length; i++) {
				
					
				//System.out.println(array2[i]);
				String replacedArray= array2[i].replaceAll("[^A-Za-z\\?]","");
				System.out.print(replacedArray+" ");
				
				}
			
				
				 System.out.println("\n");
				
				String [] array1= str1.split(" ");
				String stra= "";
				
				for (String substring : array1) {
					
					// System.out.println(substring);
					
					String replacedArray1= substring.replaceAll("[^A-Za-z\\?]","");
					
					// System.out.print(replacedArray1+" ");
					
					stra=stra+replacedArray1+ " ";
				}
				
				System.out.print("\nElement of the splitted new array ----> "+stra);
				
				System.out.println("\n\nTotal number word of the new array is "+array1.length);
				
				
				// 5. Write a java program to reverse String? Reverse a string word by word? 
				
				System.out.println("\n");
				
				String original="Saturday and Sunday is Java Class";
				
				
				String reverse1="";
				
				for(int i=original.length()-1; i>=0; i--) {
					reverse1=reverse1+original.charAt(i);
				}
				// System.out.println("Reversed String is: "+reverse1);
				
				String[] word=reverse1.split(" ");
				for(int i=word.length-1; i>=0;i--) {
					
					System.out.print(word[i]+" ");
				}
				
				System.out.println("\n");
				
				String sentence="The master is speaking ";
				String reverse="";
				for (int i=sentence.length()-1;i>=0;i--) {
					reverse=reverse+sentence.charAt(i);
				}
				String[] words=reverse.split(" ");
				for(int i=words.length-1; i>=0;i--) {
					System.out.print(words[i]+" ");
				}
				
				
			// 6. Write a Java Program to find whether a String is palindrome or not?
				
				
					
				
				
				System.out.println("\n");
					
				//("\\?")//[!?]
						
				System.out.println("please enter any number:");
						
						int num1=scan.nextInt();
						
						boolean isPrime=true;
						for (int i=2; i<num1/2; i++) {
							if (num1%i==0) {
								isPrime=false;
							}
						}
						if (isPrime) {
							System.out.println(num1+" is a prime number");
						}else {
							System.out.println(num1+" is NOT a prime number");
						}
				
				
					// 8. Write a Java Program to print first 10 numbers of Fibonacci series.
					
					// 0,1,1,2,3,5,8,13,21,34
								
								
								
						int A=1;
						int B=0;
						int C=0;
								
						for (int i=0; i<10; i++) {
							
							C= A+B;
							A=B;
							B=C;
							
						System.out.print(A+" ");
						}		
					
					
					
					
					
					
				
				
				
			

		}
		}