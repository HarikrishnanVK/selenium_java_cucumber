package com.bupaupgrade.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.bupaupgrade.basefunctions.BaseSteps;
import com.bupaupgrade.basefunctions.InitWebDrivers;
import com.bupaupgrade.enums.Context;
import com.bupaupgrade.helpers.FileReaderManager;
import com.bupaupgrade.helpers.TestContext;
import com.bupaupgrade.pom.BupaSitemapPage;
import com.bupaupgrade.pom.BupaSplashPage;
import com.bupaupgrade.pom.BupaWhereYouArePage;

import cucumber.api.java.en.Given;

public class HomPageSteps {
	
TestContext testcontext;
    
    public HomPageSteps(TestContext context) {
    	testcontext = context;
    }
	

	@Given("^I am on the \"([^\"]*)\" login page of \"([^\"]*)\" using \"([^\"]*)\" browser on \"([^\"]*)\"$")
	public void i_am_on_the_login_page_of_using_browser_on(String page, String env, String browser, String device) throws Exception  {
		WebDriver driver = null;
        try
        {
          //  driver = (WebDriver)ScenarioContext.Current["driver"];
            if (browser.toLowerCase() == "chrome" && page.toLowerCase() == "sitecore" && device.toLowerCase() == "desktop")
            {
                driver.quit();
                driver = InitWebDrivers.webDriver(browser, device);
    			testcontext.getScenarioContext().setContext(Context.browser, driver);
            }
            else if (browser.toLowerCase() != "chrome" && page.toLowerCase() != "sitecore" && device.toLowerCase() == "desktop")
            {
                driver.quit();
                browser = FileReaderManager.getInstance().getConfigReader().getBrowser2();
                device = FileReaderManager.getInstance().getConfigReader().getDevice2();
                driver = InitWebDrivers.webDriver(browser, device);
    			testcontext.getScenarioContext().setContext(Context.browser, driver);
            }
            else if (browser.toLowerCase() != "chrome" && page.toLowerCase() != "sitecore" && device.toLowerCase() != "desktop")
            {
                driver.quit();
                browser = FileReaderManager.getInstance().getConfigReader().getBrowser2();
                device = FileReaderManager.getInstance().getConfigReader().getDevice2();
                driver = InitWebDrivers.webDriver(browser, device);

            }
            else
            {
                driver.quit();
                driver = InitWebDrivers.webDriver(browser, device);
    			testcontext.getScenarioContext().setContext(Context.browser, driver);
            }
        }
        catch (Exception e)
        {
            if (browser.toLowerCase() == "chrome" && page.toLowerCase() == "sitecore" && device.toLowerCase() == "desktop")
            {
                driver = InitWebDrivers.webDriver(browser, device);
    			testcontext.getScenarioContext().setContext(Context.browser, driver);
            }
            else if (browser.toLowerCase() != "chrome" && page.toLowerCase() != "sitecore" && device.toLowerCase() == "desktop")
            {
            	browser = FileReaderManager.getInstance().getConfigReader().getBrowser2();
                device = FileReaderManager.getInstance().getConfigReader().getDevice2();
                driver = InitWebDrivers.webDriver(browser, device);
    			testcontext.getScenarioContext().setContext(Context.browser, driver);
            }
            else if (browser.toLowerCase() != "chrome" && page.toLowerCase() != "sitecore" && device.toLowerCase() != "desktop")
            {
            	browser = FileReaderManager.getInstance().getConfigReader().getBrowser2();
                device = FileReaderManager.getInstance().getConfigReader().getDevice2();
                driver = InitWebDrivers.webDriver(browser, device);
    			testcontext.getScenarioContext().setContext(Context.browser, driver);
    	        WebDriver driver2 = (WebDriver) testcontext.getScenarioContext().getContext(Context.browser);
    	        if(driver2 == null)
    	        	throw new Exception("driver is empty");
            }
            else
            {
                driver = InitWebDrivers.webDriver(browser, device);
    			testcontext.getScenarioContext().setContext(Context.browser, driver);
            }
        }
	

        //ScenarioContext.Current["driver"] = driver;
		/*
		 * ScenarioContext.Current["driver"] = driver; ScenarioContext.Current["env"] =
		 * env; ScenarioContext.Current["page"] = page;
		 * ScenarioContext.Current["browser"] = browser; BaseSteps baseSteps = new
		 * BaseSteps();
		 */
        switch (page.toLowerCase().replace(" ", ""))
        {
            case "bupasplash":
                BupaSplashPage bupasplash = (BupaSplashPage)BaseSteps.GotoHomePage(page, env, driver);
                Assert.assertNotNull(bupasplash);
                break;
            case "sitemappage":
                BupaSitemapPage bupasitemap = (BupaSitemapPage)BaseSteps.GotoHomePage(page, env, driver);
                Assert.assertNotNull(bupasitemap);
                break;
            case "whereyouare":
                BupaWhereYouArePage whereyouare = (BupaWhereYouArePage)BaseSteps.GotoHomePage(page, env, driver);
                Assert.assertNotNull(whereyouare);
                break;    

        }
	}

}
