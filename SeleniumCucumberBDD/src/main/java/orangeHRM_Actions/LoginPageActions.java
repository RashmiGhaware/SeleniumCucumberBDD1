package orangeHRM_Actions;

import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;

import orangeHRM_Locators.LoginPageLocators;

public class LoginPageActions {

	LoginPageLocators loginPageLocators=null;

	public LoginPageActions( ) {
		this.loginPageLocators=new LoginPageLocators();

		PageFactory.initElements(BaseClass.getDriver(),loginPageLocators);

		//PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	public void logo() throws InterruptedException
	{
		 Thread.sleep(2000);
		boolean r=loginPageLocators.logo.isDisplayed();
	     Thread.sleep(2000);
		System.out.println(r);
		if(r=true)
		{
			System.out.println("OrangeHRM logo visible");
		}
		else {
		System.out.println("Logo not visible");
		}
	}
	public void Login(String username,String password)
	{
		loginPageLocators.txt_username.sendKeys(username);
		loginPageLocators.txt_password.sendKeys(password);
		loginPageLocators.txt_login.click();
	}

}
