package com.bit.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegressionTest {
	
	@Test(description="this is testing method",groups="smoke")
	  public void f1() {
		 System.out.println("test2");
	  }
	@Test(groups= {"smoke","reg"})
	  public void f2() {
		 System.out.println("test3");
		 Reporter.log("test3");
		 Assert.fail();
	  }

}
