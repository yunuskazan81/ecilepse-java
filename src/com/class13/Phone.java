package com.class13;

public class Phone {

	String brand, model, OS;
	boolean cam, smart, pen;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone Iphone= new Phone();
		
		
		Iphone.brand="Apple Iphone";
		Iphone.model=" XS max";
		Iphone.OS= "IOS 12";
		Iphone.cam= true;
		Iphone.smart=true;
		Iphone.pen= false;
		
		Iphone.quality();
		Iphone.playgame();
		Iphone.searchWeb();
		Iphone.FaceTime();
		
		
		Phone Galaxy= new Phone();
		
		Galaxy.brand= "Samsung";
		Galaxy.model= "Galaxy S10";
		Galaxy.OS= "Android";
		Galaxy.cam= true;
		Galaxy.smart=true;
		Galaxy.pen= true;
		
		Galaxy.quality();
		Galaxy.playgame();
		Galaxy.searchWeb();
		Galaxy.anytypeOfCall();
		
		
		
		
		Phone Nokia= new Phone();
		
		
		Nokia.brand= "Nokia";
		Nokia.model="3310";
		Nokia.OS= "Android";
		Nokia.cam= true;
		Nokia.smart=true;
		Nokia.pen= false;
			
		Nokia.OldFashion();
		Nokia.Snakegame();
		Nokia.onlyCallandText();
	}
	
	
	void quality() {
		
		
		System.out.println(brand+" "+ model + " is very good quality smart phone");	
	}
	
	void playgame () {
		System.out.println("you can play high definition video game by "+ brand+" "+model);
	}
	
	void anytypeOfCall () {
		System.out.println("you can call someone by videocall or voicecall");
	}
	
	void FaceTime() {
		
		System.out.println("you can call someone with encripted FaceTime app. secure way by "+ brand+ model);
	}
	
	void searchWeb( ) {
		
		System.out.println("you can search on web by "+brand+" "+model);
	}
	void OldFashion () {
		System.out.println(brand+ " is olad-fashion cellphone. it was nice 15 years ago but not anymore.");
	}
   void onlyCallandText () {
	   
	   System.out.println("you can only call and text to someone by "+brand +" "+model);
   }
   void Snakegame () {
	   
	   System.out.println("you can play legendary  digital snake game which was very popular when it was released.");
   }
}
