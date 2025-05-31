package page_classes;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.ExtentReportHelper;

public class HeaderPage
{
	WebDriver driver;
	// private variables
	private final String buttonProfileIconByXpath = "//button[@id='page-header-user-dropdown']";
	private final String optionChangePasswordByXpath = "//a[@class='dropdown-item changePassword']//span[text()='Change Password']";
	private final String optionLogoutByXpath = "//span[text()='Logout']";
	private final String buttonUpdateByXpath = "//button[text()='Update']";
	private final String buttonLoginByXpath = "//button[@type='submit']";

	@FindBy(xpath = buttonProfileIconByXpath) // to locate the webelements from UI
	private WebElement buttonProfileIcon;

	@FindBy(xpath = optionChangePasswordByXpath)
	private WebElement optionChangePassword;

	@FindBy(xpath = optionLogoutByXpath)
	private WebElement optionLogout;

	@FindBy(xpath = buttonUpdateByXpath)
	private WebElement buttonUpdate;

	@FindBy(xpath = buttonLoginByXpath)
	private List<WebElement> buttonLogin;

	// constructor
	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); // initialize all non-static variables
	}

	private void clickProfileIcon() // helper method
	{
		buttonProfileIcon.click();
	}

	// public methods
	public boolean selectChangePassword() throws IOException
	{
		boolean testResult = true;

		try
		{
			clickProfileIcon();
			optionChangePassword.click();

			ExplicitWait.waitUntilElementVisible(driver, buttonUpdateByXpath);

			if (buttonUpdate.isDisplayed() == true)
			{
				System.out.println();
				ExtentReportHelper.logPass("Selected on Change Password option from dropdown.");
			} else
			{
				ExtentReportHelper.logFail("Failed to select Change Password option from dropdown.");
				testResult = false;
			}
		} catch (Exception ex)
		{
			ExtentReportHelper.logFail("Exception in method : selectChangePassword " + ex.getMessage());
		}

		return testResult;

	}

	public void selectLogout() throws IOException
	{

		try
		{
			clickProfileIcon();
			optionLogout.click();

			if (buttonLogin.size() > 0)
			{
				ExtentReportHelper.logPass("Logout Successful.");
			} 
			else
			{
				ExtentReportHelper.logFail("Logout Failed.");
			}
		} catch (Exception ex)
		{
			ExtentReportHelper.logFail("Exception in method selectLogout : " + ex.getMessage());
		}

	}

}
