package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{

	
	
	@Test
	public void test_account_Registration()
	{
		logger.info("*** starting Tc_001_AccountRegistartionTest ***");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("clicked on register");
		hp.clickRegister();
		
		RegistrationPage rp=new RegistrationPage(driver);
		rp.setFstname(randomeString().toUpperCase());
		rp.setLstname(randomeString().toUpperCase());
		rp.setmail(randomeString()+"@gmail.com");
		String password=randomeAlphaNumeric();
		rp.setpsswrd(password);
		
		rp.agreeplcy();
		rp.cntbtton();
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
}


