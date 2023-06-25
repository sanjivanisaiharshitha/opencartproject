package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_003_LoginTest extends BaseClass{
	
	
	@Test
	public void test_login()
	{
	try
	{
		
		logger.info("*** starting Tc_003_LoginTest ***");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clicklogin();
		LoginPage lp= new LoginPage(driver);
		lp.setemail(rb.getString("emailaddress"));
		lp.setpsswrd(rb.getString("password"));
		lp.click();
		/*MyAccountPage macc=new MyAccountPage(driver);
		
		boolean targetpage=macc.isMyAccountPageExists();
					
		Assert.assertEquals(targetpage, true);*/
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	}
	
	
			

}
