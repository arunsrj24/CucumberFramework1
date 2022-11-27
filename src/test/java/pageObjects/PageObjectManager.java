package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class PageObjectManager {

	public LandingPage landingpage;
	public OfferPage offerpage;
	public CheckoutPage checkoutPage;
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		
		landingpage = new LandingPage(driver);
		return landingpage;
	}
	
	public OfferPage getOfferPage() {
		
		offerpage = new OfferPage(driver);
		return offerpage;
	}
	
	public CheckoutPage getcheckoutPage() {
		
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
}
