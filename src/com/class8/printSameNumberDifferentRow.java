package com.class8;

public class printSameNumberDifferentRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*   1111111
		 * 2222222
		 * 3333333
		 * 4444444
		 * 5555555
		 * 6666666
		 * 7777777
		 * */
		
		for (int i=0; i<=7; i++) {
			
			for(int a=1; a<=7; a++) {
				
				System.out.print(i);
				
			}
			
			System.out.println();
		}
		
		
		for (int i=1; i<=4; i++) {
			
			for (int a=0; a<5; a++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
	}

}
