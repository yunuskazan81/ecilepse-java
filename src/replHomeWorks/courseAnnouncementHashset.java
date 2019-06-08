package replHomeWorks;

import java.util.*;

public class courseAnnouncementHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
	3. Create an HashSet of cities and add duplicates into it.
    Retrieve all values from hashset in 2 different ways.
    Retrieve all values in alphabetical order.
		 
		 
		 */
		
HashSet<String> map= new HashSet<>();
		
		
		map.add("Ankara");
		map.add("Washington, DC.");
		map.add( "Toronto");
		map.add("London");
		map.add("Berlin");
		map.add( "Brussel");
		map.add( "Paris");
		
		System.out.println("\n===== Using for each loop=========\n");

		for(String city: map) {
			
			System.out.println(city);
			
		}
		
		System.out.println("\n===== using Iterator=========\n");
		
		Iterator<String> it= map.iterator();
		
		while(it.hasNext()) {
			
			String nextIt= it.next();
			
			System.out.println(nextIt);
			
		}
		
		Set<String> map1= new TreeSet<>(map);
		
		System.out.println("\nconverting TreeSet for alphabetical order\n");
		
		for(String cities: map1) {
			
			System.out.println(cities);
		}
		
		
		
	}

}
