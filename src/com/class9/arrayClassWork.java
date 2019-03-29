package com.class9;

public class arrayClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// task1 create array grade;
		
		
		
		char [] grade= {'A','B','C','D', 'E'};
		
		char[] grade1 = new char[5];
		
		grade1[0]= 'A';
		grade1[1]= 'B';
		grade1[2]= 'C';
		grade1[3]= 'D';
		grade1[4]= 'E';
		
		System.out.println(grade[0]);
		
		
		// task 2 store group name;
		
		String [] groupNames = {"yunus", "muhammet", "recep", "fatih", "micheal"};
		
		String [] groupName= new String[5]; 
		
		groupName[0] = "yunus";
		groupName[1] = "muhammet";
		groupName[2] = "recep";
		groupName[3] = "fatih";
		groupName[4] = "micheal";
		
		
		// task 3 create array of java statements words;
		
		                  //0    1        2           3       4  
		String[] java= {"Java", "day", "Saturday", "coding", "is"};
		
		
		System.out.println(java[2]+" "+java[4]+" "+java[0]+" "+java[3]+" "+java[1]);
		
		String sentence = java[2]+" "+java[4]+" "+java[0]+" "+java[3]+" "+java[1];
		
		int size = java.length;
		
		int a=2; 
		
		System.out.println(java[a]);
		
		
		
		
		
	}

}
