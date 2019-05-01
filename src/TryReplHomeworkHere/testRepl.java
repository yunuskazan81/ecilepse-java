package TryReplHomeworkHere;

public class testRepl {

	
	 public static void main(String[] args) {
		    
		    parent obj= new child ();
		    
		    obj.m1();
		  }
		}


		class parent {
		  
		  protected void m1 (){
		    
		    System.out.println("Protected method in parent class");
		    
		    // return 0;
		  }
		  
		}

		class child extends parent {
		  
		  
		  public void m1 (){
		    
		    System.out.println("public method in parent class");
		    
		   //  return 0;
		  }
		  
		}
