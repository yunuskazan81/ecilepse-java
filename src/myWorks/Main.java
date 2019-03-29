package myWorks;


import java.util.Scanner;


public class Main {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			/*
			
			
			String subject= "Manual testing";
			String subject1= "Java";
			String today;
			
			
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Is it weekend?");
			
			boolean weekend = true;
			
			today=sc.nextLine();
			
			
			
			if (!weekend) {System.out.println("Today you will be learning "+ subject);}
			
			else {System.out.println("Today you will be learning "+ subject1);}
			
			
			 boolean loan= true;
			  int cs;
			  String x= "Unknown";
			  
			  Scanner scan= new Scanner(System.in);
			  
			  
			  
			  System.out.println("Do you need a loan? ");
			  
			  loan= scan.nextBoolean();
			  
			  
			  if (loan) {System.out.println ("What is your credit score");
			  
			  
			 cs=scan.nextInt();
			  
			    
			    if (cs<600) {System.out.println("Not eligible");}
			    
			    else if (cs>=600 && cs<700) {System.out.println("Maybe eligible");}
			    
			     else if (cs>=700 && cs<800) {System.out.println("Eligible");}
			    
			     else if (cs>=800) {System.out.println("Definitely eligible");}
			    
			  }
			  
			  
			  else {System.out.println("The eligibility is "+ x);}
			  
			*/
			
			/*
			
			 String log1= "AND";
			  String log2= "OR";
			  String log3= "NONE";
			  
			  
			  String x;
			  String y;
			  
			  int a;
			  int b;
			  
			  Scanner sc=new Scanner(System.in);
			  
			  System.out.println("Please enter two strings");
			  
			  x=sc.nextLine();
			  y=sc.nextLine();
			  
			   System.out.println("Please enter two numbers");
			   
			   a=sc.nextInt();
			   b=sc.nextInt();
			   
			   if(x.equals(y) && a==b){System.out.println(log1);}
			   
			   else if (a!=b || x.equals(y)) {System.out.println(log2);}
			  
			  else if (a!=b && x!=y) {System.out.println(log3);}
			  
			   */
			
			
			/*
			
			String a="Water";
			String b="Coffe";
			String c="Tea";
			String d="Nothing";

			boolean T=true;

			boolean S=true;


			Scanner ask= new Scanner(System.in);

			System.out.println("Are you thirsty?");

			T=ask.nextBoolean();

			System.out.println("Are you sleepy?");

			S=ask.nextBoolean();


			if (T == true && S== false) {System.out.println("Looks like you need "+ a);}

			else if (T== true && S== true ) {System.out.println("Looks like you need "+ b);}

			else if (T== false && S== false ) {System.out.println("Looks like you need "+ c);}

			else {System.out.println("Looks like you need "+ c);}
			
			*/ 
			
			 int babyAge;
			    String scenerio;
			    
			    
			    Scanner age = new Scanner(System.in);
			    
			    System.out.println("enter the age of the Child");
			    
			    babyAge= age.nextInt();
			    
			    
			    switch (babyAge) {
			      
			      
			      case 1 :
			    	  scenerio= "You can Crawl";
			        break;
			        
			        
			        case 2 :
			        	scenerio= "You can Talk";
			        break;
			      
			       case 3 :
			    	   scenerio= "You can Dance";
			        break;
			        
			        
			        case 4 :
			        	scenerio= "You can get  Trouble";
			        break;
			        
			        default :
			        	scenerio = "I don't know how old you are";
			      
			    }
			    
			    System.out.println(scenerio);
			
			

			}
			
			
			
		}
	


