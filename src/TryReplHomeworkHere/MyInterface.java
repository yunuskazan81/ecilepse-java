package TryReplHomeworkHere;

public interface MyInterface {

	 void M1();
	  void M2();
	
}


class Main23 implements MyInterface{

	@Override
	 public  void M1(){
	    
	    System.out.println("implementation of method1");
	  }
	  
	  public void M2(){
	    
	   System.out.println("implementation of method2");
	   
	  }
	  
	  
	  public static void main(String[] args) {
		    
		    MyInterface obj= new Main23();
		    
		    obj.M1();
		    obj.M2();
		    
		  }
	
	
}
