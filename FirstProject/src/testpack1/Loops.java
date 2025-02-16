package testpack1;

public class Loops {
	
	public static void main(String[] args) {
		
		
//		System.out.println("ABC");
//		System.out.println("ABC");
//		System.out.println("ABC");
//		System.out.println("ABC");
//		System.out.println("ABC");
		
		System.out.println();
		System.out.println("*** While Loop ***");
		System.out.println();
		
//		SYNTAX: 
		
//		while(boolean condition)
//		{
			// code to repeat 
//		}
		
		int count = 5;
		
		while(count >= 1)
		{
			System.out.println("ABC");
			count--;   

		}
		
		System.out.println("out of while loop");
		
		
		System.out.println();
		System.out.println("*** Do While Loop ***");
		System.out.println();
		
//		SYNTAX: 
		
//		do
//		{
			// code to repeat
//		}
//		while(boolean condition)
		
		int count2 = 5;
		
		do
		{
			System.out.println("ABC");
			count2--;  // 4, 3,2,1,0
		}
		while(count2 >= 1);
		
		
		System.out.println("out of do while loop");
		
		
		System.out.println();
		System.out.println("*** For Loop ***");
		System.out.println();
		
		
//		SYNTAX: 
		
//						1					2,5, 8			4,7
//		for(variable initialization; boolean condition; increment/decrement)
//		{
//					3, 6, 9
				// code to repeat
		
//		}
		
		for(int count3 = 1; count3 <= 5; count3++)
		{
			
			System.out.println("ABC : "+count3);
			
			if(count3 ==  3)
			{
				continue; // to skip the current iteration/repetition and jump to next one
			}
			
			System.out.println("After if block");
		}
		
		
		System.out.println("out of for loop");
		
	}

}
