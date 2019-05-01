package com.class19;

public class ClassTaskofPolymorphicoverLooadingTypes {

	

		
		public void Area (int a) {
			
			int SquareArea= a*a;
			
			System.out.println("the Square which length of the side is "+ a+ " area is "+ SquareArea);
		}
		
		
public void Area (int a, int b) {
			
			int RentengularArea= a*b;
			
			System.out.println("the Rentengular which length of the side is "+ a+ " area is "+ RentengularArea);
		}
	
public void Area (int a, int b, int c) {
	
	         a=b=c;
	
	int CubeSurfaceArea= (a*b)*12;
	
	System.out.println("the Cube which length of a side is "+ c+ " area is "+ CubeSurfaceArea);
}

}
