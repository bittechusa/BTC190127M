package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RefiananceRatePage  {

	WebDriver driver;
	@FindBy(xpath=".//*[@id='mortgage-rate-table-app']/div/div/div[3]/div/table/tbody/tr[1]/td[6]/button")
	WebElement hSBCNextButton;
	
	
	RefiananceRatePage(WebDriver x)
	{
		driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public CFBankPage clickOnCFBank()
	{
		hSBCNextButton.click();
		return new CFBankPage();
	}
}
