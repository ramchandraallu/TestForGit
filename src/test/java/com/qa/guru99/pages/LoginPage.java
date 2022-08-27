package com.qa.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.guru99.utils.CommonUtils;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="uid")
	WebElement username;

	@FindBy(name="password")
	WebElement paswrd;


	@FindBy(name="btnLogin")
	WebElement loginbtn;

	/**
	 * Author: Allu ramchandra
	 * Login method in to application with input parmaets set value in username and psed then click on login
	 * @param uname
	 * @param pswd
	 */
	public void LoginApplication(String uname,String pswd) {
	//	CommonUtils.logInfo("Enter username and passowrd page");
		username.sendKeys(uname);  
		paswrd.sendKeys(pswd);
		loginbtn.click();
	}

	
	public boolean VerifyLoginpage() {
		//CommonUtils.logInfo("Verifying Login page");
		return username.isDisplayed();
		//return false;
	}

	
	
}
