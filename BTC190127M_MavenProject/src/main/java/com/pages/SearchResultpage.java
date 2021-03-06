package com.pages;

import java.util.List;

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
	@FindBy(xpath=".//*[@id='content']/div/div/div/div[2]/div[2]/nav/ul/li/a") List<WebElement> mensPages;
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
		Header h=new Header(dr);
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(dr.getCurrentUrl().equals("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=book"));
		System.out.println("isload");
		Header h=new Header(dr);
	}
	public void verifyMenPagination()
	{
		s.verifyPagination(mensPages);
		s.verifyPagination(dr.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/div[2]/nav/ul/li[9]/a")));
		s.verifyPagination(dr.findElements(By.xpath("")), 3);
	}
	
	
}
