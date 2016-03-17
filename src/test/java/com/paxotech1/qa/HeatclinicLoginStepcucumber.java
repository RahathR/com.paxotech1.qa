package com.paxotech1.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paxovision.framework.Application;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeatclinicLoginStepcucumber {
	protected  WebDriver driver;
	protected Application heatclinic;
	
	@Before 
	public void beforeclass(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		heatclinic = new Application(driver);
	}
	@After
	public void afterClass(){
		driver.close();
		driver.quit();
	}
	
	
	@Given("^As a  validated user$")
	public void as_a_validated_user() throws Throwable {
		driver.manage().deleteAllCookies();
	 
	}

	@When("^Browse to the application$")
	public void browse_to_the_application() throws Throwable {
		driver.get("http://qa1.paxotech.com/heatclinic/");
	 
	}

	@Then("^Broadleaf HomePage should show$")
	public void broadleaf_HomePage_should_show() throws Throwable {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		heatclinic.homePage().loginlink("Login");
		
	}

	@When("^Enter \"(.*?)\" as email address$")
	public void enter_as_email_address(String emailid) throws Throwable {
		heatclinic.loginPage().EmailBox(emailid);
	 
	}

	@When("^Enter \"(.*?)\" as password$")
	public void enter_as_password(String Passwordid) throws Throwable {
		heatclinic.loginPage().Password(Passwordid);
	
	
	}

	@When("^Click login$")
	public void click_login() throws Throwable {
		heatclinic.loginPage().Login();
	  
	}

	@Then("^valid email or password message display$")
	public void valid_email_or_password_message_display() throws Throwable {
	    
	}

	@Then("^Welcome message shows$")
	public void welcome_message_shows() throws Throwable {
	    
	}



}
