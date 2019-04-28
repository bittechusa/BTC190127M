package com.test;

import org.junit.Test;

public class SmokeTest extends BaseTest{
	HomePage homePage;
	MortgageRatePage mortgageRatePage;
	@Test
	public void test2()
	{
		//write code for ist step
		//go to url
		//hoverover on mortgage menu
		//click on mortgage rate submenu
		//click nex hsbc
	}
	
	
	
	
	
	
	@Test
	public void test1()
	{
		homePage=new HomePage(driver);
		homePage.mouseOverOnMortgage();
		mortgageRatePage=homePage.clickOnMortgageRate();//=new mortgageRatePage();
	}

}
