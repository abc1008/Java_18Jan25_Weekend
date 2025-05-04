package pack1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utility.ConfigReader;

public class ChangePasswordTest 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		
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
		
		
		
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@placeholder='Email']")); // locate
		emailTextBox.sendKeys(ConfigReader.readData("UserId"));  // text enter
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    password.sendKeys(ConfigReader.readData("Password"));
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	    
		
		driver.findElement(By.xpath("//b[text()='New Version']")).click();
		driver.findElement(By.id("page-header-user-dropdown")).click();
		driver.findElement(By.xpath("//span[text()='Change Password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ConfigReader.readData("Password"));
		driver.findElement(By.xpath("//input[@name='confirm_pass']")).sendKeys(ConfigReader.readData("Password"));
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		
	}
	
	
	
	
	
	
	

}
