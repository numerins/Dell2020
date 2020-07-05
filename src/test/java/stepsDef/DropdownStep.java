package stepsDef;

import com.test.SigninAction.DropdownAction;
import com.test.Utill.TestBase;

import cucumber.api.java.en.Then;

public class DropdownStep extends TestBase{
	
	DropdownAction action = new DropdownAction();
	
	@Then("^click on USA button$")
	public void click_on_USA_button() throws Throwable {
	   action.clickonUSAbutton();
	}

	@Then("^click on Bangladesh$")
	public void click_on_Bangladesh() throws Throwable {
	  action.clickonBangladesh();
	}



}
