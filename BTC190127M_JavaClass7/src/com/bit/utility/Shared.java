package com.bit.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared {
	
	WebDriver dr;
	public Shared(WebDriver dr) {
		this.dr = dr;
	}
	
	
	public void gotoUrl(String url) {
		dr.get(url);
	}
	
	public void myClick(By by ) {
		dr.findElement(by).click();
	}
	
	public void click(WebElement element) {
		//WebElement element = dr.findElement();
		//String element = "jkgsdvckjshdbjf";
		element.click();
	}
	
	public void myType(By by, String value) {
		dr.findElement(by).sendKeys(value);
	}
	
	public void verifyattribute(By by, String attributeName) {
		String w = dr.findElement(by).getAttribute(attributeName);
		System.out.println("Attribute value for " + attributeName + " : " + w);
	}
	
	public String verifyText(By by) {
		String r = dr.findElement(by).getText();
		return r;
	}
	
	public String verifyUrl() {
		String e = dr.getCurrentUrl();
		return e;
	}
	
	public String verifyTitle() {
		String e = dr.getTitle();
		return e;
	}
	
	public void verifyElementDisplay(By by) {
		boolean e = dr.findElement(by).isDisplayed();
		System.out.println("Is Elemnt diplayed ? " + e);
	}
	
	public int getSizeOfTheProduct(By by) {
		int number = dr.findElements(by).size();
		return number;
	}

	
	
	
}
