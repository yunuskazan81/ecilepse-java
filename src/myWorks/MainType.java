package myWorks;

public abstract class MainType {

	  
	  public static void main(String[] args) {
	   
	   MainType obj= new parent();
	   
	   obj.method11();
	   obj.method21();
	   
	   
	  }
	  
	  
	  public abstract void method11 ();
	  public abstract void method21 ();
	  
	}


class parent extends MainType {
		
		int name;
	 

	public void method11 (){
	  
	 System.out.println("abstract method1 implementation in main class"); 
	}
	  public void method21 (){
	    
	    System.out.println("abstract method2 implementation in main class"); 
	  }
	
	  
	}