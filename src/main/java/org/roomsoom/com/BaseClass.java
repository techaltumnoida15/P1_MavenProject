package org.roomsoom.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws Exception {
		String browserName = "Firefox";
		
		//String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		//System.setProperty("webdriver.chrome.driver",  projectPath + "\\browserDrivers\\chromedriver.exe");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//Open Chrome
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//Open FF
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			//Open IE
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else {
			throw new Exception("This browser is not founnd.");
		}
		
		driver.manage().window().maximize();
		
		//imp wait
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(10, TimeUnit.MINUTES);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}

}
