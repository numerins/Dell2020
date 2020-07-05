package com.test.SigninAction;

import com.test.SigninLocator.DropdownLocator;
import com.test.Utill.TestBase;

public class DropdownAction extends TestBase{
	
	DropdownLocator locator = new DropdownLocator();
	
	public void clickonUSAbutton() {
		locator.clickonUSAbutton.click();
	}
		
	public void clickonBangladesh() { 
		locator.clickonBangladesh.click();
		}
	}

