package com.class9;

public class getAllArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String[] names= {"John", "Mike", "Jane", "Talgat", "Olga", "Mehmet", "Siyar"};
        
        int a=3;
        System.out.println(names[a]);//Talgat
        a+=2;
        System.out.println(names[a]);//Mehmet
        a-=4;
        System.out.println(names[a]);//Mike
        
        int size=names.length;
        System.out.println(size);
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
        for (int i=0; i<size; i++) {
            System.out.println(names[i]);
        }        
			            //  0    1    2    3    4    5
			char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};//size is 6
			
			for (int i=0; i<=grades.length-1; i++) {       // array.length-1 gives us last 6th index is decreased; 
			    System.out.println(grades[i]);
			}

		
		
	}

}
