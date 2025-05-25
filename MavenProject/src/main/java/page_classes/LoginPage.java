package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.ExtentReportHelper;

public class LoginPage {
	
	private WebDriver driver;
	
	// locators
	private static final String emailTextBoxXpath = "//input[@placeholder='Email']";
	private static final String passwordTextBoxXpath = "//input[@placeholder='Password']";
	private static final String buttonLoginXpath = "//button[@type='submit']";
	private static final String profileIconByXpath = "//button[@id='page-header-user-dropdown']";
	
	
	
	// web-elemets
	@FindBy(xpath = emailTextBoxXpath) 
	private WebElement textBoxEmail;

	@FindBy(xpath = passwordTextBoxXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginXpath) 
	private WebElement buttonLogin;
	
	@FindBy(xpath = profileIconByXpath) 
	private WebElement profileIcon;
	
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// methods 
	
	public void login() throws InterruptedException
	{
		textBoxEmail.sendKeys("adityaganjkar88@gmail.com");
		textBoxPassword.sendKeys("abcd@1234");
		buttonLogin.click();
		
		ExplicitWait.waitUntilEleVisible(driver, profileIcon);
		
		ExtentReportHelper.logPass("Login Successful");
		

	}
	
	
	

}
