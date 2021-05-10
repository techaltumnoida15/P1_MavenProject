package org.project.pages;

import org.openqa.selenium.By;

public final class HomePage extends BasePage{

	final By closeIconInFromFeild = By.cssSelector("a[class='suggestion-box__clear icon']");
	final By fromTextFeildLocator = By.id("from0");
	public HomePage enterFrom(String from) throws Exception {

		waitForElementVisible(closeIconInFromFeild, 5);
		click(closeIconInFromFeild);
		sendKeys(fromTextFeildLocator, from);
		
		//Wait for suggestion box
		waitForAttributeContainsValue(By.cssSelector("div[class*='suggestion-box__content air']"), "class", "visible", 5);
		useKeyboardTAB(fromTextFeildLocator);
		
		return new HomePage();
	}
	
	public HomePage enterTo(String to) throws Exception {
		By toTextFeildLocator = By.id("to0");
		
		sendKeys(toTextFeildLocator, to);
		waitForAttributeContainsValue(By.xpath("(//div[contains(@class, 'suggestion-box__content air')])[2]"), "class", "visible", 5);
		useKeyboardTAB(toTextFeildLocator);
		
		return this;      //this refers current class object
	}
	
	public HomePage selectDate(String tripType) {
		if(tripType.equalsIgnoreCase("ONEWAY")) {
			selectDate();
		}
		else {
			selectDate();  //Depart Date
			selectDate();  //Return Date
		}
		return this;
	}
	
	private boolean selectDate() {
		
		return true;
	}
	
	public ListingPage clickOnSearch() {
		
		
		return new ListingPage();
	}
	
}
