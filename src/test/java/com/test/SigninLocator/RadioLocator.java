package com.test.SigninLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.Utill.TestBase;

public class RadioLocator extends TestBase{
	public RadioLocator () {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(how=How.XPATH ,using= "//*[@id=\"dell-masthead\"]/div[1]/div[1]/div[2]/div/input")
	public WebElement  EnterLaptopbagonSearchfield;
	
	@FindBy(how=How.XPATH ,using= "//*[@id=\"dell-masthead\"]/div[1]/div[1]/div[2]/div/button/span[1]")
	public WebElement clickonsearch;
	
	@FindBy(how=How.XPATH ,using= "//*[@id=\"For-Work-radio-button\"]/label")
	public WebElement clickonForworkradiobutton;
	
	@FindBy(how=How.XPATH ,using= "//*[@id=\"search\"]/div[2]/div[2]/div[5]/ul/li[1]/label/div/span[2]")
	public WebElement clickonNotebookcarryingcase;
	
	
}
