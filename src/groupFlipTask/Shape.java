package groupFlipTask;

public interface Shape {

	void calculateArea(double r);
	void calculatePerimiter(double r);
	
}
class circle implements Shape {

	@Override
	public void calculateArea(double r) {
		// TODO Auto-generated method stub
		
		
		double Pi =3.14;
		double area;
	
		area= Pi*r*r;
		
		System.out.println("The area of circle which is with radius r is: "+area);
		
	}

	@Override
	public void calculatePerimiter(double r) {
		// TODO Auto-generated method stub
		
		double Pi =3.14;
		double perimeter;
		
		perimeter= 2*Pi*r;
		
		System.out.println("The Perimeter of circle which is with radius r is: "+perimeter);
		
	}
	
	
}

class Square implements Shape {

	@Override
	public void calculateArea(double a) {
		// TODO Auto-generated method stub
		
		double area= a*a;
		
		System.out.println("The area of Square which is with length of side is : "+area);
		
	}

	@Override
	public void calculatePerimiter(double b) {
		// TODO Auto-generated method stub
		
		double perimeter= 4*b;
		
		System.out.println("The perimeter of Square which is with length of side is : "+perimeter);
		
	}
	
	
	
}