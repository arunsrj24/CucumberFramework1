package stepDefinitionClass;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {

	TestContextSetup testContextSetup;
	CheckoutPage checkoutPage;
	
	public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getcheckoutPage();
	}
	
	

	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
	    
		checkoutPage.incrementQty(Integer.parseInt(quantity));
		checkoutPage.addtoCart();
	}

	@Then("User proceeds to Checkout and validate the {string} items in checkout page")
	public void user_proceeds_to_Checkout_and_validate_the_items_in_checkout_page(String string) throws InterruptedException {
	  
		checkoutPage.checkoutItems();
		Thread.sleep(2000);
		System.out.println(string);
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
	   
		
		Assert.assertTrue(checkoutPage.verifyapplybtn());
		Assert.assertTrue(checkoutPage.verifyplaceorderbtn());
		
	}
}
