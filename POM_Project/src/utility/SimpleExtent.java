package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SimpleExtent {

//	static ExtentTest tc;
	
	public static void main(String[] args) {
		
		
		ExtentReports extent = new ExtentReports();
		
		ExtentSparkReporter spark = new ExtentSparkReporter("D:\\TRAININGS\\Selenium_JAVA_18JAN25_WEEKEND\\TestReports\\testReport.html");
		
		
		extent.attachReporter(spark);
		
		
		ExtentTest tc = extent.createTest("Test case 1");  /// test case start
		
		tc.log(Status.PASS, "Test Case Pass");
		tc.log(Status.FAIL, "Test Case FAIL");
		tc.log(Status.INFO, "Test Case INFO");
		
		
		extent.flush();
	}
}
