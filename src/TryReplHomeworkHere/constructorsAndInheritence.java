package TryReplHomeworkHere;

public class constructorsAndInheritence {
	
	

public static void main(String[] args) {
	
	A1 a = new B1(4);
	 
	}
	

}
	class A1 {
		
		public int t;
		double z;
		
		public static void main(String[] args) {
			
		
			
		}
		
		
		
	    A1() {
	    	
	    	System.out.println("i'm a constructor in class A");
	    	
	    }          // Constructor
	    
	    
	    A1(int t, double z) { 
	    	
	    	this.t= t;
	    	this.z=z;
	    	
	    	System.out.println();
	    }     // Constructor
	    
	    A1(boolean c) { 
	    	
	    	System.out.println("I'm the boolean constructor");
	    } // Constructor
		
		
	}
	
	class B1 extends A1 {
	    
		B1() {
	        this(3, 7);
	        
	        
	    }
	    B1(int a) {
	        // super();
	    }
	    B1(String b) {
	        super(true);
	    }
	    B1(int d, int c) { // Calls super() implicitly
	    	
	    	System.out.println("this(3,7) constructor "+ (d+c));
	    	
	    }
	}
	
//	B a = new B(8, 7);
//	A b = new B(8);
  
//  B b = new B(true): // ERROR because there is no boolean value for constructor B; 

	

