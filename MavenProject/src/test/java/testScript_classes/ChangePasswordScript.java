package testScript_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import all_Objects.TestometerApp;
import basePack.BaseClass;
import page_classes.ChangePasswordPage;
import page_classes.HeaderPage;
import utility.ExtentReportHelper;

public class ChangePasswordScript extends BaseClass {

	public boolean performChangePassword() throws InterruptedException, IOException {

		boolean testResult = false;
		
		try 
		{
			if(TestometerApp.headerPage().selectChangePassword() == true)
			{
				if(TestometerApp.changePasswordPage().changePassword() == true)
				{
					ExtentReportHelper.logPass("Change Password successful.");
					testResult = true;
				}
				else
				{
					ExtentReportHelper.logFail("Change Password failed.");
				}
			}
			else
			{
				ExtentReportHelper.logFail("Failed to select Change Password.");
			}
		
		} 
		catch (Exception e) 
		{
			ExtentReportHelper.logFail("Exception in method : " + e.getMessage());
			return false;
		}
		
		return testResult;
	}

}
