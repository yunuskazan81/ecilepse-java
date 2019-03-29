package com.class8;

public class columnsDependOnRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=7;
		
		for (int column=1; column<=rows; column++) {
			
			for(int y=1; y<=column; y++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
for (int column=rows; column>=1; column--) {
			
			for(int y=1; y<=column; y++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
