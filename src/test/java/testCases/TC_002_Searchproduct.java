package testCases;

import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.SearchProduct;
import testBase.BaseClass;

public class TC_002_Searchproduct extends BaseClass{
 
@Test
  public void search_product() {
	
	try
	{
	HomePage hm=new HomePage(driver);
	hm.clickMyAccount();
	
	SearchProduct sp=new SearchProduct(driver);
	
	sp.product();
	}
	catch(Exception e)
	{
		
	}
  }
}
