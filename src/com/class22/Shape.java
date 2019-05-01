package com.class22;

public class Shape {

	int radius; 
	double pi;
	double area;
	
	Shape (int radius, double pi){
		
	this.radius= radius;
	this.pi= pi;
	this.area=area;
	
	area= pi*radius*radius;
	
	System.out.println(this.area);
	
	}
	
}


class circle extends Shape {
	
	double area;
	
	circle (int radius, double pi){
		
		super(radius, pi);
		// this.area=area;
	
	}
	
//	public void Area () {
//		
//		area= pi*radius*radius;
//		
//		System.out.println(this.area);
//	}
	
}