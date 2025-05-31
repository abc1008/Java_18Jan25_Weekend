package page_classes;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ConfigReader;
import utility.ExtentReportHelper;

public class LoginPage
{
	
	// private variables
	private final String textBoxEmailByXpath = "//input[@placeholder='Email']";
	private final String textBoxPasswordByXpath = "//input[@placeholder='Password']";
	private final String buttonLoginByXpath = "//button[@type='submit']";
	private final String buttonNewVersionByXpath = "//b[text()='New Version']";
	
	@FindBy(xpath = textBoxEmailByXpath) // to locate the webelements from UI
	private WebElement textBoxEmail;
	
	@FindBy(xpath = textBoxPasswordByXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath) 
	private WebElement buttonLogin;
	
	@FindBy(xpath = buttonNewVersionByXpath) 
	private List<WebElement> buttonNewVersion;
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);  // initialize all non-static variables
	}
	
	
	// public methods
	public boolean login() throws InterruptedException, IOException
	{
		boolean testResult = false;
		try
		{
			textBoxEmail.sendKeys(ConfigReader.readData("UserID"));
			textBoxPassword.sendKeys(ConfigReader.readData("Password"));
			buttonLogin.click();
			
			if(buttonNewVersion.size() > 0)
			{
				ExtentReportHelper.logPass("Login Successful.");
				testResult = true;
			}
			else
			{
				ExtentReportHelper.logFail("Login Failed.");
				testResult = false;
			}
			
			return testResult;
			
		} 
		catch (Exception ex)
		{
			ExtentReportHelper.logFail("Exception in method : login " + ex.getMessage());
			return false;
		}		
		
		
		

	}
	

	
	

}
