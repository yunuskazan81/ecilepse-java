package myWorks;

public class quizz {

	public static void main(String[] args) {
	

		
			
		/*
			
			int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
			int n = 6;
			n = arr[arr[n] / 2];
			
			System.out.println(arr[n] / 2);

			int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
			int sum = 0;
			for (int i = 0; i < 3; ++i)
			for (int j = 0; j < 3 ; ++j)
			sum = sum + array_variable[i][j];
			System.out.print(sum / 5);
			
			*/
			
		/*
			int[] array = { 1, 4, 3, 6, 8, 2, 5};
			int what = array[0];

			// scan the array
			for ( int index=0; index < array.length; index++ )
			{ 
			if ( array[ index ] > what ) 
			what = array[ index ]; 
			}
			System.out.println( what ); 
			
			
			int i[] = {12, 15, 16, 17, 19};

			for(int i = 0; i < 5; i++)
			{
			System.out.println(i[i]);
			}
			*/ 
		
		
		
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) 
		{
		if (a[i] % 2== a2[i ] % 5) 
		{
		sum += i * i;
		}
		}
		System.out.println("sum = " + sum);
		

		
		
	}}
		

	


