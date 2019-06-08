package replHomeWorks;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class Converting {

	public static void main(String[] args) {
		 
		 Set<String> list= new HashSet<>();
		 
		 list.add("first");
		 list.add("second");
		 list.add("third");
		 list.add("fourth");
		 list.add("fifth");
		
		 
		 System.out.print("HashSet contains: "+list);
		 
		 String[] arraylist= new String[5];
		 
		 list.toArray(arraylist);
		 
		 System.out.print(" Array elements: ");
		 
		 
		 for(int i=0; i<list.size(); i++){
		   
			 
			 System.out.print(arraylist[i]+" ");
		 }
		 
		 
		 }

}
