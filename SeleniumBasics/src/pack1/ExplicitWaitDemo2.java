package pack1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.JsMethods;

public class ExplicitWaitDemo2 {
	

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='btn1']"));
//		JsMethods.scrollTo(driver, clickEle);
		btn1.click();
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt1']")));
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(250))   // 40 times verification
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt1']")));
		
		
		driver.findElement(By.xpath("//input[@id='txt1']")).sendKeys("ABC");
		
		
		
		
		
		// visibility
		// invisibility
		// alert
		// textToBePresentInElement
		// clickable 
		// frameToBeAvailableAndSwitchToIte
		
	}

}
