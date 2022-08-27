package com.qa.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.guru99.utils.CommonUtils;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[contains(text(),'Balance Enquiry')]")
WebElement welcomepage;


public boolean verifyLoginSuccesfull() {
	//CommonUtils.logInfo("Verifying welcome page");
	return welcomepage.isDisplayed();
	
}

}
