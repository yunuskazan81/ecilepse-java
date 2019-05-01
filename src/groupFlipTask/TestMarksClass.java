package groupFlipTask;

public class TestMarksClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marks obj= new studenA(50, 80, 100);
		Marks oj= new studentB(90, 30, 80, 100);
		
		System.out.println("The percentage of student A marks is "+obj.getPercentage(obj.average));
		System.out.println("The percentage of student B marks is "+oj.getPercentage(oj.average));
	}

}
