package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GridPractice {
	
	Logger log;
	@BeforeSuite
	public void configureFile()
	{
		DOMConfigurator.configure("log4j.xml");
		log=Logger.getLogger(GridPractice.class);
	}
	WebDriver driver;
	Properties p;
	@BeforeMethod
	public void openBrow() throws MalformedURLException
	{
		String b=p.getProperty("browser");
		String r=p.getProperty("runmode");
		if(b.equals("chrome"))
		{
			if(r.equals("remote")) {
			log.info("initializing browser");
			DesiredCapabilities cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.MAC);
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
			}
			
		else if(r.equals("local"))
		{
			driver=new ChromeDriver();
			log.info("opened browser");
		}
		}else if(b.equals("firefox"))
		{
			if(r.equals("remote")) {
				log.info("initializing browser");
				DesiredCapabilities cap=DesiredCapabilities.firefox();
				cap.setPlatform(Platform.MAC);
				driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
				}
				
			else if(r.equals("local"))
			{
				driver=new FirefoxDriver();
				log.info("opened browser");
			}
		}
		
	}
	@Test
	public void test3() throws MalformedURLException
	{
		log.info("start test case");
driver.get("http://www.yahoo.com");
if(5>8)
{
	log.info("true");
}else
{
	log.error("false");
}
log.info("finish  test case");
		
	}
	@Test
	public void test1() throws MalformedURLException
	{
		log.info("start test case");
		
driver.get("http://www.facebook.com");
log.info("nevigate to url");
log.info("finish test case");
	}
	@Test
	public void test2() throws MalformedURLException
	{
driver.get("http://www.google.com");
		
	}
	
	

}
