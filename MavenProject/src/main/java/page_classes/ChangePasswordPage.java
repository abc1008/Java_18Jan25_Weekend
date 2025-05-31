package page_classes;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ConfigReader;
import utility.ExplicitWait;
import utility.ExtentReportHelper;

public class ChangePasswordPage 
{
	
	WebDriver driver;
	
	// locators
	private static final String textBoxPasswordXpath = "//input[@name='password']";
	private static final String textBoxConfPasswordXpath = "//input[@name='confirm_pass']";
	private static final String buttonUpdateXpath = "//button[text()='Update']";
	private static final String successMsgXpath = "//span[text()='Success!']";
	
	
	// web-elemets
	
	@FindBy(xpath = textBoxPasswordXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = textBoxConfPasswordXpath) 
	private WebElement textBoxConfPassword;
	
	@FindBy(xpath = buttonUpdateXpath) 
	private WebElement buttonUpdate;
	
	@FindBy(xpath = successMsgXpath) 
	private List<WebElement> successMsg;
	
	// constructor
	public ChangePasswordPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// methods 
	
	public boolean changePassword() throws InterruptedException, IOException
	{	
		System.out.println("This is new branch.");
		
		boolean testReult = true;
		
		try 
		{
			textBoxPassword.sendKeys(ConfigReader.readData("Password"));
			ExtentReportHelper.logInfo("Entered Password");
			textBoxConfPassword.sendKeys(ConfigReader.readData("Password"));
			ExtentReportHelper.logInfo("Entered Confirm Password");
			
			buttonUpdate.click();
			ExtentReportHelper.logInfo("Clicked on update button");
			
			if(successMsg.size() > 0)
			{
				ExtentReportHelper.logPass("Password Changed.");
			}
			else
			{
				ExtentReportHelper.logFail("Failed to Change Password.");
				testReult = false;
			}

			ExplicitWait.waitUntilEleInvisible(driver, successMsg.get(0));
			return testReult;
		} 
		catch (IOException e) 
		{
			ExtentReportHelper.logFail("Exception in method 'changePassword' : "+ e.getMessage());
			return false;
		}
	}

}
