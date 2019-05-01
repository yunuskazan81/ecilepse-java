package com.class22;

public class Student {
	
		String name;
		String Address;

		Student(String name, String Address) {
			this.name = name;
			this.Address=Address;
		}
		
		public void displayinfo() {
			System.out.println("Student name "+name+" And address is "+Address);
		}
		
		public static void main(String[] args) {
			Student tt=new Student ("Daniel Sorto", "3404 cali dr l2234");
			tt.displayinfo();
			
		}
}
