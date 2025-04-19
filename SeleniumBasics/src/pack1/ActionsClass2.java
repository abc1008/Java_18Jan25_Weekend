package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

	public static void main(String[] args) throws InterruptedException 
	{
			// right click
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Thread.sleep(3000);

		WebElement rightClick = driver.findElement(By.xpath("//*[text()='right click me']"));

		Actions act = new Actions(driver);

		act.contextClick(rightClick).build().perform();   // right click
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		

	}
}
