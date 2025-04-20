package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {
	
	
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://ui.vision/demo/webtest/frames/");

		Thread.sleep(3000);

		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3); // switch selenium focus into this frame
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("ABC");
		
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();   // selenium focus back to main webpage
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("PQR");
		
		
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		
		WebElement frameinFrame = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com/forms/')]"));
		
		driver.switchTo().frame(frameinFrame);
		
		
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		
		
		Thread.sleep(3000);
		
//		driver.switchTo().defaultContent();
//		frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
//		driver.switchTo().frame(frame3); // switch selenium focus into this frame
		
		driver.switchTo().parentFrame();  // switch selenium focus to immediate parent 
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("XYZ");
		
		
		

		
		
		
		
		
	}
	
	
	
	
	
	
	

}
