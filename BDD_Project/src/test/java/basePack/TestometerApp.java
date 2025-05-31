package basePack;

import page_classes.ChangePasswordPage;
import page_classes.DashBoardPage;
import page_classes.HeaderPage;
import page_classes.LoginPage;

public class TestometerApp extends BaseClass
{
	
	private static DashBoardPage _dashBoardPage;
	
	public static DashBoardPage dashBoardPage()  // garbage collection 
	{
		if(_dashBoardPage == null)
		{
			_dashBoardPage = new DashBoardPage(driver);
		}
		
		return _dashBoardPage;
	}
	
	private static ChangePasswordPage _changePasswordPage;
	
	public static ChangePasswordPage changePasswordPage()
	{
		if(_changePasswordPage == null)
		{
			_changePasswordPage = new ChangePasswordPage(driver);
		}
		
		return _changePasswordPage;
	}
	
	private static HeaderPage _headerPage;
	
	public static HeaderPage headerPage()
	{
		if(_headerPage == null)
		{
			_headerPage = new HeaderPage(driver);
		}
		
		return _headerPage;
	}
	
	private static LoginPage _loginPage;
	public static LoginPage LoginPage()
	{
		if(_loginPage == null)
		{
			_loginPage = new LoginPage(driver);
		}
		
		return _loginPage;
	}
	
	
	
	

}
