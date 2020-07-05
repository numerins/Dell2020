package stepsDef;

import com.test.SigninAction.SearchAction;
import com.test.Utill.TestBase;

import cucumber.api.java.en.Then;

public class SearchSteps extends TestBase {
    
	SearchAction action = new SearchAction();

	@Then("^Enter Laptop on Search field$")
	public void enter_Laptop_on_Search_field() throws Throwable {
	  action.EnterLaptoponSearchfield();
	}

	@Then("^click on Search$")
	public void click_on_Search() throws Throwable {
	  action.clickonSearch();
	}
	

}
