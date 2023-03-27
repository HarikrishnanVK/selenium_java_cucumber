package com.bupaupgrade.helpers;

public class FileReaderManager {

	public static FileReaderManager fr = new FileReaderManager();

	public static ConfigReader cr;
	
	public static UrlReader ur;
	

	public ConfigReader getConfigReader() throws Exception {
		if (cr == null) {
			cr = new ConfigReader();
		}
		return cr;

	}
	
	public UrlReader getUrlReader() throws Exception {
		if (ur == null) {
			ur = new UrlReader();
		}
		return ur;

	}
	

	public static FileReaderManager getInstance() {
		return fr;
	}

	private FileReaderManager() {

	}

	

}
