package basePack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import testScripts.LoginTestScripts;
import utility.ExtentReportHelper;

public class ListenerClass implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		try
		{
			System.out.println("onTestStart");
			String testCaseName = result.getName();
			ExtentReportHelper.createTest(testCaseName);

//			LoginTestScripts loginTestScripts = new LoginTestScripts();
//			loginTestScripts.performLogin();
		} 
		catch (Exception ex)
		{
			try
			{
				ExtentReportHelper.logFail("Exception in method onTestStart : " + ex.getMessage());
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("onTestSuccess : " + result.getName());

	}

	public void onTestFailure(ITestResult result)
	{
		System.out.println("onTestFailure : " + result.getName());

	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("onTestSkipped : " + result.getName());
	}

	public void onStart(ITestContext context)
	{
		System.out.println("onStart");
	}

	public void onFinish(ITestContext context)
	{
		System.out.println("onFinish");
	}

}
