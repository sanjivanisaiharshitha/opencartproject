package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_004_LoginDataDrivenTest extends BaseClass{

	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_LoginDDT(String email, String pwd) {
		logger.info(" Starting TC_003_LoginDataDrivenTest ");

		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clicklogin();

			LoginPage lp = new LoginPage(driver);
			lp.setemail(email);
			lp.setpsswrd(pwd);
			lp.click();

			/*MyAccountPage macc=new MyAccountPage(driver);
			boolean targetpage = macc.isMyAccountPageExists();// this method is created MyAccountPage

			if (exp.equals("Valid")) {
				if (targetpage == true) {
					macc.clckbttn();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equals("Invalid")) {
				if (targetpage == true) {
					MyAccountPage myaccpage = new MyAccountPage(driver);
					myaccpage.clckbttn();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}*/

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_003_LoginDataDrivenTest");

	}

}
