package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://tutorialsninja.com/demo/");

		Thread.sleep(3000);

		WebElement mp3Players = driver.findElement(By.xpath("//a[text()='MP3 Players']"));

		Actions act = new Actions(driver);

		act.moveToElement(mp3Players).build().perform();  // hover 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Show AllMP3 Players']")).click();
		
		

	}
}
