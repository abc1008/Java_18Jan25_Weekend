package hooks;

import java.io.IOException;

import basePack.BaseClass;
import basePack.TestometerApp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import page_classes.HeaderPage;
import page_classes.LoginPage;
import utility.ExtentReportHelper;

public class Hooks
{
	BaseClass base;
	
	@Before
	public void initilizeTest() throws IOException, InterruptedException
	{
		base =	new	BaseClass();
		base.launchBrowserAndLogin();
	}
	
	@After
	public void closeBrowser() throws IOException
	{
		
		ExtentReportHelper.endTest();
		base.logoutAndCloseBrowser();

	}
	
	
	
	
	
}
