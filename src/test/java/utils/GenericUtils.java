package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void switchWindowChild() {
		Set<String> all = driver.getWindowHandles();
		   Iterator<String> iterator = all.iterator();
		   String parent = iterator.next();
		   String child = iterator.next();
		   driver.switchTo().window(child);

	}
}
