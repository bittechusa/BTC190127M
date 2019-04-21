package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath=".//*[@id='csstyle']/div[2]/header/nav/ul/li[1]/a")
	WebElement mortgageMenu;
	@FindBy(xpath=".//*[@id='csstyle']/div[2]/header/nav/ul/li[1]/div/div/div[1]/div/ul/li[1]/a")
	WebElement mortgageRateSubMenu;
	
	HomePage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
	public void mouseOverOnMortgage()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(mortgageMenu).build().perform();
		
	}
	public MortgageRatePage clickOnMortgageRate()
	{
		mortgageRateSubMenu.click();return new MortgageRatePage(driver);
	}
	

}
