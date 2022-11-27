package pageObjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class OfferPage {
	TestContextSetup testContextSetup;
	WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@id='search-field']");
	By productName = By.xpath("//td[text()='Tomato']");
	By dealspage = By.xpath("//a[text()='Top Deals']");
	
	public void search(String shortname) {
		
		driver.findElement(search).sendKeys(shortname);

	}
	
	public String getProduct() {
		
		return driver.findElement(productName).getText();
	}
	
	public void dealsclick(){
		driver.findElement(dealspage).click();
		  
	}
}
