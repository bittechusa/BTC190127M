package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Shared;

public class HomePage {
	
	WebDriver dr;
	Shared s;
	@FindBy(id="twotabsearchtextbox") WebElement theSearchTextBox;
	@FindBy(xpath="//input[@value='Go']") WebElement theSearchbutton;
	
	public HomePage(WebDriver dr){
		this.dr = dr;
		s = new Shared(dr);
		PageFactory.initElements(dr, this);
	}
	
	public void verifyHomePageTitle() {
		s.verifyTitle("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}
	
	public void verifyHomePageUrl() {
		s.verifyUrl("https://www.amazon.com/ref=nav_logo");
	}
	
	public SearchResultpage searchHomePage() {
		s.myType(theSearchTextBox, "book");
		//s.myType(By.id("twotabsearchtextbox"), "book");
		//s.myClick(By.xpath("//input[@value='Go']"));
		s.click(theSearchbutton);
		return new SearchResultpage(dr);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
