package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
//	private WebDriver driver;
	
	// locators
	private static final String emailTextBoxXpath = "//input[@placeholder='Email']";
	private static final String passwordTextBoxXpath = "//input[@placeholder='Password']";
	private static final String buttonLoginXpath = "//button[@type='submit']";
	
	
	// web-elemets
	@FindBy(xpath = emailTextBoxXpath) 
	private WebElement textBoxEmail;

	@FindBy(xpath = passwordTextBoxXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginXpath) 
	private WebElement buttonLogin;
	
	
	// constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// methods 
	
	public void login() throws InterruptedException
	{
		textBoxEmail.sendKeys("adityaganjkar88@gmail.com");
		textBoxPassword.sendKeys("abcd@1234");
		buttonLogin.click();
		
		Thread.sleep(3000);
		System.out.println("Login Success");
	}
	
	
	

}
