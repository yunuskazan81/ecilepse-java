package com.class8;

public class createStarsSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=5;
		
		for(int r=0; r<4; r++) {
			
			for(int c=1; c<=6; c++) {
				
				if (r==0 || r==3 || c==1 || c==6) {
					
					System.out.print("*");}
				
					else {System.out.print(" ");}
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
	}

}
