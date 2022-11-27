package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class CheckoutPage {

WebDriver driver;

	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By cartbag = By.xpath("//a[@class='cart-icon']");
	By proceed = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By apply = By.xpath("//button[text()='Apply']");
	By placeOrder = By.xpath("//button[text()='Place Order']");
	By increment = By.xpath("//h4[text()='Tomato - 1 Kg']//following::a[2]");
	By addtoCart = By.xpath("//h4[text()='Tomato - 1 Kg']//following::button[1]");
	
	public void checkoutItems() {
		
		driver.findElement(cartbag).click();
		driver.findElement(proceed).click();
	}
	
	public boolean verifyapplybtn() {
		return driver.findElement(apply).isDisplayed();

	}
	
	public boolean verifyplaceorderbtn() {
		return driver.findElement(placeOrder).isDisplayed();

	}
	
	public void incrementQty(int quantity) {
		
		int Qty = quantity-1;
		while(Qty>0) {
			driver.findElement(increment).click();
			Qty--;
		}
	}
	
	public void addtoCart() {
		
		driver.findElement(addtoCart).click();
	}	
	
	
}
