package TryReplHomeworkHere;

public abstract class AbstractMain {

	public static void main(String[] args) {
	    
	    Par1 obj= new man();
	    
	    obj.M1();
	    
	Par1 obj1= new man();

	obj1.M2();
	
	  }
}	

	 abstract class Par1 {
	  
	 public abstract void M1();
	  
	  public void M2 (){
	    
	    System.out.println("abstract method2 implementation in parent class");
	    
	  }
	  
	}

	class man extends Par1 {

	    
	  public void M1(){
	    
	    System.out.println("abstract method1 implementation in main class");
	  }
	    
	}

