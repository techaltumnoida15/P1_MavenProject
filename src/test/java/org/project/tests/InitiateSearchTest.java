package org.project.tests;

import org.project.pages.HomePage;
import org.roomsoom.com.BaseClass;
import org.testng.annotations.Test;

public class InitiateSearchTest extends BaseClass{

	@Test
	public void initiateSearchRoundTrip() throws Exception {
		new HomePage()
		.
		.enterFrom("LAS")
		.enterTo("LAX")
		.selectDate("RoundTrip")
		.clickOnSearch();
	}
	
	/*
	 * @Test public void initiateSearchOneWay() throws Exception { new HomePage()
	 * .enterFrom("LAS") .enterTo("LAX") .selectDate("OneWay") .clickOnSearch(); }
	 */
	
}
