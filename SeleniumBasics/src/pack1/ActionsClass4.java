package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass4 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();   // maximize browser
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		Thread.sleep(3000);
		
		
		WebElement emailTextBox = driver.findElement(By.id("input-email")); // locate
		emailTextBox.sendKeys("ag89111@gmail.com");  // text enter
		Thread.sleep(3000);
		
		
		Actions act  = new Actions(driver);
		
		act.sendKeys(Keys.TAB).sendKeys("Login@123").build().perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		

	   
	}
	
	

}
