package com.test;

import org.junit.Test;

import com.pages.HomePage;
import com.pages.SearchResultpage;

public class SmokeTest extends BaseTest{
	
	HomePage hp;
	SearchResultpage sp;
	
	@Test
	public void amazonTest() {
		hp = new HomePage(dr);
		hp.verifyHomePageTitle();
		hp.verifyHomePageUrl();
		sp = hp.searchHomePage();
		sp.verifyHomePageTitle();
		sp.verifyHomePageUrl();
		sp.verifyBooksatamazonImage();
		
	}
	
	@Test
	public void amazonProductVerify() {
		hp = new HomePage(dr);
	}
	
/*
 * Test Scanario: Create a end to end scenario
 * go to amazom
 * go to any category 
 * add 3 products in cart 
 * go to cart page
 * verify all 3 products has been added 
 * remove one product 
 * verify removbed product does't appear 
 * complete order process 
 * as far as U can.... do not provide real data
 * 
 Test Scenario: Verify if Amazon global search functions as expected.
 
 Test Steps:
 1: Open Chrome browser
 2: go to Amazon.com 
 3: verify title
 4: verify url
 5: type for "Book"
 6: click on search icon 
 7: verify that search result page appears
 
 */
	
	
//	@Test
//	public void sampleTestMethod() {
//		System.out.println("___________________");
//		System.out.println("This is maven Test");
//		System.out.println("___________________");
//	}
//	
//	@Test
//	public void sampleTestMethod1() {
//		System.out.println("___________________");
//		System.out.println("ano ther test");
//		System.out.println("___________________");
//	}

}
