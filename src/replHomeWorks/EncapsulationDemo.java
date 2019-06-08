package replHomeWorks;

public class EncapsulationDemo {


	  private String empName;
	  private int empAge;
	  
	  public void setValues(String empName, int empAge){
	    
	    this.empName= empName;
	    this.empAge= empAge;
	    
	    
	  }
	  
	  public String getName() {
	    
			return empName;
		}
		public int getAge() {
		  
			return empAge;
		}
	  
	}