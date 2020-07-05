package com.test.SigninAction;

import com.test.SigninLocator.RadioLocator;
import com.test.Utill.TestBase;

public class RadioAction extends TestBase {
	RadioLocator locator = new RadioLocator ();

	public void EnterLaptopbagonSearchfield() {
		locator.EnterLaptopbagonSearchfield.clear();
		locator.EnterLaptopbagonSearchfield.sendKeys("Laptopbag");
	}
	public void clickonsearch() {
		locator.clickonsearch.click();
	}
	
	public void clickonForworkradiobutton() {
		locator.clickonForworkradiobutton.click();
	}
	
	public void clickonNotebookcarryingcase() {
		locator.clickonNotebookcarryingcase.click();
	
	
}
}
