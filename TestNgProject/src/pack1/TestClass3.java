package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 
{
	
	@Test(groups = "Sanity")
	public void TestCase4()
	{
		System.out.println("TestCase4");
		
	}
	
	@Test(groups = "Regression")
	public void TestCase6()
	{
		System.out.println("TestCase6");
//		Assert.fail();
	}
	
	@Test(groups = "Sanity")
	public void TestCase5()
	{
		System.out.println("TestCase5");
		Assert.fail();
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest");
	}

	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@Test(dependsOnGroups = "Sanity")
	public void TestCase9()
	{
		System.out.println("TestCase9");
	}
	
	
}
