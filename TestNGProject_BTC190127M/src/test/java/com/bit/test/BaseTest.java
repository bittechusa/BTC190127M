package com.bit.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
 
	WebDriver dr;
	@Parameters({"browser","url"})
  @BeforeMethod
  public void beforeMethod(String b,String u) {
	  System.out.println("bm");
	  if(b.equals("chrome"))
	  {
	   dr=new ChromeDriver();
		
	  }
	  else if(b.equals("firefox"))
	  {
	   dr=new ChromeDriver();
		
	  }
	  dr.get(u);
  }

  @AfterMethod
  public void afterMethod(ITestResult r) {
	  System.out.println("am");
	  if(r.getStatus()==ITestResult.FAILURE)
	  {
		  System.out.println(r.getName()+"  is failed and took screen shot");
	  }
	  else if(r.getStatus()==ITestResult.SUCCESS)
	  {
		  System.out.println(r.getName()+" success");
	  }
	  dr.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ac");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bt");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bs");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}
