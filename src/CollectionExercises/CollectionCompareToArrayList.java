package CollectionExercises;

import java.util.*;

public class CollectionCompareToArrayList {
	
	
	  public static void main(String[] args) {
	   ArrayList<String> c1= new ArrayList<String>();
	          c1.add("Red");
	          c1.add("Green");
	          c1.add("Black");
	          c1.add("White");
	          c1.add("Pink");

	          ArrayList<String> c2= new ArrayList<String>();
	          c2.add("Red");
	          c2.add("Green");
	          c2.add("Black");
	          c2.add("Pink");

	          //Storing the comparison output in ArrayList<String>
	          
	          ArrayList<String> c3 = new ArrayList<String>();
	          
	          for (String e : c1)
	             c3.add(c2.contains(e) ? "Yes" : "No");
	          System.out.println(c3);
	         
	          /*

if (a > b) {
  max = a;
}            ======>(in one line)     max = (a > b) ? a : b;  ----> is an expression which returns one of two values, a or b. 
																	The condition, (a > b), is tested. If it is true the first value, a, is returned. 
																	If it is false, the second value, b, is returned. 
																	Whichever value is returned is dependent on the conditional test, a > b. 																The condition can be any expression which returns a boolean value.
else {
  max = b;
}
	          
	           */
	     
	}
}
