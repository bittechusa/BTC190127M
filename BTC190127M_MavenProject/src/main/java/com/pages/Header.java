package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Shared;

public class Header {

	WebDriver dr;
	Shared s;
	@FindBy(id="twotabsearchtextbox") WebElement theSearchTextBox;
	@FindBy(xpath="//input[@value='Go']") WebElement theSearchbutton;
	
	public Header(WebDriver dr){
		this.dr = dr;
		s = new Shared(dr);
		PageFactory.initElements(dr, this);
	}
}
