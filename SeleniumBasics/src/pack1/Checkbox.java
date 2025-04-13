package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://practice.expandtesting.com/checkboxes");

		Thread.sleep(3000);
		
		WebElement chkbx1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		
		// perform scroll until the given webelement
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", chkbx1);
		
		
		Thread.sleep(3000);
//		chkbx1.click();
		
		js.executeScript("arguments[0].click();", chkbx1);
		
		
		System.out.println("Completed");
		
	}
	
	
	
	
	
	
	

}
