package com.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// let's create an array of names thats will hold 5 elements and retrieve all
        // values from it
        // 1. create an array using new keyword
        String[] names = new String[7];
        names[0] = "Asel";
        names[1] = "Awet";
        names[2] = "Arif";
        names[3] = "Weqas";
        names[4] = "Dzmitri";
        names[5] = "Shiva"; // will get an runtime exception when trying to access it
        names[6] = "Sandesh";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // 2. create an array using array literal
        // 0 1 2 3 4 5
        String[] studentNames = { "Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };
        System.out.println("---------For loop--------");
        for (int i = 0; i <= studentNames.length - 1; i++) {
            System.out.println(studentNames[i]);
        }
        // retrieve values using: advanced for loop, for each loop, enhanced for loop
        
        /*
         The Enhanced for Loop versus the Traditional for Loop
• if you need to change the contents of an array element 
• if you need to work through the array elements in reverse order 
• if you need to access some of the array elements, but not all of them 
• if you need to simultaneously work with two or more arrays within the loop 
• if you need to refer to the subscript number of a particular element
. if you want to select only one element of the array, just use for loop, enhanced loop is not proper way. 
enhanced loop is print all elements of the array.
         */
        
        System.out.println("---------Advanced for loop--------");
        for (String student : studentNames) {
            System.out.println(student);
        }
		
		
		
		
	}

}
