package com.test.SigninLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.Utill.TestBase;

public class SigninLocator extends TestBase{
  
	
	public SigninLocator () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH ,using="//*[@id=\"dell-masthead\"]/div[1]/div[2]/div[2]/div/button/span[2]/span")
	public WebElement Clickonthesigninbutton;
	
	@FindBy(how=How.XPATH ,using="//a[text()='Sign In']")
	public WebElement ClickonsignINLink;

	@FindBy(how=How.NAME ,using="EmailAddress")
	public WebElement username;
	
	@FindBy(how=How.ID ,using="Password")
	public WebElement password;
	
	@FindBy(how=How.ID ,using= "sign-in-button")
	public WebElement signIn;
	
	@FindBy(how=How.XPATH ,using= "//span[text()='Syed Numerin']")
	public WebElement LoginSuccessful;
	
	
}
