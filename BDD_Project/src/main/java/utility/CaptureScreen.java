package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CaptureScreen
{
	
	public static void printScreen(WebDriver driver, String fileName) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver; 
		File screenShot = screen.getScreenshotAs(OutputType.FILE);
		File file = new File("D:\\TRAININGS\\Selenium_JAVA_01FEB25_WEEKDAY_MORNING\\Screenshots\\"+fileName+".jpeg");
		Files.copy(screenShot, file);
	}
	
	

}
