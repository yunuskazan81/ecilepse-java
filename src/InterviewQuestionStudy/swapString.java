package InterviewQuestionStudy;
import java.util.*;
public class swapString {

	public static void main(String[] args) {
		//swap strings
		String x="Hello";
		String y="Welcome";
		x=x+y; //HelloWelcome 
		y=x.substring(0,x.length()-y.length());
		x=x.substring(y.length()); 
		System.out.println(x); 
		System.out.println(y);
		
		
		// second largest number in the array
		//1. easiest way
		int[] numArray= {12,13,12,15,0, -1}; 
		
		Arrays.sort(numArray); 
		System.out.println(numArray[numArray.length-1]);  // largest
		System.out.println(numArray[numArray.length-2]);  // second largest

		// 2. more efficient way
		int secondlargest=0;
		int largest= numArray[0];
		
		for(int i=0; i<numArray.length; i++) {
			
			if(numArray[i]>largest) {
				
				secondlargest=largest;
				largest= numArray[i];
				
			} else if (numArray[i]>secondlargest && numArray[i]!=largest){
				secondlargest=numArray[i]; }
			
		}
		
		System.out.println("The largest number="+largest+" secondLargest="+secondlargest);
		
	}

}
