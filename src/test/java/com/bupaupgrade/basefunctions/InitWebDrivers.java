package com.bupaupgrade.basefunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bupaupgrade.enums.Context;
import com.bupaupgrade.helpers.TestContext;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class InitWebDrivers {
	public static WebDriver driver;
	public static AppiumDriverLocalService appiumLocalService;
	public static AppiumDriver<WebElement> androidDriver;
	
    
	public static WebDriver webDriver(String browser, String device) throws Exception {
		if (!device.toLowerCase().equals("desktop")) 
		{
			browser = "";
		}
		System.out.println("device captured is"+" "+device.toLowerCase());
		switch (browser.toUpperCase() + device.toUpperCase()) {
		case "CHROMEDESKTOP":
			driver = chromeDriver();
			break;
		case "FIREFOXDESKTOP":
			break;
		case "IEDESKTOP":
			break;
		case "EDGEDESKTOP":
			break;
		default:
			throw new Exception("Not a valid browser name");

		}

		return driver;
	}
	

	public static WebDriver chromeDriver() {
		String currentDriverDirectory = System.getProperty("user.dir")+"\\src\\test\\resource\\Drivers\\chromedriver.exe";
		System.out.println("driver directory is"+" "+currentDriverDirectory);
		System.setProperty("webdriver.chrome.driver",currentDriverDirectory);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public static WebDriver firefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resource\\Drivers\\geckodriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver ieDriver() {
		System.setProperty("webdriver.ie.driver",
				System.getProperty("user.dir") + "\\src\\test\\resource\\Drivers\\IEDriverServer.exe");
		driver = new ChromeDriver();
		return driver;
	}

}
