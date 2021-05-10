package org.roomsoom.com;

import org.testng.annotations.Test;


public class P1_Open_URL extends BaseClass {
	
	@Test
	public void  search() throws InterruptedException {
		
		// Test case log
		
		DriverManager.getDriver().get("https://www.roomsoom.com/");
		
		Thread.sleep(2000);
		
		
	}
	

}
