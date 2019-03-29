package com.class10;

public class classTaskArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [][] names= {
				
				{"Ms.","Mr.","Mrs.","Miss"},
				{"Jordan","Smith","Obama","Jackson"},	
		};
		
		
		System.out.println(names[0][1]+" "+ names[1][2]);
		System.out.println(names[0][2]+" "+ names[1][1]);
		System.out.println(names[0][3]+" "+ names[1][0]);
		System.out.println(names[0][0]+" "+ names[1][3]);
		
		String [][] grade= {
				
				
				{"A","B", "C","D","F"},
				{"John","Micheal","yunus","Faris"},
				
		};
		
		System.out.println("\nStudent "+ grade[1][2]+" has "+ grade[0][0]);
		
	}

}
