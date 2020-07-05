package com.test.SigninLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.Utill.TestBase;

public class MouseoverLocator extends TestBase {

	public MouseoverLocator() {
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using= "//*[@id=\"l6\"]")
	public WebElement mouseoverinFinancing;
	
	@FindBy(how=How.XPATH,using= "/html/body/main/header/div[3]/nav/ul/li[6]/ul/li[1]/a/span")
	public WebElement mouseoverforHomePurchases;
	
	@FindBy(how=How.XPATH ,using= "//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[6]/ul/li[1]/ul/li[1]/a")
	public WebElement mouseoverinlearnaboutfinancing;
	
}
