package com.bupaupgrade.pom;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bupaupgrade.basefunctions.EnvironmentsDetails;
import com.bupaupgrade.helpers.FileReaderManager;


 public class BupaSplashPage extends LoadableComponent<BupaSplashPage>
 {
	 public WebDriver driver;
	 private WebDriverWait wait;
	 
	 @FindBy(xpath = "//div[@class='container']//i[@class='i-logo']")
	 private WebElement BupaLogo;
	 
	 public WebElement BupaLogo() {
		 return BupaLogo();
	 }
	 
	 
	 
	 public BupaSplashPage(WebDriver ldriver) {
			this.driver = ldriver;
			this.wait = new WebDriverWait(driver, 10);
			PageFactory.initElements(driver, this);
		}
	  
    
	@Override
	protected void load() {
		
		driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	}

	@Override
	protected void isLoaded() throws Error {
		
		BupaLogo.isDisplayed();
	}
	
	public boolean verifySplashUrl(String env, String Url) throws Exception {
		boolean result = false;
		String ExpectedUrl = EnvironmentsDetails.GetEnvironment(env) + FileReaderManager.getInstance().getUrlReader().getUrl(Url);
		String ActualUrl = driver.getCurrentUrl();
		org.junit.Assert.assertEquals(ExpectedUrl, ActualUrl);
		result = true;
		return result;
		
	}

}
