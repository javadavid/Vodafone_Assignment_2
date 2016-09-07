package com.vodafone.testautomation.src;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebsiteAutomationSteps {
	// WebDriver driver;
	 
	 public WebsiteAutomationSteps()
	 {		
	 }
	 
	 @Given("^I open the Vodafone website$")
	 public void given_I_navigate_to_the_vodafone_url(){
	     System.out.println("Entering: I open the Vodafone website");
	     BrowserDriver.loadPage("http://www.vodafone.co.nz");
	     
	 }
	 	 
	 @When("^I navigate to MyVodafone page$")
	    public void when_I_navigate_to_MyVodafone_page(){
		 BrowserDriver.navigateMyVodafoneLink("My Vodafone");

	    }
	 
	 @When("^I navigate to Login page$")
	    public void navigate_to_Login_page(){
		 BrowserDriver.navigateLoginLink("My Vodafone");
	    }
	 
	 @When("^I try to login with invalid credentials$")
	 public void login_to_myvodafone_with_invalid_credentials()
	 {
		 BrowserDriver.login();
		 
	 }

	 @Then("^I should see the following error message$")
	    public void then_I_Should_get_error_message(String expMsg){
		 String rspMsg = BrowserDriver.getResponse();
		 System.out.println("The response message is " + expMsg);
		 org.junit.Assert.assertEquals(expMsg, rspMsg);
	    }
	 
	}
