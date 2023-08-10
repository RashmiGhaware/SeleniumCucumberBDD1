package oHRMStepDefinitions;

 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/orangeHRMFeatures/LoginOH.feature", 
glue= {"oHRMStepDefinitions"},
monochrome= true,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        
}

		)
public class TestRunnerOH extends AbstractTestNGCucumberTests {

}
