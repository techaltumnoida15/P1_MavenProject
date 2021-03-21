package org.roomsoom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		//System.setProperty("webdriver.chrome.driver",  projectPath + "\\browserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}

}
