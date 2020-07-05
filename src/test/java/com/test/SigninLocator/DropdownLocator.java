package com.test.SigninLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.Utill.TestBase;

public class DropdownLocator extends TestBase{
	
	public DropdownLocator() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using= "//*[@id=\"mh-top-countrytoggle\"]/div[2]")
	public WebElement clickonUSAbutton;
	
	@FindBy(how=How.XPATH,using= "//*[@id=\"mh-top-countrylist\"]/li[17]/a")
	public WebElement clickonBangladesh ;
}
