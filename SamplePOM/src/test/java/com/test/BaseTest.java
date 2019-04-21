package com.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
	WebDriver driver;
	@Before
	public void openBrowser()
	{
		getDriver();
	}
	public HomePage getDriver() {
		driver=new ChromeDriver();
		driver.get("http://www.bankrate.com");
		return new HomePage(driver);
	}

}
