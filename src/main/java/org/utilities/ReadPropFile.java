package org.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.constants.ProjectConstants;

public final class ReadPropFile {

	private ReadPropFile() {}
	
	public static String getValue(String key) throws Exception {
		Properties prop = new Properties();
		//String filePath = ProjectConstants.configFilePath;

		FileInputStream fip = new FileInputStream(ProjectConstants.getConfigfilepath());
		
		prop.load(fip);
		
		//Ready to read data
		
		return prop.getProperty(key);
		
	}
}
