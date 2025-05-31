package page_classes;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ExplicitWait;
import utility.ExtentReportHelper;

public class ChangePasswordPage
{
	WebDriver driver;
	
	// private variables
	private final String textBoxPasswordByXpath = "//input[@name='password']";
	private final String textBoxConfirmPasswordByXpath = "//input[@name='confirm_pass']";
	private final String buttonUpdateByXpath = "//button[text()='Update']";
	private final String successMsgByXpath = "//span[text()='Success!']";
	private final String infieldErrorXpath = "//div[@class='col-sm-12']//span[text()='The Confirm Password field does not match the Password field.']";
	
	
	@FindBy(xpath = textBoxPasswordByXpath) // to locate the webelements from UI
	private WebElement textBoxPassword;
	
	@FindBy(xpath = textBoxConfirmPasswordByXpath) 
	private WebElement textBoxConfirmPassword;

	@FindBy(xpath = buttonUpdateByXpath) 
	private WebElement buttonUpdate;
	
	@FindBy(xpath = successMsgByXpath) 
	private List<WebElement> successMsg;
	
	@FindBy(xpath = infieldErrorXpath) 
	private List<WebElement> infieldError;
	
	// constructor
	public ChangePasswordPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	// public methods
	public boolean enterCredsAndHitUpdate() throws IOException 
	{
		boolean testResult = true;
		
		try
		{
			textBoxPassword.sendKeys("abcd@1234");
			textBoxConfirmPassword.sendKeys("abcd@1234");
			buttonUpdate.click();
			
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception in method : changePassword "+ex.getMessage());
			testResult = false;
		}
		
		return testResult;
	
	}
	
	public boolean verifyChangePasswordSuccess() throws IOException
	{
		boolean testResult = false;
		
		if(successMsg.size() > 0)
		{
			ExtentReportHelper.logPass("Password changed successfully");
			testResult = true;

		}
		else
		{
			ExtentReportHelper.logFail("Password change failed.");
		}
		
		ExplicitWait.waitUntilElementInvisible(driver, successMsg.get(0));
		
		return testResult;
	}
	

	public boolean enterInvalidCredsAndHitUpdate() throws IOException 
	{
		boolean testResult = true;
		
		try
		{
			textBoxPassword.sendKeys("abcd@12");
			textBoxConfirmPassword.sendKeys("abcd@124");
			buttonUpdate.click();
			
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception in method : changePassword "+ex.getMessage());
			testResult = false;
		}
		
		return testResult;
	
	}
	
	
	public boolean verifyInfieldError() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			if(infieldError.size() > 0)
			{
				ExtentReportHelper.logPass("Infield error displayed.");
				testResult = true;
			}
			else
			{
				ExtentReportHelper.logPass("Infield error not displayed.");
			}
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.logFail("Exception in method : verifyInfieldError "+ex.getMessage());
			testResult = false;
		}
		
		return testResult;
	}
	

}
