package com.class9;

public class arrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num;
        
        num=10; //int num=10;
        
        int[] array1;//declare an array --> preferred way
        int [] array2;//declare an array
        int array3[]; //declare an array
        
        array1=new int[4];//initialize, create an array
        int[] Index= {3,5,18,46,92}; // different initialize, create an array
        //assigning value
        array1[0]=10;
        array1[1]=20;
        array1[2]=30;
        array1[3]=40;
        
        //access values
        System.out.println(array1[0]);
        
        int[] numbers=new int[3];
        
        numbers[0]=5;
        numbers[1]=10;
        numbers[2]=15;
        //numbers[3]=20; no error during compilation but error during run time
        //System.out.println(numbers[3]);//ArrayIndexOutOfBoundsException
        
        System.out.println(numbers[2]/numbers[0]);//5 15 or 20
        
        String[] a=new String[3];
        a[0]="Hello";
        a[1]="Hi";
        a[2]="Bye";
        
        System.out.println(a[1]+" friends");
        
       // we can use array for boolean type, boolean [] ad = new boolean [10];
        // we can also capture the array from user input so scanner, you can do array[0] = input.next(depending on what you are capturing)();
		
		
	}

}
