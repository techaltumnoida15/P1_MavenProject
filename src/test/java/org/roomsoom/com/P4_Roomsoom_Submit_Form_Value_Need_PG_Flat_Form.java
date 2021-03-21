package org.roomsoom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class P4_Roomsoom_Submit_Form_Value_Need_PG_Flat_Form extends BaseClass {
	
	
	@Test
	public void saveformValue() throws InterruptedException {
		
		//Open URL
		
		

		
		driver.get("https://www.roomsoom.com/need-sharing-privaterooms-flats");
		
		Thread.sleep(9000);
		
		// Get the WebElement corresponding to the Name
				WebElement u_name = driver.findElement(By.name("u_name"));
		
		
		// Get the WebElement corresponding to the Email
				WebElement u_email = driver.findElement(By.name("u_email"));
		
		
		
		// Get the WebElement corresponding to the Phone Number
				WebElement u_phone = driver.findElement(By.name("u_phone"));
		
		
		 
		// Click on Save Button
		 		WebElement saveBtn = driver.findElement(By.id("save"));
		
		 		
		
		// Get the WebElement corresponding to the S Room 
				WebElement s_room_for = driver.findElement(By.name("s_room_for"));
				
		
		// Get the WebElement corresponding to the City   
				WebElement u_city = driver.findElement(By.name("u_city"));
				
				
		// Get the WebElement corresponding to the 
				WebElement u_location = driver.findElement(By.name("u_location"));
		
		
				
		
	    saveBtn.click();
	    
	    Thread.sleep(3000);
		
	    // Send value to Text Box and password		
		u_name.sendKeys("kundan@gmail.com");
		u_email.sendKeys("hello@123");
		u_phone.sendKeys("9582326824");
		s_room_for.sendKeys("boys");
		u_city.sendKeys("Noida");
		u_location.sendKeys("Sector 15");
		
		Thread.sleep(3000);
		
		saveBtn.click();
		
		Thread.sleep(5000);
		

		
	}

}
