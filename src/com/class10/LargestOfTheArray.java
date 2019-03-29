package com.class10;

public class LargestOfTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Find largest numbers of the array
		
		
				int [] Numbers = {21,12,65,32,75,81};
				
				int largest= Numbers[0];
				
				
				for (int i=0; i<=Numbers.length-1; i++) {
					
					
					if(Numbers[i]>largest) {
						
						largest= Numbers[i];	
					}	
					
				}
				
				System.out.println(largest +" is the largest number of the array ");
				
		
		
		
	}

}
