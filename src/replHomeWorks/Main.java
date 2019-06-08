package replHomeWorks;

public class Main implements MyInterface2 {

	
	
	public static void main(String[] args) {
		
		MyInterface2 obj= new Main();
		
		obj.method1();
		obj.method2();
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("welcome to syntax solutions");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
		System.out.println("hi syntax solutions how are you");
	}
	
}
