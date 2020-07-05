package com.test.SigninAction;

import org.openqa.selenium.interactions.Actions;

import com.test.SigninLocator.MouseoverLocator;
import com.test.Utill.TestBase;

public class MouseoverAction extends TestBase{

	MouseoverLocator locator = new MouseoverLocator();
			Actions act = new Actions (driver);
	
	public void mouseoverinFinancing() {
		act.moveToElement(locator.mouseoverinFinancing).build().perform();
	}
	public void mouseoverforHomePurchases() {
		act.moveToElement(locator.mouseoverforHomePurchases).build().perform();
	
	}
	public void mouseoverinlearnaboutfinancing() {
		act.moveToElement(locator.mouseoverinlearnaboutfinancing).click().build().perform();
	}
}
