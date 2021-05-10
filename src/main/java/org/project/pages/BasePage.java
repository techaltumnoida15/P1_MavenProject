package org.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.roomsoom.com.DriverManager;

public class BasePage {

	protected void click(By byLocator) {
		WebElement element = DriverManager.getDriver().findElement(byLocator);
		element.click();
	}
	
	protected void sendKeys(By byLocator, String value) {
		WebElement element = DriverManager.getDriver().findElement(byLocator);
		element.sendKeys(value);
	}
	
	protected void useKeyboardTAB(By byLocator) {
		WebElement element = DriverManager.getDriver().findElement(byLocator);
		element.sendKeys(Keys.TAB);
	}
	
	protected void waitForElementVisible(By byLocator, int timeoutInSeconds) {
		new WebDriverWait(DriverManager.getDriver(), timeoutInSeconds)
		.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
	}
	
	protected void waitForAttributeContainsValue(By byLocator, String attribute, String value, int timeoutInSec) {
		new WebDriverWait(DriverManager.getDriver(), timeoutInSec)
		.until(ExpectedConditions.attributeContains(byLocator, attribute, value));
	}
}
