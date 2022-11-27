package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class LandingPage {

WebDriver driver;

	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("//input[@type='search']");
	By productName = By.xpath("//h4[@class='product-name']");
	
	public void searchItem(String shortname) {
		
		driver.findElement(search).sendKeys(shortname);
	}
	
	public String getProduct() {
		
		return driver.findElement(productName).getText();
	}
}
