package com.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
	WebDriver driver;
	
	public void getDriver() {
		driver=new ChromeDriver();
		
	}
	

	public HomePage nevigateToURL() {
		
		driver.get("http://www.bankrate.com");
		return new HomePage(driver);
	}

}
