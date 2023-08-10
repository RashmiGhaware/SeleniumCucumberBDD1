package oHRMStepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.BaseClass;

import io.cucumber.java.*;

public class Hooks {
	 
    @Before
    public static void setUp() {
      System.out.println("In Driver***");
       BaseClass.setUpDriver();
    }
 
    @After
    public static void tearDown(Scenario scenario) {
 
        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
        }   
         
        BaseClass.tearDown();
    }
}