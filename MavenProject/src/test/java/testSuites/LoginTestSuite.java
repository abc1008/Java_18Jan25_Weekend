package testSuites;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import testScript_classes.LoginTestScript;

public class LoginTestSuite {

	
	
	@Test
	public void tc123_LoginTest() throws InterruptedException
	{
		new LoginTestScript().performLogin();
	}
	
	

	

}
