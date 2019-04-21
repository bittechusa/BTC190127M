package com.utility;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared {
	
	WebDriver dr;
	public Shared(WebDriver dr){
		this.dr = dr;
	}
	
	public String verifyTitle(String expectedTitle) {
		String e = dr.getTitle();
		if(e.equals(expectedTitle)) {
			System.out.println("Title Matched as : " + e);
		}else {
			System.out.println("Title didin't match--------------");
		}
		return e;
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
	public void myType(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public void verifyattribute(By by, String attributeName) {
		String w = dr.findElement(by).getAttribute(attributeName);
		System.out.println("Attribute value for " + attributeName + " : " + w);
	}
	
	public String verifyText(By by) {
		String r = dr.findElement(by).getText();
		return r;
	}
	
	public String verifyUrl(String expectedURL) {
		String e = dr.getCurrentUrl();
		if(e.contains(expectedURL)) {
			System.out.println("URL matched as : " + e);
		}
		return e;
	}
	
	public void verifyElementDisplay(By by) {
		boolean e = dr.findElement(by).isDisplayed();
		System.out.println("Is Elemnt diplayed ? " + e);
	}
	
	public void verifyElementDisplay(WebElement ele ) {
		boolean e = ele.isDisplayed();
		System.out.println("Is Elemnt diplayed ? " + e);
	}
	
	public int getSizeOfTheProduct(By by) {
		int number = dr.findElements(by).size();
		return number;
	}
	
	public void verifyPagination(List<WebElement> elements)
	{
		for(WebElement element:elements)
		{
			
			String previousUrl=dr.getCurrentUrl();
			element.click();
			String afterUrl=dr.getCurrentUrl();
			Assert.assertFalse(previousUrl.equals(afterUrl));
		}
	}
	
	public void verifyPagination(List<WebElement> elements,int index)
	{
		for(int i=index;i<elements.size();i++)
		{
			
			String previousUrl=dr.getCurrentUrl();
			elements.get(i).click();
			String afterUrl=dr.getCurrentUrl();
			Assert.assertFalse(previousUrl.equals(afterUrl));
		}
	}
	
	
	public void verifyPagination(WebElement elements)
	{
	
		while(elements.isDisplayed())
		{
			String previousUrl=dr.getCurrentUrl();
			elements.click();
			String afterUrl=dr.getCurrentUrl();
			Assert.assertFalse(previousUrl.equals(afterUrl));
			
			
		}
		
	
	
		
		
	}
	
	
	
	
	
	
	
	
}
