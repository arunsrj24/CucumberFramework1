package stepDefinitionClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

	public String offerpageName;
	TestContextSetup testContextSetup;
	LandingPage landingpage;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingpage = testContextSetup.pageObjectManager.getLandingPage();
	}
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_GreenCart_Landing_page() {
	  
	  
	}
	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_Shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		
		
		
		landingpage.searchItem(shortname);
		
		
		Thread.sleep(2000);
		testContextSetup.landingpageName = landingpage.getProduct().split("-")[0].trim();
		
		System.out.println(testContextSetup.landingpageName);
	}

}
