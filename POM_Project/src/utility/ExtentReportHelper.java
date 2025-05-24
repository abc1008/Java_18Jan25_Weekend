package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHelper {
	
	static ExtentReports extent;
	static ExtentTest tc;

	public ExtentReportHelper()
	{
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("D:\\TRAININGS\\Selenium_JAVA_18JAN25_WEEKEND\\TestReports\\testReport_2.html");
		extent.attachReporter(spark);
	}
	
	
	
	public static void startTest(String testCaseName)
	{
		tc = extent.createTest(testCaseName); 
	}
	
	public static void logPass(String msg)
	{
		tc.log(Status.PASS, msg);
	}
	
	public static void logFail(String msg)
	{
		tc.log(Status.FAIL, msg);
	}
	
	public static void logInfo(String msg)
	{
		tc.log(Status.INFO, msg);
	}
	
	public static void endTest()
	{
		extent.flush();
	}
}
