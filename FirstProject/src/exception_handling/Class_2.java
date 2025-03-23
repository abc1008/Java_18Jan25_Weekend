package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_2 {
	
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException
	{
		System.out.println("Before FileInputStream");
		
		FileInputStream file = new FileInputStream("D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\Exce File.xlsx");
		
		Thread.sleep(5000);  // stop the execution for 5 seconds
		
		System.out.println("After FileInputStream");
		
		
	}
	

}
