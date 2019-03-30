package com.bit.browser;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static public WebDriver dr;
	
	@BeforeClass
	public static void open() {
		openBrowser();
	}
	
	public static WebDriver openBrowser() {
		if(dr==null) {
			System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		return dr;
	}
	
	@AfterClass
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}
	
	

/*
	@Test
	public void ab1() {
		System.out.println("Test 1");
	}
	
	@Ignore
	@Test
	public void ab6() {
		System.out.println("test2");
	}
	
	@Test
	public void ab66() {
		System.out.println("test3");
	}

	@Before
	public void ab2() {
		System.out.println("Before");
	}
	
	@After
	public void ab3() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void ab4() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void ab5() {
		System.out.println("@AfterClass");
	}
	
*/

	
}
