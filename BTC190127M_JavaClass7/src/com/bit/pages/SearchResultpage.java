package com.bit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bit.utility.Shared;

public class SearchResultpage {

	WebDriver dr;
	Shared s;
	
	public SearchResultpage(WebDriver dr) {
		this.dr = dr;
		s = new Shared(dr);
	}
	
	public void verifySearchResultpagePageLogo() {
		s.verifyElementDisplay(By.xpath("//img[@src='https://www.eshopper24.com/images/thumbs/0004487.png']"));
	}
	
	
	
	
}
