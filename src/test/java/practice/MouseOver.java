package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.roomsoom.com.BaseClass;
import org.testng.annotations.Test;

public class MouseOver extends BaseClass{

	@Test
	public void mouseOverTest() throws Exception {
		driver.get("http://www.naukri.com");
		
		//Thread.sleep(5000);        //Get rid of this wait by using imp/exp wait
		
		//Example of Explicit wait
		Wait<WebDriver> wait = new WebDriverWait(driver, 7);   //Timeout in explicit wait is in SECONDS by default
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='More']")));
		
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		
		//Mouse Over - MORE
		Actions act = new Actions(driver);
		//ClassName objName = new ClassName();
		act.moveToElement(more);
		act.build().perform();    //Pls NOTE.
		
		//Click - naukri Blog
		WebElement naukriBlog = driver.findElement(By.xpath("//a[contains(text(), 'Naukri Blog')]"));
		naukriBlog.click();
		
		Thread.sleep(5000);
		
		
		//Handle page cookies
		//driver.manage().deleteAllCookies();
		//driver.manage().addCookie(Cookie Name);
		
		//Page Refresh
		/*
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		*/
		
		//driver.
	}
}
