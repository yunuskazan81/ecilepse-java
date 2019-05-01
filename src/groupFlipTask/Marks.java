package groupFlipTask;

public abstract class Marks {

	abstract int getPercentage(int x);
	
	 int average;
}


class studenA extends Marks{

	
	public studenA(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		super.average= (a+b+c)/3;
		
		// System.out.println("The percentage of student A marks is "+super.average);
	}
	
	@Override
	int getPercentage(int average) {
		// TODO Auto-generated method stub
	super.average= average;
		
		return average;
	}
	
}

class studentB extends Marks {
	
	
	public studentB(int a, int b, int c, int d) {
		// TODO Auto-generated constructor stub
		super.average= (a+b+c+d)/4;
		
		//System.out.println("The percentage of student B marks is "+super.average);

	}

	@Override
	int getPercentage(int average) {
		// TODO Auto-generated method stub
		
		super.average=average;
		
		return average;
	}
	
	
}

