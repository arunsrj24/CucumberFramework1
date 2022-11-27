package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		
		
		if(driver == null) {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
			}
		  driver.get(url);
		}
		  return driver;

	}

}
