package com.bupaupgrade.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String PropFilePath = System.getProperty("user.dir")
			+ "\\src\\test\\resource\\ResourceFiles\\config.properties";

	public static Properties prop;

	public ConfigReader() throws Exception {
		try {
			File f = new File(PropFilePath);
			FileInputStream fin = new FileInputStream(f);
			prop = new Properties();
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("File not loaded properly");
			
		}
	}
	
	public String getBaseUrl(String BaseUrl) throws Exception {
		String property = prop.getProperty(BaseUrl);
		if (property != null) {
			return property;
		} else {
			throw new Exception("url is empty");
		}
	}
	
	public String getBrowser2() throws Exception {
		String property = prop.getProperty("browser2");
		if (property != null) {
			return property;
		} else {
			throw new Exception("browser value is empty");
		}
	}	
		public String getDevice2() throws Exception {
			String property = prop.getProperty("device2");
			if (property != null) {
				return property;
			} else {
				throw new Exception("device value is empty");
			}
	}
}
