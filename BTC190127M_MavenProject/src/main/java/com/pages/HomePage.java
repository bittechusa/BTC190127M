package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.Shared;

public class HomePage {
	
	WebDriver dr;
	Shared s;
	public HomePage(WebDriver dr){
		this.dr = dr;
		s = new Shared(dr);
	}
	
	public void verifyHomePageTitle() {
		s.verifyTitle("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}
	
	public void verifyHomePageUrl() {
		s.verifyUrl("https://www.amazon.com/ref=nav_logo");
	}
	
	public SearchResultpage searchHomePage() {
		s.myType(By.id("twotabsearchtextbox"), "book");
		s.myClick(By.xpath("//input[@value='Go']"));
		
		return new SearchResultpage(dr);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
