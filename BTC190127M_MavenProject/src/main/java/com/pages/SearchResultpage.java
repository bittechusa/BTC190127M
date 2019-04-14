package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.Shared;

public class SearchResultpage {

	WebDriver dr;
	Shared s;
	public SearchResultpage(WebDriver dr){
		this.dr = dr;
		s = new Shared(dr);
	}
	
	public void verifyHomePageTitle() {
		s.verifyTitle("Amazon.com: Books");
	}
	
	public void verifyHomePageUrl() {
		s.verifyUrl("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=book");
	}
	
	public void verifyBooksatamazonImage() {
		s.verifyElementDisplay(By.xpath("//div[@id='top']//img[contains(@src,'CB282622384_.png')]"));
	}
	
	
}
