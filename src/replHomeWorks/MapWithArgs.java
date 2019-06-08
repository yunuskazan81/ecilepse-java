package replHomeWorks;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MapWithArgs {
	

	
	public static void print(Map<String, Integer> map) {
	      
		Scanner scan= new Scanner(System.in);
		
	System.out.println("What would you like to do?");
		
	System.out.println("For Adding new item please press 'P', For Removing the item please press 'R', For Replacing the Item please press 'S' ");
	
		String appType= scan.nextLine();
		
		System.out.println("Please enter your itemName");
		
		String itemName= scan.nextLine();
		
		System.out.println("Please enter your item number");
		
		Integer itemNumber= scan.nextInt();
		
		
	       
	       if (map.isEmpty()){
	         
	         System.out.println("map is empty");
	         
	       }else if(appType.contains("p") || appType.contains("P")){
	    	   
	    	   map.put(itemName, itemNumber);
	         
	       }
	       
	       else if(appType.contains("r") || appType.contains("R")) {
	    	   
	    	   map.remove(itemName, itemNumber);
	       }
	       
	       else if(appType.contains("s") || appType.contains("S")) {
	    	   
	    	   map.replace(itemName, itemNumber);
	       }
	       
	       else {
	    	   System.out.println(map);
	    	   
	       }
	       
	     }
	
	public MapWithArgs() {
		
		
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapWithArgs obj= new MapWithArgs();
		
	Map<String, Integer> map= new HashMap<>();

	    map.put("mango", 10); 
	    map.put("apple", 30); 
	    map.put("orange", 20);
	    
		
		print(map);
		
		System.out.println(map);
		
	map.clear();
	
	System.out.println(map);
//		
//		print(map);
		
		
        
       
		
		
	}

}
