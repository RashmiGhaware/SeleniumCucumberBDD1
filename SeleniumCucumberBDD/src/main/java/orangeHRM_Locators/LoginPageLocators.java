package orangeHRM_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(name="username")
	@CacheLookup
	public WebElement txt_username;

	@FindBy(name="password")
	public WebElement txt_password;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement txt_login;
	
	@FindBy(xpath="//img[@alt='company-branding']")
	public WebElement logo;

}
