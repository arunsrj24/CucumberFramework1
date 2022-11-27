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
import pageObjects.OfferPage;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	public String offerpageName;
	TestContextSetup testContextSetup;
	OfferPage offerpage;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.offerpage = testContextSetup.pageObjectManager.getOfferPage(); 
	}

	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_shortname_in_offers_page(String shortname) throws InterruptedException {
		
	
		
		offerpage.dealsclick();
		   Thread.sleep(2000);
		   testContextSetup.genericUtils.switchWindowChild();
		
		
		offerpage.search(shortname);
		
	   
	   offerpageName = offerpage.getProduct().trim();
	   System.out.println(offerpageName);
	   
	}
	

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_Landing_Page() {
	    Assert.assertEquals(testContextSetup.landingpageName, offerpageName);
	    System.out.println("Passed");
	}
}
