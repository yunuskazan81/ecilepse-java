package com.class15;

public class methodsType {
	
	
	   public static void main(String[] args) {
		   
		   
		   
		   
	        ScannerMethod scnMthd = new ScannerMethod();
	        
	        System.out.println(scnMthd.sum(125, 150));
	        
	        methodsType samples= new methodsType();
	        
	        samples.example6('A'); // it s working because java compiler recognize ASM special character and number code table;
	        
	    }

	    void example() {

	        System.out.println("No return value and NO Parameters");
	    }

	    void example2(String name) {

	        System.out.println("No return value but with Parameter : " + name);
	    }

	    boolean example3() {

	        System.out.println("With return value and NO Parameters");
	        return true;
	    }

	    String example4(String name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return name;
	    }
	    
	    
	    boolean example5(String name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return false;
	    }
	    
	    
	    long example6(char name) {

	        System.out.println("return value but with Parameter : " + name);
	        
	        return name;
	    }
	    
	    
	    
	    long example7(int name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return   name;
	    }
	    
	    
	    
	    long example8(double name) {

	        System.out.println("No return value but with Parameter : " + name);
	        
	        return   (long) name;
	    }
	    

	
	
	

}
