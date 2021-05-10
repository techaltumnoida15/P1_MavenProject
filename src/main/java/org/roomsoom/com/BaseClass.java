package org.roomsoom.com;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	@BeforeMethod
	public void openBrowser() throws Exception {
		Driver.initDriver();
	}
	
	
	@AfterMethod
	public void closeBrowser(ITestResult test) {
		Driver.tearDown();
	}

}
