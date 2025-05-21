package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
	
	// locators
	private static final String profileIconById = "page-header-user-dropdown";
	private static final String changePasswordOptionXpath = "//span[text()='Change Password']";
	private static final String textBoxPasswordXpath = "//input[@name='password']";
	private static final String textBoxConfPasswordXpath = "//input[@name='confirm_pass']";
	private static final String optionLogoutXpath = "	//span[text()='Logout']";
	
	
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

	
	// constructor
	public HeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// methods 
	public void selectChangePassword() throws InterruptedException
	{
		try
		{
			profileIcon.click();
			changePasswordOption.click();	
		}
		catch (Exception e) 
		{	
			System.out.println("Exception in method 'selectChangePassword' : "  + e.getMessage());// TODO: handle exception
		}

	}
	
	public void logout()
	{
		try
		{
			profileIcon.click();
			
			optionLogout.click();
		}
		catch (Exception e) {
			
			System.out.println("Exception in method 'logout' : "  + e.getMessage());
		}

	}
	
	
	

}
