package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login 
{
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
	}
	
	

}
