package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.roomsoom.com.BaseClass;
import org.testng.annotations.Test;

public class UseKeyboard extends BaseClass{

	@Test
	public void useKeyboardTest() throws Exception {
		
		//TAB, ESC, SHIFT, F1
		driver.get("http://www.roomsoom.com");
		
		Thread.sleep(5000);
		
		//Close Popup
		WebElement closePopupIcon = driver.findElement(By.cssSelector("button[data-dismiss='modal']"));
		closePopupIcon.click();
		
		
		WebElement searchTxtBar = driver.findElement(By.cssSelector("input[placeholder='Enter Location']"));
		searchTxtBar.sendKeys("Noida");
		
		
		//Press TAB
		searchTxtBar.sendKeys(Keys.TAB);
		System.out.println("TAB key is pressed.");
		
		//searchTxtBar.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(5000);
		
	}
	
}
