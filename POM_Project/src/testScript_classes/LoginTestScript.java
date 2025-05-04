package testScript_classes;

import page_classes.LoginPage;
import testSuites.LoginTestSuite;

public class LoginTestScript extends LoginTestSuite{
	
	
	public void performLogin() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
		
	}
	
	
	
	
	
	
	
	
	

}
