package com.test;

import org.junit.Test;

public class SmokeTest extends BaseTest{
	HomePage homePage;
	MortgageRatePage mortgageRatePage;
	@Test
	public void test1()
	{
		homePage=new HomePage(driver);
		homePage.mouseOverOnMortgage();
		mortgageRatePage=homePage.clickOnMortgageRate();//=new mortgageRatePage();
	}

}
