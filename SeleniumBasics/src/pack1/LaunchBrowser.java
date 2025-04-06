package pack1;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchBrowser 
{
	public static void main(String[] args) throws InterruptedException {
		
		
//		EdgeDriver driver = new EdgeDriver();  // browser launch
//		
//		ChromeDriver driver2 = new ChromeDriver();
//		
//		RemoteWebdriver driver = new ChromeDriver();
		
		WebDriver driver = new EdgeDriver();
		
//		driver.manage().window().maximize();  
		
//		Options manageVar = driver.manage();
//		Window winRef = manageVar.window();
//		winRef.maximize();
		
		driver.manage().window().maximize();   // maximize browser
		driver.get("https://www.google.com/");
		
//		String pageTitleFromUI = ;
		
//		System.out.println(pageTitle);
		
		if(driver.getTitle().equals("Google.com"))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		
		System.out.println(driver.getCurrentUrl());  // return the Current page URL 
		
		
		driver.navigate().refresh();   // refresh page
		Thread.sleep(3000);
		
		driver.navigate().back();   // back button
		Thread.sleep(3000);
		
		driver.navigate().forward();  // forward button
		Thread.sleep(3000);
		
		driver.quit();   // close browser
		
		
	}
	
	

}
