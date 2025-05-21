package testSuites;

import java.io.IOException;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testScript_classes.ChangePasswordScript;

public class ChangePasswordTestSuite extends BaseClass{
	
	
	@Test
	public void tc_123_ChangePasswordTest() throws InterruptedException, IOException
	{
		new ChangePasswordScript().performChangePassword();
		
	}

}
