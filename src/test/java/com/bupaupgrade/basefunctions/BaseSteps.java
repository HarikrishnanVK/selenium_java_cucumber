package com.bupaupgrade.basefunctions;

import javax.swing.plaf.synth.Region;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bupaupgrade.helpers.FileReaderManager;
import com.bupaupgrade.pom.BupaSitemapPage;
import com.bupaupgrade.pom.BupaSplashPage;
import com.bupaupgrade.pom.BupaWhereYouArePage;

public class BaseSteps {
     
	
     public static Object GotoHomePage(String Page, String env, WebDriver driver) throws Exception
     {
         Object obj = null;
         try
         {
             NavigateToUrl(Page, env, driver);
            // log.Info("Navigation was successfull at page: " + Page);
         }
         catch (Exception ex)
         {
             //log.Error("Navigation error at page: " + Page + " due to error:" + ex.Message);
        	 throw ex;
         }

         switch (Page.toLowerCase().replace(" ", ""))
         {
             
             case "bupasplash":
                 obj = new BupaSplashPage(driver);
                 break;
             case "sitemappage":
                 obj = new BupaSitemapPage(driver);
                 break;
             case "whereyouare":
                 obj = new BupaWhereYouArePage(driver);
                 break;
         }
         
         return obj;
     
     }


     public static void NavigateToUrl(String Page, String env, WebDriver driver) throws Exception
     {
         String url = null;
         url = GetURL(Page, env);
         driver.navigate().to(url);
         try
         {
        	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        	Thread.sleep(3000);
           // driver.findElement(By.xpath("//a[@id='overridelink']")).click();
            // log.Info("SSL certificate error handled successfully");
         }
         catch (Exception ex)
         {
            // log.Info("SSL certificate error didnot appear");
         }
         finally {
        	
         }
     }


    
     public static String GetURL(String page, String env) throws Exception
     {
         page = page.toLowerCase().replace(" ", "");
         String url = null;
         switch (page)
         {
             
             case "bupasplash":
                 url = EnvironmentsDetails.GetEnvironment(env) + FileReaderManager.getInstance().getUrlReader().getUrl("BupaSplash");
                 break;
             case "sitemappage":
                 url = EnvironmentsDetails.GetEnvironment(env) + FileReaderManager.getInstance().getUrlReader().getUrl("BupaSitemap");
                 break;
             case "whereyouare":
                 url = EnvironmentsDetails.GetEnvironment(env) + FileReaderManager.getInstance().getUrlReader().getUrl("BupaWhereYouAre");
                 break;
            
         }
         return url;
     }
    
         
     }


