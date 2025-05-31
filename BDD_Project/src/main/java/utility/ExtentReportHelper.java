package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class ExtentReportHelper
{
	private static ExtentReports extentReports;
	private static ExtentTest extentTest;
	static WebDriver driver;
	
	public ExtentReportHelper(WebDriver driver, String dateTimeStamp)
	{
		this.driver = driver;
		extentReports = new ExtentReports();
		String reportPath = "D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\Reports\\TestReport_"+dateTimeStamp+".html";
		ExtentSparkReporter extentSparkReporter  = new ExtentSparkReporter(reportPath);
		extentReports.attachReporter(extentSparkReporter);
	}
	
	
	public static void createTest(String testCaseName)
	{
		extentTest = extentReports.createTest(testCaseName);
	}
	
	
	public static void logPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}
	
	public static void logFail(String message) throws IOException
	{
		extentTest.log(Status.FAIL, message, printScreen(driver));
	}
	
	public static void logInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}
	
	public static void logWarning(String message)
	{
		extentTest.log(Status.WARNING, message);
	}
	
	public static void logSkip(String message)
	{
		extentTest.log(Status.SKIP, message);
	}
	
	public static void endTest()
	{
		extentReports.flush();
	}
	
	
	public static Media printScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver; 
		String screenShot = screen.getScreenshotAs(OutputType.BASE64);
		
		MediaEntityBuilder builder = MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot);
		
		return builder.build();
	}
	
	

}
