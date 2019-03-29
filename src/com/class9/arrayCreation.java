package com.class9;

public class arrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     //0 ,1 ,2 , 3
        int[] array= {10,20,30,40};
        
        System.out.println(array[2]);
        
        System.out.println(array.length);//to find a size of an array
        
        //string of names-5;
        
        String[] names= {"John", "Mike", "Jane", "Talgat", "Olga"};
        
        System.out.println("There are "+names.length+" values in my array of names");
        
        System.out.println(names[2]);
		
        int name[]= {1,2,3,4};// it works by this way;
        
        // int[] name;         this way to create array doesnt work; 
       //  name= {1,2,3,4}; 
        
        
		
	}

}
