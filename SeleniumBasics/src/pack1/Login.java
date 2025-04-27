package pack1;

import java.io.IOException;import java.time.Duration;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ConfigReader;

public class Login 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
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
		
		
		
		WebElement emailTextBox = driver.findElement(By.id("input-email")); // locate
		emailTextBox.sendKeys(ConfigReader.readData("UserId"));  // text enter
		
		WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys(ConfigReader.readData("Password"));
	    
	    driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
	    
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Account']")));
	    
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		
		
		driver.quit();
		
		
		
	}
	
	

}
