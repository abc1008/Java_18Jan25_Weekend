package exception_handling;

import java.io.IOException;

public class Class_1 {
	
	public static void main(String[] args) {
		
//		try
//		{
//			
//		}
//		catch(nameOfException)
//		{
//			
//		}
	
		try
		{
			// risky code
			int a = 10;
			int b = 0;
			int c = a/b;
			
//			ArrayIndexOutOfBoundsException
			
			System.out.println("After risky code");
			System.out.println(c);
		}
		catch(Throwable ex)
		{
			System.out.println("Catch Block Running");
			ex.printStackTrace();
		}
		finally
		{
			// Clean Up activities
			System.out.println("Finally block running.");
		}
		
		System.out.println("After Try Catch");
		
	}
	
	
	
	
	
	
	

}
