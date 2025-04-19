package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException 
	{
			// right click
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://demo.automationtesting.in/Alerts.html");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		
		Thread.sleep(2000);
		
		 Alert aa = driver.switchTo().alert();
		
//		 aa.accept();
		 
		 aa.dismiss();

	}
}
