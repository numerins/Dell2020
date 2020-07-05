package com.test.SigninLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.Utill.TestBase;

public class SearchLocator extends TestBase{
	public SearchLocator () {
		PageFactory.initElements( driver,this);
	}
	@FindBy(how=How.XPATH ,using= "//*[@id=\"dell-masthead\"]/div[1]/div[1]/div[2]/div/input")
	public WebElement  EnterLaptoponSearchfield;
	
	@FindBy(how=How.XPATH ,using= "//*[@id=\"dell-masthead\"]/div[1]/div[1]/div[2]/div/button/span[1]")
	public WebElement clickonSearch;
}
