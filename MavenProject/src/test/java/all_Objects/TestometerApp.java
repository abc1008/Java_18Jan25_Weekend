package all_Objects;

import basePack.BaseClass;
import page_classes.ChangePasswordPage;
import page_classes.HeaderPage;

public class TestometerApp extends BaseClass{
	
	private static HeaderPage _headerPage;
	
	public static HeaderPage headerPage()
	{
		_headerPage = new HeaderPage(driver);
		
		return _headerPage;
	}
	
	private static ChangePasswordPage _changePasswordPage;
	
	public static ChangePasswordPage changePasswordPage()
	{
		_changePasswordPage = new ChangePasswordPage(driver);
		
		return _changePasswordPage;
	}


}
