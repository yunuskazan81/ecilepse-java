package TryReplHomeworkHere;

public class testrepl2 {
	
	 public static void main(String[] args) {
		    Child1 ob=new Child1();
		    ob.m1(50,60);
		  }
		}

		class Parent1 {
		  
		  static int a=10, b=20;
		  
		  
		}

		class Child1 extends Parent1 {
		 
		 static int a=30,b=40;
		 
		 int m1 (int a, int b){
		   
		   System.out.println(a+b);
		   System.out.println(this.a+ this.b);
		   System.out.println(super.a+super.b);
		   
		   return 0;
		 }
	
}
