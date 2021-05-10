package org.constants;

public final class ProjectConstants {
	private ProjectConstants() {}
	
	private static final String CONFIGFILEPATH = System.getProperty("user.dir") + "\\resources\\config.properties";

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}
}
