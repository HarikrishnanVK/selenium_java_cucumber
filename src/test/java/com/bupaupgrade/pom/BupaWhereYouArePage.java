package com.bupaupgrade.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bupaupgrade.basefunctions.EnvironmentsDetails;
import com.bupaupgrade.helpers.BaseFunctions;
import com.bupaupgrade.helpers.FileReaderManager;

import junit.framework.Assert;

public class BupaWhereYouArePage extends LoadableComponent<BupaSplashPage> {
	public WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath = "//div[@class='container']//i[@class='i-logo']")
	private WebElement BupaLogo;

	public WebElement BupaLogo() {
		return BupaLogo();
	}

	@FindBy(linkText = "Select your country")
	private WebElement countryLink;

	@FindBy(id = "countries")
	private WebElement countryDDElement;

	@FindBy(xpath = "//ul[@class='country-list']//p")
	private List<WebElement> countryList;

	public BupaWhereYouArePage(WebDriver ldriver) {
		this.driver = ldriver;
		this.wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void load() {

		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	}

	@Override
	protected void isLoaded() throws Error {

		BupaLogo.isDisplayed();
	}

	public void selectCountry(String Text) throws Exception {
		try {
			for (WebElement country : countryList) {
				if (country.getText().equalsIgnoreCase(Text)) {
					this.wait.until(ExpectedConditions.visibilityOf(country));
					country.click();
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyResultPage(String env, String url) throws Exception {
		String expectedUrl = FileReaderManager.getInstance().getConfigReader().getBaseUrl(env)
				+ FileReaderManager.getInstance().getUrlReader().getUrl(url);
		String actualUrl = driver.getCurrentUrl();
		String currentUrl = FileReaderManager.getInstance().getConfigReader().getBaseUrl(env)+
				FileReaderManager.getInstance().getUrlReader().getUrl("BupaWhereYouAre");
		if (actualUrl.equals(currentUrl)) {
			BaseFunctions.switchToWindow();
			String actualUrlOfSwitchedWindow = driver.getCurrentUrl();
			org.junit.Assert.assertEquals(expectedUrl, actualUrlOfSwitchedWindow);
		} else {
			org.junit.Assert.assertEquals(expectedUrl, actualUrl);
		}

	}
}
