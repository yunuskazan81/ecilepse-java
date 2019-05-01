package TryReplHomeworkHere;

class Main1 {
	  
	public static void main(String[] args) {
	
	Retiree obj= new Retiree();
	 
	obj.retiree("Frank", "Smith", 15, "tour");
	
	}
		
	}



class Person {
  
   String name;
   String lastName;
   int age;
  
 public void person (String name, String lastName, int age ){
    
    System.out.println (name+" "+lastName+" "+age);
  }
  
}

class Employees extends Person{
  
  int salary;
  
 public void employee (String name, String lastName, int age, int salary){
    
    System.out.println (name+" "+lastName+" "+age+" "+salary);
  }
}

class Student extends Employees {
  
  int grade;
  
 public void student(String name, String lastName, int age, int grade){
    
  System.out.println (name+" "+lastName+" "+age+" "+grade);
  }
}

class  Retiree extends Student {
  
  String seniorActivity;
  
 public  void retiree (String name, String lastName, int age, String seniorActivity){
    
    System.out.println (name+" "+lastName+" "+age+" "+seniorActivity);
    
  }
  
}