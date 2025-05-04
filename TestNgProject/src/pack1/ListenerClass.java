package pack1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
		// before every test case starts
		System.out.println("onTestStart : "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("onTestSuccess : "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("onTestFailure : " + result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("onTestSkipped : "+ result.getName());
	}


	@Override
	public void onStart(ITestContext context) 
	{
		// first in the entire class
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		// last in the entire class
		System.out.println("onFinish");
	}

}
