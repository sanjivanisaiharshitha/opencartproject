package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailaddress;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement button;
	

	public void setemail(String emailid){
		emailaddress.sendKeys(emailid);
	}
	public void setpsswrd(String pwdd){
		password.sendKeys(pwdd);
	}
	
	public void click() {
		button.click();
	}
}
