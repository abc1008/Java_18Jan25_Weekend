package pack1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindows {
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); // maximize browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);
		
		String mainHandle = driver.getWindowHandle();
		
		System.out.println(mainHandle);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> allWins = driver.getWindowHandles();
		
//		String w = "";
//		
//		for( String win : allWins )
//		{
//			System.out.println(win);
//			w = win;
//		}
//		
//		driver.switchTo().window(w);
//
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("abc");

		System.out.println();
		System.out.println("2nd way");
		System.out.println();
		
		
		ArrayList<String> list = new ArrayList<String>(allWins);
		String thirdWindowhandle = list.get(3);
		driver.switchTo().window(thirdWindowhandle);
		
		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("abc");
	}

	
	
	
	
	
	
	

}
