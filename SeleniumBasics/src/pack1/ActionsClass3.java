package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3 {

	public static void main(String[] args) throws InterruptedException 
	{
			// double click
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Thread.sleep(3000);

		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		Actions act = new Actions(driver);

		act.doubleClick(doubleClick).build().perform();   // double click
		
		

	}
}
