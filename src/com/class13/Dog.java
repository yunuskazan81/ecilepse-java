package com.class13;

public class Dog {

	String breed, color;
    int year;
    boolean angryDog;
    
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Dog dog1=new Dog();
dog1.breed="Hasky";
dog1.angryDog=false;
dog1.color="Grey";
dog1.year=3;

Dog dog2=new Dog();
dog2.breed="Bulldog";
dog2.angryDog=true;
dog2.color="Black";
dog2.year=5;
        
Dog dog3=new Dog();
dog3.breed="Labrador";
dog3.angryDog=false;
dog3.color="White";
dog3.year=7;
        
    }

    void bark() {
        System.out.println("Woow Woof!!!");
    }
    void sit() {
        System.out.println(breed+" can sit");
    }
    void hunt() {
        System.out.println(breed+" can hunt");
    }
		
		
		
		
	

}
