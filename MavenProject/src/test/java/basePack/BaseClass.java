package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import page_classes.HeaderPage;
import page_classes.LoginPage;
import utility.ExtentReportHelper;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() throws IOException
	{
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();  
		ExtentReportHelper extentReportHelper = new ExtentReportHelper();
		driver.get("https://devsite.testometer.co.in/login");
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		ExtentReportHelper.startTest("Test Case");
		LoginPage lp = new LoginPage(driver);
		lp.login();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		HeaderPage hp = new HeaderPage(driver);
		hp.logout();
		ExtentReportHelper.endTest();
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
