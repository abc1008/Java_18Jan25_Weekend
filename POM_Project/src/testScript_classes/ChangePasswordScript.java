package testScript_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import all_Objects.TestometerApp;
import basePack.BaseClass;
import page_classes.ChangePasswordPage;
import page_classes.HeaderPage;

public class ChangePasswordScript extends BaseClass {

	public void performChangePassword() throws InterruptedException, IOException {

		try 
		{
			TestometerApp.headerPage().selectChangePassword();
			TestometerApp.changePasswordPage().changePassword();
		} 
		catch (Exception e) {

			System.out.println("Exception in method : " + e.getMessage());
		}

	}

}
