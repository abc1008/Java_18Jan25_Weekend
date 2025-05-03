package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass5 {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
		
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
		
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("Test Case 2");
		
	}

	
	@Test
	public void TestCase1()
	{
		System.out.println("Test Case 1");
//		
		
	}
	
	@Test
	public void TestCase3()
	{
		System.out.println("Test Case 3");
		Assert.fail();
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	

}
