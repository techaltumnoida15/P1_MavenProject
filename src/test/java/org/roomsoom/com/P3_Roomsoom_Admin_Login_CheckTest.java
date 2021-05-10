package org.roomsoom.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.utilities.ReadPropFile;


public class P3_Roomsoom_Admin_Login_CheckTest extends BaseClass {
	
	@Test
	public void geturl() throws Exception {
		
	
		// Open Website URL
		DriverManager.getDriver().navigate().to("https://www.roomsoom.com/newadmin"); 
	    System.out.println("URL OPEN Successfully");
	    Thread.sleep(2000);
	    
	    
	    
	    // Get the WebElement corresponding to the Email Address(TextField)	
        WebElement email = DriverManager.getDriver().findElement(By.name(ReadPropFile.getValue("nameAdminEmail")));
        
        
        // Get the WebElement corresponding to the Password Field		
        WebElement password = DriverManager.getDriver().findElement(By.name(ReadPropFile.getValue("nameAdminEmailPasswd")));
        
        // Find the submit button		
        WebElement loginbutton = DriverManager.getDriver().findElement(By.name(ReadPropFile.getValue("nameLoginButton")));
        
        
        // Send value to Text Box and password		
        email.sendKeys(ReadPropFile.getValue("emailID"));
        password.sendKeys(ReadPropFile.getValue("password"));
        loginbutton.click();
        
        
        Thread.sleep(5000);
        
        
	    // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email1 = DriverManager.getDriver().findElement(By.name("adminemail"));
        
        
        // Get the WebElement corresponding to the Password Field		
        WebElement password1 = DriverManager.getDriver().findElement(By.name("adminpassword"));
        
        // Find the submit button		
        WebElement loginbutton1 = DriverManager.getDriver().findElement(By.name("loginbtn"));
        
        
        // Send value to Text Box and password		
        email1.sendKeys("kundan@gmail.com");
        password1.sendKeys("hello@123");
        loginbutton1.click();
        
        
        Thread.sleep(5000);
        
		
	}
	
	

}
