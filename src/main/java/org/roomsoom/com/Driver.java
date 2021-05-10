package org.roomsoom.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.utilities.ReadPropFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {

	private Driver() {}
	
	public static void initDriver() throws Exception {
		//String browserName = "chrome";
		String browserName = ReadPropFile.getValue("browserName");

		if(browserName.equalsIgnoreCase("chrome")) {
			//Open Chrome
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			DriverManager.setDriver(driver);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//Open FF
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			
			DriverManager.setDriver(driver);
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			//Open IE
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			
			DriverManager.setDriver(driver);
		}
		else {
			throw new Exception("This browser is not founnd.");
		}
		
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get("http://www.cheapoair.com");
		
		//DriverManager.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void tearDown() {
		DriverManager.getDriver().quit();
		DriverManager.unload();
	}
}
