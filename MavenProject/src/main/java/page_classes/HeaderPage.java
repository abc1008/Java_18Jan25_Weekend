package page_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExtentReportHelper;

public class HeaderPage {
	
	// locators
	private static final String profileIconById = "page-header-user-dropdown";
	private static final String changePasswordOptionXpath = "//span[text()='Change Password']";
	private static final String textBoxPasswordXpath = "//input[@name='password']";
	private static final String textBoxConfPasswordXpath = "//input[@name='confirm_pass']";
	private static final String optionLogoutXpath = "	//span[text()='Logout']";
	private static final String buttonUpdateXpath = "//button[text()='Update']";
	
	// web-elemets
	@FindBy(id = profileIconById) 
	private WebElement profileIcon;

	@FindBy(xpath = changePasswordOptionXpath) 
	private WebElement changePasswordOption;
	
	@FindBy(xpath = textBoxPasswordXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = textBoxConfPasswordXpath) 
	private WebElement textBoxConfPassword;
	
	
	@FindBy(xpath = optionLogoutXpath) 
	private WebElement optionLogout;
	
	@FindBy(xpath = buttonUpdateXpath) 
	private List<WebElement> buttonUpdate;
	

	
	// constructor
	public HeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// methods 
	public boolean selectChangePassword() throws InterruptedException
	{
		boolean testResult = false;
		try
		{
			profileIcon.click();
			changePasswordOption.click();	
			
			if(buttonUpdate.size() > 0)
			{
				ExtentReportHelper.logPass("Selected Change Password option from profile icon");
				testResult = true;
			}
			else
			{
				ExtentReportHelper.logFail("Failed to selected Change Password option from profile icon");
			}
			
			return testResult;
		}
		catch (Exception e) 
		{	
			ExtentReportHelper.logFail("Exception in method 'selectChangePassword' : "  + e.getMessage());
			return false;
		}

	}
	
	public void logout()
	{
		try
		{
			profileIcon.click();
			
			optionLogout.click();
			
			ExtentReportHelper.logPass("Logout Successful");
		}
		catch (Exception e) 
		{
			ExtentReportHelper.logFail("Exception in method 'logout' : "  + e.getMessage());
		}

	}
	
	
	

}
