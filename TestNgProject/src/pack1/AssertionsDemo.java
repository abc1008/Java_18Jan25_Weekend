package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
	
	
	

	public void TestCase5()
	{
		System.out.println("TestCase5");
		
		
		System.out.println("Before assert");
		
		Assert.fail(); // to fail the test case
		
		System.out.println("After assert");
	}
	
	
	public void TestCase6()
	{
		System.out.println("TestCase6");
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.fail();
		
		System.out.println("Before assertAll");
		
		softAssert.assertAll();
		
		System.out.println("After assertAll");
	}
	
	
	@Test
	public void TestCase7()
	{
		System.out.println("TestCase7");
		
		
		boolean resultFromUi = true;
		
		
//		Assert.assertEquals(resultFromUi, false);
		
//		Assert.assertNotEquals(resultFromUi, false);
		
		
//		Assert.assertTrue(resultFromUi);
		
		Assert.assertFalse(resultFromUi);
	
	}
	
	

}
