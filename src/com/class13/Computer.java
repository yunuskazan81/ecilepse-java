package com.class13;

public class Computer {
	
	//1. feature, attribute, state;
	
	String Screen, OS;
	boolean Mouse, Keyboard;
	double Size;
	int Ram;
	// 2. Action/behaviour;
	
	String WatchMovie, doCoding,playGames, playMusic, Brand;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer MacbookPro= new Computer();
		
		
		
		MacbookPro.Mouse=true;
		MacbookPro.Keyboard=true;
		MacbookPro.Screen= "ultra HD 4K solution screen";
		MacbookPro.Size=15.4;
		MacbookPro.Ram= 16;
		MacbookPro.OS="Mac OS operating system";
		MacbookPro.Brand= "Apple";
		
		
		
		
		MacbookPro.watchMovie();
		MacbookPro.doJavaCoding();
		MacbookPro.playMusic();
        
        Computer comp2 = new Computer();
        
        comp2.Mouse = false;
        comp2.Keyboard = false;
        comp2.Size = 17.5;
        comp2.Ram = 6;
        comp2.OS = "Mac OS";
        comp2.Brand="HP";
        
        comp2.watchMovie();
        comp2.doJavaCoding();
        comp2.playMusic();
	}
    
    void watchMovie() {
    	System.out.println("We can watch movie on a computer "+Brand);
    }
	
	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer "+Brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our computer "+Brand);
	}

	
	

	
	
	
	
	
	
}
