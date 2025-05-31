package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_classes.HeaderPage;
import utility.ConfigReader;
import utility.ExtentReportHelper;

public class BaseClass
{
	public static WebDriver driver;
	public static String dateTimeStamp;
	
	

	public void launchBrowserAndLogin() throws IOException, InterruptedException
	{
		 if (driver == null)
		 {
				LocalDateTime time = LocalDateTime.now();
				DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("ddMMyyyy_HH_mm_ss");
				dateTimeStamp = time.format(dateTimeFormat);
				
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(ConfigReader.readData("TestSiteUrl"));
				ExtentReportHelper extentReportHelper = new ExtentReportHelper(driver, dateTimeStamp);
				
				ExtentReportHelper.createTest(dateTimeStamp);
				TestometerApp.LoginPage().login();
		 }


		
	}
	
	
	public void logoutAndCloseBrowser() throws IOException
	{
		if (driver != null) {
			
			HeaderPage headerPage = new HeaderPage(driver);
			headerPage.selectLogout();
			driver.quit();
			driver = null;
			
		}

	}
	

	

}
