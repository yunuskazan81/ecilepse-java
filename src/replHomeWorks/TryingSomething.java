package replHomeWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TryingSomething {
	
	public static void main(String[] args) {
		
	

	ArrayList<String> list= new ArrayList<String>();
	  
	System.out.println("------ OldList with Orange -------- ");
	  for(int i=0; i<=21; i++){
	    
	    
	    if (i%2==0 & i<=10){
	      
	      list.add("Orange");
	      
	    } else if(i%2!=0 & i<=15){
	      
	      list.add("Apple");
	    }
	    
	    else if (i>10) {
	      
	      list.add("Strawberry");
	      
	    }
	    
	    // ArrayList<String> newList= new ArrayList<String> ();
	    
	    System.out.println(list.get(i));
	   	
	    }   	
	  
	  
	
	System.out.println("------ newList without Orange -------- ");
	
	for(int i=0; i<=20; i++) {
		
if (list.get(i)=="Orange") {
	    	
	    	list.remove(i);
	    	
	    	list.add("Apple");
		
	}
	  

List<String> newList= list.subList(0,21);  	

System.out.println(newList.get(i));
	}
	
	//System.out.println(list);
	  
 
	  
	  
	  
		
	  
	  
	  
//	  List<String> sublist= list.subList(5, 13);
//	  
//	  System.out.print("The new sublist is "+sublist);
	
}
}