package testScript_classes;

import basePack.BaseClass;
import page_classes.LoginPage;
import testSuites.LoginTestSuite;

public class LoginTestScript extends BaseClass 
{

	public void performLogin() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
		
//		 DRY 

	}

}
