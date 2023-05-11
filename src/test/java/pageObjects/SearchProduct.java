package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends BasePage{

	public SearchProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//elements
	@FindBy(xpath = "(//img[@title='iPhone'])[1]")
	WebElement searchbar;
	
	
	//actions
	
	
	public void product(){
		searchbar.click();
	}
	
}
