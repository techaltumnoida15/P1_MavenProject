package org.roomsoom.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class P3_Roomsoom_Admin_Login_Check extends BaseClass {
	
	@Test
	public void geturl() throws InterruptedException {
		
	
		// Open Website URL
	    driver.navigate().to("https://www.roomsoom.com/newadmin"); 
	    System.out.println("URL OPEN Successfully");
	    Thread.sleep(2000);
	    
	    
	    
	    // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email = driver.findElement(By.name("adminemail"));
        
        
        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.name("adminpassword"));
        
        // Find the submit button		
        WebElement loginbutton = driver.findElement(By.name("loginbtn"));
        
        
        // Send value to Text Box and password		
        email.sendKeys("kundan@gmail.com");
        password.sendKeys("123456");
        loginbutton.click();
        
        
        Thread.sleep(5000);
        
        
	    // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email1 = driver.findElement(By.name("adminemail"));
        
        
        // Get the WebElement corresponding to the Password Field		
        WebElement password1 = driver.findElement(By.name("adminpassword"));
        
        // Find the submit button		
        WebElement loginbutton1 = driver.findElement(By.name("loginbtn"));
        
        
        // Send value to Text Box and password		
        email1.sendKeys("kundan@gmail.com");
        password1.sendKeys("hello@123");
        loginbutton1.click();
        
        
        Thread.sleep(5000);
        
		
	}
	
	

}
