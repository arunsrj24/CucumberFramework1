package stepDefinitionClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import utils.TestContextSetup;

public class Hooks {
TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@After
	public void afterScenario() throws IOException {
		
		testContextSetup.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
	
		WebDriver driver = testContextSetup.testBase.WebDriverManager();
		
		if(scenario.isFailed())
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcepath = ts.getScreenshotAs(OutputType.FILE);
		byte[] sc = FileUtils.readFileToByteArray(sourcepath);
		scenario.embed(sc, "image/png");
		}

	}
}
