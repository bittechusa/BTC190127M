package com.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	static WebDriver driver;
	
	public static void getBrowserOption(String b)
	{
		if(b.equals("chrome"))
		{
			driver=new ChromeDriver();
		}

		else if(b.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
	public void getDriver() {
		driver=new ChromeDriver();
		
	}
	

	public HomePage nevigateToURL() {
		
		driver.get("http://www.bankrate.com");
		return new HomePage(driver);
	}

}
