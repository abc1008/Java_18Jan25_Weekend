package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.JsMethods;

public class ExplicitWaitDemo {
	

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		
		
		WebElement clickEle = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		JsMethods.scrollTo(driver, clickEle);
		
		
		clickEle.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		
//		1 Sec = 1000 milliseconds  
		
		
		driver.switchTo().alert().accept();
		
		System.out.println("Completed");
		
		
	}

}
