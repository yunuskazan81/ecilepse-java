package myWorks;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*     
		 
		 logical AND; symbol is &&;
		 
		 both condition has to be TRUE
		 
		 true and true---> true
		 false and false---> false
		 false and true---> false
		 true and false----> false
		 
		 logical OR ; symbol is || (pipeline)
		 
		 
		 only one condition has to be TRUE;
		 
		 true or true -----> true
		 true or false ----->true
		 false or true -----> true
		 false or false -----> false
		 
		 
		 */
		
		//if number is between 1-10 --> number is small
        //if number is between 11-100 --> number is medium
        //if number is between 101-1000--> number is large"
		
		int num= 15;
		
		if (num>=1 && num<=10) {System.out.println("number is small");}
		
		else if (num>10 && num<=100) {System.out.println("number is medium");}
		
		else if (num>100 && num<=1000) {System.out.println("number is large");}
		
		
		else {System.out.println("number is not in our range");}
		
	}

}
