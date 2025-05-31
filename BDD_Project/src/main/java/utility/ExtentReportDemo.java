package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo
{
	
//	public void logPass(String message)
//	{
//		extentTest.log(Status.PASS, message);
//	}
	
	
	public static void main(String[] args)
	{
		
		ExtentReports extentReports = new ExtentReports();
		
		String reportPath = "D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\Reports\\testReport.html";
		
		ExtentSparkReporter extentSparkReporter  = new ExtentSparkReporter(reportPath);
		
		extentReports.attachReporter(extentSparkReporter);
		
		
		ExtentTest extentTest = extentReports.createTest("Test Case 1");
		
		extentTest.log(Status.PASS, "Password changed successfully");
		
		
		
		
		extentReports.flush();
		
		
	}
	
	
}
