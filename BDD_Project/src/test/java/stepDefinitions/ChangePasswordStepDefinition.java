package stepDefinitions;

import java.io.IOException;

import basePack.TestometerApp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.ExtentReportHelper;

public class ChangePasswordStepDefinition {
	@Given("user navigates to change password page")
	public void selectChangePasswordFromProfile() throws IOException 
	{
		if (TestometerApp.headerPage().selectChangePassword() == true) 
		{
			System.out.println("Navigated to Change Password");
		} 
		else 
		{
			System.out.println("Failed to navigated to Change Password");
		}

	}

	@And("enters valid credentials and hits update button")
	public void enterCredentialsAndHitUpdte() throws IOException {

		if (TestometerApp.changePasswordPage().enterCredsAndHitUpdate() == true) {
			ExtentReportHelper.logPass("Entered credentials.");
		} else {
			ExtentReportHelper.logFail("Failed to enter credentials.");
		}

	}

	public void verifyPasswordChange() throws IOException {
		if (TestometerApp.changePasswordPage().verifyChangePasswordSuccess() == true) {
			ExtentReportHelper.logPass("Password changed successfully");
		} else {
			ExtentReportHelper.logFail("Failed to change password.");
		}
	}
	
	
	@And("enters invalid password and hits update button")
	public void enterInvalidCreds() throws IOException
	{
		if(TestometerApp.changePasswordPage().enterInvalidCredsAndHitUpdate())
		{
			ExtentReportHelper.logPass("invalid credentials entered");
		}
		else
		{
			ExtentReportHelper.logFail("failed to enter invalid creds.");
		}
	}
	
	@Then("infield error message should be displayed")
	public void verifyErrorMsg() throws IOException
	{
		if(TestometerApp.changePasswordPage().verifyInfieldError())
		{
			ExtentReportHelper.logPass("Error verified successfully");
		}
		else
		{
			ExtentReportHelper.logPass("Failed to verify error.");
		}
	}

}
