package com.bupaupgrade.helpers;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bupaupgrade.basefunctions.InitWebDrivers;

public class BaseFunctions {
	
	static WebDriver driver = InitWebDrivers.driver;

	public static void SelectElement(WebElement element, String options, String value) {
		Select sc = new Select(element);
		try {
			if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			} else if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (options.equalsIgnoreCase("text")) {
				sc.selectByVisibleText(value);

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static void waitUntilElementVisible(WebElement element, WebDriver driver) {
			
			
		}
		
		public static void switchToWindow() {
			try {
				String cID = driver.getWindowHandle();
				Set<String> pID = driver.getWindowHandles();
				for(String handle:pID) {
					if(!handle.equals(cID)) {
						driver.switchTo().window(handle);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

