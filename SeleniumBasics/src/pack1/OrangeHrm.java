package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password' or @name='password']")).sendKeys("admin123");
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
