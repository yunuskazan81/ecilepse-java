package com.class10;

public class ClassTaskEnhancedForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] grocery = {
				
				
				{"Tomato","Green Pepper", "Carrot", "Leek"},
				{"apple", "banana", "orange", "dragon fruit"},
				{"milk","egg","water","cheese"},
				
		};
		
		for (String [] eachIsle : grocery) {
			
			for(String item : eachIsle) {
				
				System.out.print(item+" ");
				
				
			}
			
			System.out.println("\n ");
		}
		
	}

}
