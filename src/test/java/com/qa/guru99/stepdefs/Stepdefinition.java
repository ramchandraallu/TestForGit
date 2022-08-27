package com.qa.guru99.stepdefs;

import org.junit.BeforeClass;

import com.qa.guru99.Base.TestBase;
import com.qa.guru99.pages.HomePage;
import com.qa.guru99.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefinition extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	@Given("open url {string}")
	public void open_url(String string) {
	  
	}

	@Then("Verify Loginpage is displayed")
	public void verify_homepage_is_displayed() {
		loginpage = new LoginPage(driver);
		Assert.assertTrue("The Login is not getting dispalyed", loginpage.VerifyLoginpage());
	}

	@When("loginto apllication with {string} and {string}")
	public void loginto_apllication_with_and(String uname, String pwd) {
		loginpage.LoginApplication(uname,pwd);
	}

	@Then("Verify login is succesfull")
	public void verify_login_is_succesfull() {
		homepage= new HomePage(driver);
		Assert.assertTrue("Login is failed for the user ", homepage.verifyLoginSuccesfull());
	}
	
}
