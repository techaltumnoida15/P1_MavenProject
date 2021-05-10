package org.roomsoom.com;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

	private DriverManager() {}
	
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	
	public static void setDriver(WebDriver driverRef) {
		dr.set(driverRef);
	}
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	public static void unload() {
		dr.remove();
	}
}
