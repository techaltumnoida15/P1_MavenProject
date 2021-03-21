package org.roomsoom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P5_Roomsoom_Home_Page_Search extends BaseClass {
	
	
	@Test
	public void searchHomePage() throws InterruptedException {
		
		
		//Open URL
		driver.get("http://www.roomsoom.com");
		Thread.sleep(2000);
		
		//Select Delhi From  City Select Box
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Noida");
		
		
		
		
		
		
		
		//Click on Search Button
		driver.findElement(By.cssSelector("button[class='btn btn-danger search_btn_slider_main']")).click();
		System.out.println("Click on Search Button");
		Thread.sleep(2000);
	
	 }
	
	
}

