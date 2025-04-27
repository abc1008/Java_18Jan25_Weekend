package pack1;

import org.testng.annotations.Test;

public class TestClass1 {
	
	
	@Test(priority = 2)
	public void TestCase2()
	{
		System.out.println("Test Case 2");
		
	}

	
	@Test(priority = 1, enabled = false)
	public void TestCase1()
	{
		System.out.println("Test Case 1");
		
	}
	
	@Test(priority = 2, invocationCount = -5)
	public void TestCase3()
	{
		System.out.println("Test Case 3");
		
	}
	
	
	
	
	

}
