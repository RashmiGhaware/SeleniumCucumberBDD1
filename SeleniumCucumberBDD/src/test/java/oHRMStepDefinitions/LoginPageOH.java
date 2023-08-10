package oHRMStepDefinitions;

 
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
 

 
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import orangeHRM_Actions.LoginPageActions;
import orangeHRM_Locators.LoginPageLocators;

public class LoginPageOH {

	LoginPageActions login=new LoginPageActions();
	 
	@Given("User is on OrangHRM login page {string}")
	public void loginTest(String url) {
	
	    BaseClass.openPage(url);
	}
	

	@And("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		 
		login.logo();
	}

	//@When("^user enters (.*) and (.*)$ then clicks on login")
	@When("^user enters (.*) and (.*)$")
	public void  usernamePassword(String username, String password)
	{
		login.Login(username, password); 
	}

	 

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		 

	}
	 

}
