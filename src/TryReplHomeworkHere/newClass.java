package TryReplHomeworkHere;

public class newClass {

	public static void main(String[] args) {
	    
		   Y obj= new Y ();
		   
		   obj.methodX();
	    // System.out.println(obj.methodX());
	    
		   methodZ();
	  }
	
	static  String methodZ() {
	    System.out.println ("Class Z");
	    return "Class X";
	  }
	
}
	class X {
	  
	 static  String methodX() {
	    System.out.println ("Class X");
	    return "Class X";
	  }
	}

	class Y extends X {
	  
	 static  String methodX (){
	    System.out.println("Class Y");
	 return "Class X";
	}
	}
