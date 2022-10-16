package Maven_Demo.Maven_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import extent_report_class.ListenerClass;

public class LoginPageTest extends ListenerClass 
{
	
	
	@Test(priority = 1)
	public void checkCredentials()
	{
		
		lp.enterCredentials();
		
	}
	
	@Test(priority = 2)
	public void checkLoginButton()
	{
		
		lp.clickOnLogin();
		
		Assert.assertTrue(false);
	}

}
