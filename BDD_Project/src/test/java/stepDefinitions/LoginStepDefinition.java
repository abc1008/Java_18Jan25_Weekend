package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition
{

	@Given("user is navigated to login page")
	public void hitURL()
	{
		System.out.println("hitURL");
	}
	
	
	@And("enters valid credentials")
	public void enterCredentials2()
	{
		System.out.println("enterCredentials");
	}
	
	@And("hits login button")
	public void hitLoginButton()
	{
		System.out.println("hitLoginButton");
	}
	
	@Then("Then user should be logged in successfully.")
	public void verifyUserLogin()
	{
		System.out.println("verifyUserLogin");
	}
	
	@And("enters invalid credentials and hits update button")
	public void invalidCreds()
	{
		
	}
	
}
