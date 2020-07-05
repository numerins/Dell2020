package com.test.SigninAction;

import com.test.SigninLocator.SearchLocator;
import com.test.Utill.TestBase;

public class SearchAction extends TestBase {
	SearchLocator locator = new SearchLocator();

public void EnterLaptoponSearchfield() {
	locator.EnterLaptoponSearchfield.clear();
	locator.EnterLaptoponSearchfield.sendKeys("Laptop");
}
public void clickonSearch() {
	locator.clickonSearch.click();
}
}