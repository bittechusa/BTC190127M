package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.utility.Shared;

public class SearchResultpage extends LoadableComponent<SearchResultpage>{

	WebDriver dr;
	Shared s;
	//@FindBy(id="twotabsearchtextbox") WebElement theSearchTextBox;
	@FindBy(xpath="//div[@id='top']//img[contains(@src,'CB282622384_.png')]") WebElement booksatamazonImage;
	public SearchResultpage(WebDriver dr){
		this.dr = dr;
		s = new Shared(dr);
		PageFactory.initElements(dr, this);
	}
	
	public void verifyHomePageTitle() {
		s.verifyTitle("Amazon.com: Books");
	}
	
	public void verifyHomePageUrl() {
		s.verifyUrl("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=book");
	}
	
	public void verifyBooksatamazonImage() {
		s.verifyElementDisplay(booksatamazonImage);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
		dr.navigate().to("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=book");
		System.out.println("load");
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(dr.getCurrentUrl().equals("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=book"));
		System.out.println("isload");
		Header h=new Header(dr);
	}
	
	
}
