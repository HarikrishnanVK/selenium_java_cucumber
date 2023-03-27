package com.bupaupgrade.pom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bupaupgrade.basefunctions.EnvironmentsDetails;
import com.bupaupgrade.basefunctions.InitWebDrivers;
import com.bupaupgrade.enums.Context;
import com.bupaupgrade.helpers.FileReaderManager;
import com.bupaupgrade.helpers.PageObjectManager;
import com.bupaupgrade.helpers.ScenarioContext;
import com.bupaupgrade.helpers.TestContext;

public class BupaSitemapPage extends LoadableComponent<BupaSitemapPage>
{
	 public WebDriver driver;
	 private WebDriverWait wait;
	 
	 @FindBy(xpath = "//div[@class='container']//i[@class='i-logo']")
	 private WebElement BupaLogo;
	 
	 public WebElement BupaLogo() {
		 return BupaLogo();
	 }
	 
	 public BupaSitemapPage(WebDriver ldriver) {
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
	
	public List<String> getActualList(List<String> controls, String option) {
		List<WebElement>structure;
		controls=new ArrayList<String>();
		
			structure = InitWebDrivers.driver.findElements(By.xpath("//li[@class='border']//a[contains(text(),'" + option + "')]/../../ul//li/a"));
            for (WebElement countries : structure)
            {
                controls.add(countries.getText());
            }
	
            return controls;
		}
	}
	
