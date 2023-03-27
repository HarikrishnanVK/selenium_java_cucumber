package com.bupaupgrade.helpers;

import org.openqa.selenium.WebDriver;

import com.bupaupgrade.pom.BupaSitemapPage;
import com.bupaupgrade.pom.BupaSplashPage;
import com.bupaupgrade.pom.BupaWhereYouArePage;

public class PageObjectManager {

	public static WebDriver driver;
		
	private BupaSplashPage BupaSplash;
	
	private BupaSitemapPage BupaSitemap;
	
	private BupaWhereYouArePage BupaWhereYouAre;
		
	public BupaSplashPage getBupaSplash() {
		if(BupaSplash == null) 
		{
			BupaSplash = new BupaSplashPage(driver);
		}
		return BupaSplash;
	}
	
	public BupaSitemapPage getSitemap() {
		if(BupaSitemap == null) 
		{
			BupaSitemap = new BupaSitemapPage(driver);
		}
		return BupaSitemap;
	}
	
	public BupaWhereYouArePage getWhereYouAre() {
		if(BupaWhereYouAre == null) {
			BupaWhereYouAre = new BupaWhereYouArePage(driver);
		}
		return BupaWhereYouAre;
	}
	
	public PageObjectManager(WebDriver ldriver) {
		driver = ldriver;
	}
	
	public static PageObjectManager getPageObject() {
		return new PageObjectManager(driver);
	}
}