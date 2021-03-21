package org.roomsoom.com;

import org.testng.annotations.Test;

public class P2_GetTitle extends BaseClass{
	
	@Test
	public void getUrl() {
		
		driver.get("https://www.roomsoom.com/");
		String sitetile = driver.getTitle();
		System.out.println(sitetile);
	}

}
