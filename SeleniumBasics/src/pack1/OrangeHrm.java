package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		
//		driver.findElement(By.partialLinkText(" Inc")).click();
		
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password' or @name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
