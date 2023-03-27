package com.bupaupgrade.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UrlReader {
	public static String UrlFilePath = System.getProperty("user.dir")+"\\src\\test\\resource\\ResourceFiles\\UrlResource.properties";
	
	public static Properties prop;
	
	public UrlReader() throws Exception {
		try {
			File f = new File(UrlFilePath);
			FileInputStream fin = new FileInputStream(f);
			prop = new Properties();
			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("not a valid file path");
		}
	}
		public String getUrl(String url) throws Exception {
			String property = prop.getProperty(url);
			if(property!=null) {
				return property;
			}else {
				throw new Exception("not a valid page url");
			}
		}
		
		
	}


