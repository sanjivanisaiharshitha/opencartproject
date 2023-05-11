package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//elements
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFrstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLstName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPssword;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement Clckpolicy;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement Cntinue;
	
	
	//action methods
	public void setFstname(String fname){
		txtFrstName.sendKeys(fname);
	}
	
	public void setLstname(String lname){
		txtLstName.sendKeys(lname);
	}
	
	public void setmail(String email){
		txtEmail.sendKeys(email);
	}
	public void setpsswrd(String pwd){
		txtPssword.sendKeys(pwd);
	}
	public void agreeplcy(){
		Clckpolicy.click();
	}
	public void cntbtton(){
		Cntinue.click();
	}
}
