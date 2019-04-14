package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
	
	WebDriver dr;
	
	@Before
	public void openBrowser() throws IOException {
		
		FileInputStream fl = new FileInputStream("/Users/bittechconsulting/Desktop/BTC190127M/BTC190127M_MavenProject/src/main/resources/files/config.properties");
		Properties p = new Properties();
		p.load(fl);
		
		String b = p.getProperty("browser");
		
		//System.getproperty() will allow user to read/get any value from the system/command line
		//String b = System.getProperty("browser"); 
		
		if(b.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			dr = new ChromeDriver();
			//dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(b.equals("firefox")) {
			//System.setProperty("", "");
			//dr = new FirefoxDriver();
			System.out.println("running Firefox browser");
		}
		else if(b.equals("ie")) {
			//System.setProperty("", "");
			//dr = new InternetExplorerDriver();
			System.out.println("running IE browser");
		}
		else if(b.equals("safari")) {
			//System.setProperty("", "");
			//dr = new SafariDriver();
			System.out.println("running Safari browser");
		}else {
			System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
			dr = new ChromeDriver();
			//dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Chrome wa executed from ELSE..........");
		}
		dr.get(p.getProperty("url"));
		
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
		
	}

}
