package pack1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class SeleniumCode {
	
	static WebDriver driver;
	
	public void launchBrowser() throws IOException
	{
		String browserName = ConfigReader.readData("Browser");
		
		switch(browserName)
		{
			
		case "CHROME":
			 driver = new ChromeDriver();
			 break;
		
		case "EDGE":
			 driver = new EdgeDriver();
			 break;
			 
		default:
			System.out.println("Incorrect Browser Name");
			break;
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();  
		driver.get(ConfigReader.readData("TestSiteUrl"));
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		launchBrowser();
		WebElement emailTextBox = driver.findElement(By.id("input-email")); // locate
		emailTextBox.sendKeys(ConfigReader.readData("UserId"));  // text enter
		
		WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys(ConfigReader.readData("Password"));
	    
	    driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
	}
	
	
	@Test
	public void testCase1() throws InterruptedException
	{
		System.out.println("Test Case 1");
	    
		Thread.sleep(3000);
	}
	
	@Test
	public void testCase2() throws InterruptedException
	{
		System.out.println("Test Case 2");
	    
		Thread.sleep(3000);
	}
	
	

	public void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterMethod
	public void logout()
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']")));
	    
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		
		closeBrowser();
	}
	
	
	


}
