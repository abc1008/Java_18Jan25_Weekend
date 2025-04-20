package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import utility.CaptureScreen;

public class Login_Screenshot 
{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();   // maximize browser
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		Thread.sleep(3000);
		
		
		WebElement emailTextBox = driver.findElement(By.id("input-email")); // locate
		emailTextBox.sendKeys("ag89111@gmail.com");  // text enter
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("Login@123");
	    
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
	    
	    
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		
		
		
		WebElement logoutMsg = driver.findElement(By.xpath("//div[@id='content']//h1"));
		
		
		if(logoutMsg.getText().contains("Account Logout"))
		{
			System.out.println("Logout Successful");
		}
		else
		{
			System.out.println("Logout Failed");
			
//			TakesScreenshot screen = (TakesScreenshot)driver;
//			File screenShot = screen.getScreenshotAs(OutputType.FILE);
//			File path = new File("D:\\TRAININGS\\Selenium_JAVA_18JAN25_WEEKEND\\Screenshots\\testFile2.png");
//			Files.copy(screenShot, path);
			
			String name = "TestFile";  // _200425_10_51_10
			
			CaptureScreen.printScreen(driver, name);
			
			
		}
		
	}
	
	

}
