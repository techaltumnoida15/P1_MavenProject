package org.roomsoom.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;
import org.utilities.ReadPropFile;

public class HandleMultiWindowsTest extends BaseClass{

	@Test
	public void handleMultipleBrowserWindows() throws Exception {
		DriverManager.getDriver().get(ReadPropFile.getValue("url"));
		
		Thread.sleep(5000);
		
		//Naukri - Parent
		// 2 Popup = Browser Window
		
		Set<String> myS = DriverManager.getDriver().getWindowHandles();
		System.out.println("Total windows are = " + myS.size());
		
		List<String> myL = new ArrayList<>();
		Iterator<String> Itr = myS.iterator();
		
		for(int i = 0; i<myS.size(); i++) {
			myL.add(Itr.next());
		}
		
		DriverManager.getDriver().switchTo().window(myL.get(2));
		
		System.out.println(DriverManager.getDriver().getTitle());
		DriverManager.getDriver().close();
	
		//Hash map, Hash table = Assignment  M.Imp
	
	}
}
