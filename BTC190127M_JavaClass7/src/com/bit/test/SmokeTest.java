package com.bit.test;

import org.junit.Test;

import com.bit.browser.Base;
import com.bit.pages.HomePage;
import com.bit.pages.SearchResultpage;

public class SmokeTest extends Base{
	
	HomePage hp;
	
	@Test
	public void sareeGhorTest() {
		
		hp = new HomePage(dr);
		hp.verifyHomePageLogo();
		hp.typeOnSearchBox();
		SearchResultpage sp = hp.clickSearchIcon();
		sp.verifySearchResultpagePageLogo();
		
	}
	
	@Test
	public void macysTest() {
		
		hp = new HomePage(dr);
		
		
		
	}

}
