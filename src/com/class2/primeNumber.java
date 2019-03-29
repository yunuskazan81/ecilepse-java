package com.class2;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Prime number 
		
		int P=11458987;
		
		boolean Prime= true; 
		
		for (int i=2; i<P; i++) {
			
			if(P%i == 0) {
				
				Prime= false;
				break;
			
					 
			}
		}
			
		
		
		
		if (Prime) {
		
		
		if (P>2) { System.out.println(P + " is a Prime Number");
		
		
	}
		else {
			
			System.out.println(P + " is a not Prime Number");
		}
		
		}

		else {
			
			System.out.println(P + " is not a Prime Number");
			
		}
		
	}

}


