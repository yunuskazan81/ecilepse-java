package TryReplHomeworkHere;

public class TestSuperKeyword {

	public static void main(String[] args) {
		child3 obj= new child3();
	    child3 obj1=new child3("Parent Constructor in parent class with one argument");
	    
	  }
	}

	class parent3 {
	 
	 parent3 (String a){
	   
		
	  System.out.println(a);
	  
	 } 
	  
	}

	class child3 extends parent3 {
	  
		 child3 (){
			 
			  super("Parent Constructor in parent class with one argument");
			  
		    System.out.println("Child Constructor in child class with zero argument");
		  }
		  
		  child3 (String a){
		    
			  this ();
		    
		    // System.out.println("Child Constructor in child class with one argument");
		    
		  }
	
}
