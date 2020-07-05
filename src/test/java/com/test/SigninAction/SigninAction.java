package com.test.SigninAction;


import org.openqa.selenium.interactions.Actions;

import com.test.SigninLocator.SigninLocator;
import com.test.Utill.TestBase;
import com.test.Utill.TestUtill;

import junit.framework.Assert;

public class SigninAction extends TestBase{

	SigninLocator locator = new SigninLocator();
	Actions act = new Actions(driver);
	
   public void Credential (String u, String p) {
	   locator.username.sendKeys(u);
	   locator.password.sendKeys(p);
	  
   }
	public void Clickonthesigninbutton() {
		locator.Clickonthesigninbutton.click();
		TestUtill.Takescreenshot(driver, "loginPage");
	}
	public void ClickonsignINLink() {
		locator.ClickonsignINLink.click();
	}
	public void clicksignin() {
		locator.signIn.click();
	}
	public void verifyusercanloginsuccessfully() {
		boolean sucess = locator.LoginSuccessful.isDisplayed();
		Assert.assertTrue(sucess);
	TestUtill.Takescreenshot(driver, "Profile Page");
	}
	
}

