package com.fb.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinatioFb {
	WebDriver driver;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    driver=new ChromeDriver();
	}

	@Given("^nevigate to URL$")
	public void nevigate_to_URL() throws Throwable {
	    driver.get("http://www.facebook.com");
	}

	@When("^user type userId and password$")
	public void user_type_userId_and_password() throws Throwable {
	    driver.findElement(By.id("email")).sendKeys("hghfdjv");
	    driver.findElement(By.id("pass")).sendKeys("hgh687v");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    System.out.println("click");
	}

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
	   System.out.println("profile");
	   driver.quit();
	}
	
	@When("^user type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
	    driver.findElement(By.id("pass")).sendKeys(arg2);
	}

	@Then("^user should not see his profile page$")
	public void user_should_not_see_his_profile_page() throws Throwable {
	    Assert.assertFalse(4>3);
	}


}
