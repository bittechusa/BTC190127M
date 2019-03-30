package com.bit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.utility.Shared;

public class HomePage {

	WebDriver dr;
	Shared s;
	
	public HomePage(WebDriver dr) {
		this.dr = dr;
		s = new Shared(dr);
	}
	
	
	public void verifyHomePageLogo() {
		s.gotoUrl("https://www.eshopper24.com/");
		s.verifyElementDisplay(By.xpath("//img[@src='https://www.eshopper24.com/images/thumbs/0004487.png']"));
	}
	
	public void typeOnSearchBox() {
		s.myType(By.xpath("//input[@id='small-searchterms']"), "Kids shoes");
	}
	
	public SearchResultpage clickSearchIcon() {
		s.myClick(By.xpath("//input[@type='submit']"));
		
		return new SearchResultpage(dr);
	}
	//whenever we do any action, if the page changes U must return that page
	
	
	
	
	
	
	
	
	
	
	
}
