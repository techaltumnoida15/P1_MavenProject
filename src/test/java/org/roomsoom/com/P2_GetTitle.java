package org.roomsoom.com;

import org.testng.annotations.Test;

public class P2_GetTitle extends BaseClass{
	
	@Test
	public void getUrl() {
		
		DriverManager.getDriver().get("https://www.roomsoom.com/");
		String sitetile = DriverManager.getDriver().getTitle();
		System.out.println(sitetile);
	}

}
