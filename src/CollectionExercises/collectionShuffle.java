package CollectionExercises;


import java.util.*;

public class collectionShuffle {

	
	
	  public static void main(String[] args) {
	  // Create a list and add some colors to the list
	  List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");
	  System.out.println("List before shuffling:\n" + list_Strings);  
	  Collections.shuffle(list_Strings);
	  System.out.println("List after shuffling:\n" + list_Strings); 
	 }
	}
