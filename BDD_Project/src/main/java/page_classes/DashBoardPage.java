package page_classes;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.ExtentReportHelper;

public class DashBoardPage
{
	WebDriver driver;
	
	// private variables
	private final String buttonNewVersionByXpath = "//b[text()='New Version']";
	private final String buttonProfileIconByXpath = "//button[@id='page-header-user-dropdown']";
	
	
	@FindBy(xpath = buttonNewVersionByXpath) 
	private WebElement buttonNewVersion;
	
	@FindBy(xpath = buttonProfileIconByXpath) 
	private List<WebElement> buttonProfileIcon;
	
	
	// constructor
	public DashBoardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	
	// public methods
	public boolean clickNewVersion() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			buttonNewVersion.click();
			
//			boolean result = ExplicitWait.waitUntilElementInvisible(driver, buttonNewVersion);
			
			if(buttonProfileIcon.size() > 0)
			{
				ExtentReportHelper.logPass("Clicked on New Version button");
				testResult = true;
			}
			else
			{
				ExtentReportHelper.logFail("Failed to clicked on New Version button");
			}
			
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception in method : clickNewVersion "+ex.getMessage());
		}

		return testResult;
		
	}
	

	
	

}
