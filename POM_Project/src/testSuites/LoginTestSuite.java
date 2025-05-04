package testSuites;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testScript_classes.LoginTestScript;

public class LoginTestSuite {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() throws IOException
	{
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();  
		driver.get("https://devsite.testometer.co.in/login");
	}
	
	
	@Test
	public void tc123_LoginTest() throws InterruptedException
	{
		new LoginTestScript().performLogin();
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
