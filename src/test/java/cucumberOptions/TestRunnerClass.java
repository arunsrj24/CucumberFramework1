package cucumberOptions;

import java.io.IOException;


import org.testng.annotations.DataProvider;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features", glue="stepDefinitionClass", monochrome=true,
dryRun=false,tags="@PlaceOrder", 
plugin= {"html:target/cucumber.html","json:target/cucumber.json"
		}
)

public class TestRunnerClass extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		
		return super.scenarios();
	}
	
	
}

//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
