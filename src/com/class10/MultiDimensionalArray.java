package com.class10;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//creating 2D array;
        
        int[][] d=new int[3][4];//3*4=12 elements
        //1 row
        d[0][0]=12;
        d[0][1]=13;
        d[0][2]=14;
        d[0][3]=15;
        //2 row
        d[1][0]=1;
        d[1][1]=2;
        d[1][2]=3;
        d[1][3]=4;
        //3 row
        d[2][0]=5;
        d[2][1]=10;
        d[2][2]=15;
        d[2][3]=20;
        
        System.out.println(d[1][2]);//3
        System.out.println(d[2][3]);//20
		
		// second way to create two dimensional array;
        
        
        int[][] c= {
       //column	 0  1  2   3
        		{12,13,14,15}, // row 0
        		{1,2,3,4},     // row 1
        		{5,10,15,20},	// row2
        		{100,200,300,400},	// row 3
        		
        };
		
		                  // r  c   
		System.out.println(c[3][0]); // 100;
		
		
	}
}
