package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://formstone.it/components/checkbox/");

		Thread.sleep(3000);
		
		WebElement chkbx3 = driver.findElement(By.xpath("//input[@id='checkbox-3']"));
		
		WebElement scrollEle = driver.findElement(By.xpath("//a[@name='demo']"));
		
		
		// perform scroll until the given webelement
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollEle);
		
		
		Thread.sleep(3000);
		
		 boolean isEnabled = chkbx3.isEnabled();
		 
		 if(isEnabled == true)
		 {
			 System.out.println("Checkbox 3 is enabled");
		 }
		 else
		 {
			 System.out.println("Checkbox 3 is disabled");
		 }
		 
		 
		 WebElement chkbx2 = driver.findElement(By.xpath("//input[@id='checkbox-2']//.."));
		 if(chkbx2.isSelected())
		 {
			 System.out.println("Checkbox 2 is already Selected");
		 }
		 else
		 {
			 chkbx2.click();
			 System.out.println("Checkbox 2 is now Selected");
		 }
		 
		 WebElement chkbx1 = driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		
		 if(chkbx1.isSelected())
		 {
			 System.out.println("Checkbox 1 is already Selected");
		 }
		 else
		 {
			 chkbx1.click();
			 System.out.println("Checkbox 1 is now Selected");
		 }
	}
	
	
	
	
	
	
	

}
