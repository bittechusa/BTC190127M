package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageRatePage {

	WebDriver driver;
	@FindBy(xpath=".//*[@id='mortgage-rate-table-app']/div/div/div[3]/div/table/tbody/tr[1]/td[6]/button")
	WebElement hSBCNextButton;
	
	
	MortgageRatePage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public HSBCPage clickOnNextForHSBC()
	{
		hSBCNextButton.click();
		return new HSBCPage();
	}
	
	
	
	
	
	
	
	
}
