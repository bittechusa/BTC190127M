package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnitTest {

	WebDriver dr;
	@Test
	public void test1()
	{
		 System.out.println("bm");
		   dr=new ChromeDriver();
			dr.get("http://www.yahoo.com");
	}
}
