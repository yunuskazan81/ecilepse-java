package myWorks;

import java.util.Scanner;

public class StringReplhomework {

	
	public static void main(String[] args) {
	    
	    String printOut=null;
	  Scanner sc = new Scanner(System.in); 
	  
	  /* 
	  
	  System.out.println("Enter any programming language");
	   
	   String language = sc.nextLine(); 
	    
	    System.out.println(language);
	    
	    
	  switch(language) {
			
			
			case "Java": 
				
			printOut= "Java is a programming language.";

			
			case "C":
				
				printOut= "C is a procedural programming language.";
			
			case "C++":
				
				printOut= "C++ is a middle-level programming language.";
				
			default: 	
			
			printOut= "Doesn't match any programming language.";
			
			
			}
			
			
			System.out.println(printOut);
	  
	  */
			
			
			// repl 75; 
			
			
			
			  System.out.println("Enter the browser name to proceed further with execution");
			   String browser = sc.nextLine();
			   String output;
			   
			   
			String browser1= browser.toLowerCase();
			
			System.out.println(browser1);
			
				
				switch (browser1) {
				
				
				case "chrome": 
					
					output=  "Proceed with chrome Browser";
				break;
				
				case "firefox": 
					
					output=  "Proceed with firefox Browser";
					break;
					
                  case "ie": 
					
					output=  "Proceed with ie Browser";
					break;
                  
                  default:
                	  
                	  output= "Invalid Browser";
				}
			
				
				System.out.println(output);
			
			
	 
	  }
	
	
	
}
