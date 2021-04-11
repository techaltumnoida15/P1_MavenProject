package org.roomsoom.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class HandleMultiWindows extends BaseClass{

	@Test
	public void handleMultipleBrowserWindows() throws Exception {
		driver.get("http://www.naukri.com");
		Thread.sleep(5000);
		
		//Naukri - Parent
		// 2 Popup = Browser Window
		
		Set<String> myS = driver.getWindowHandles();
		System.out.println("Total windows are = " + myS.size());
		
		List<String> myL = new ArrayList<>();
		Iterator<String> Itr = myS.iterator();
		
		for(int i = 0; i<myS.size(); i++) {
			myL.add(Itr.next());
		}
		
		driver.switchTo().window(myL.get(2));
		
		System.out.println(driver.getTitle());
		driver.close();
	
		//Hash map, Hash table = Assignment  M.Imp
	
	}
}
