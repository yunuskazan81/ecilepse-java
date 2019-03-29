package com.class10;

public class ForLoopToRetrieveAllvalueFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Task 1;
		 Create an array of cars : american, german, korean, italian. Then retrieve all values from that array;
		 */
		

		String [] made = {"American", "Germanian", "Japan", "Korean","Italian"};
		
		int m=0;
		
		
		String [][] brand = {
				
				
				// {"American", "Germanian", "japan", "korean","italian"},
				{"chevy","ford", "lincoln","dodge"},
				{"BMW","Audi","Opel","volkswagen"},
				{"Toyota"," Honda", "Suzuki","Mazda"},
				{"Hyundai", "Kia"},
				{"jeep", "Maseratti","ferrari"},
				
		};
		
		System.out.println("\n Task 1; ");
		
		
		for (int i=0; i<brand.length; i++) {
			
			for(int a=0; a<brand[i].length; a++) {
				
				if (m==a) {
					
					System.out.println("\n"+made[i]+ " Cars: ");
					System.out.println("--------------");
					
				}
				
				System.out.print(" "+brand[i][a]+",");
			}
			
			System.out.println();
			
		}
		
		/* Task 2: Create an array of countries: 
		 * north america countries, 
		 * south america countries, 
		 * europe countries, 
		 * asian countries, 
		 * african countries. 
		 * Then print all values from that array.
		*/
		
		
		String[] region = {"North America","South America","Europa","Africa","Asia"};
	
		String [][] countries= {			
				
				{"Canada","United Stated Of America"},
				{"Argentina", "Colombia","Venezuela", "Cuba", "Haiti", "Brasil"},
				{"Germany","France","Italy","Belgium","Denmark","Turkey", "Greece"},
				{"Kenya","Somalia","Senegal","Madagaskar","Ruanda","Sougth Africa","Nigeria", "Cambodia"},
				{"Taiwan", "Tailand","China", "North/South Korea","Singapur","Hongkong"},	
		};
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("\n Task 2; "); 
		
for (int i=0; i<countries.length; i++) {
			
			for(int a=0; a < countries[i].length; a++) {
				
				if (m==a) {
					
					System.out.println("\n"+region[i]+ " Countries: ");
					System.out.println("--------------");			
				}
				
				System.out.print(" "+countries[i][a]+", ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
