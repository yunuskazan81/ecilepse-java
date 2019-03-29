package com.class10;

public class aritmaticOperatorsWith2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int sum = 0;
		 
		 int[][] arr= {
					{1,2,3},//1 array that stored with index 0
					{10,20,30},//2 array with index 1
					{100,200,300} //3 array with index 2
					
		 };
	/*        
         //how many total arrays
for(int i=0; i<arr.length; i++) {
 for(int j=0; j<arr[i].length; j++ ) {//0  //1  //2
     System.out.print(arr[i][j]+" ");
     
     sum +=arr[i][j];
     
 }
 System.out.println(sum);
 System.out.println();
}
*/

System.out.println("--------For each Loop-------");
//loop through each element inside 2D Array--> each element=array
for(int[] singleArray:arr) {
 //loop through each single array
 for(int numbers:singleArray) {//{1,2,3}
     
     System.out.print(numbers+" ");
     sum +=numbers;
 }
 System.out.println(sum);
 System.out.println();
}
		
		
	}

}
