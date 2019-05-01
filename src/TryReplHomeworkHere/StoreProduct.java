package TryReplHomeworkHere;

public class StoreProduct {

	
	String label;
	  int price; 
	  static String category;
	  static boolean  hasExpiration;
	  static int stock;
	  
	  
	  StoreProduct (String label, int price, String category, boolean  hasExpiration, int stock ){
	    
	    
	    System.out.println(label+" "+ price +" "+ category+" "+hasExpiration+" "+stock);
	    
	    
	  }
	  
	  
	  StoreProduct (String label, int price, int stock ){
	    
	    
	    System.out.println(label+" "+ price +" "+ category+" "+hasExpiration+" "+stock);
	    
	    
	  }
	  
	  StoreProduct (String label, int price ){
	    
	    
	    System.out.println(label+" "+ price +" "+ category+" "+hasExpiration+" "+stock);
	    
	    
	  }
	  
}
