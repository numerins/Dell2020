package stepsDef;

import com.test.SigninAction.MouseoverAction;
import com.test.Utill.TestBase;

import cucumber.api.java.en.Then;

public class MouseoverSteps extends TestBase{
	
	MouseoverAction action = new MouseoverAction();
	

	@Then("^mouseover in Financing$")
	public void mouseover_in_Financing() throws Throwable {
		action.mouseoverinFinancing();
	}

	@Then("^mouseover for HomePurchases$")
	public void mouseover_for_HomePurchases() throws Throwable {
		action.mouseoverforHomePurchases();
	}

	@Then("^mouseover in learn about financing$")
	public void mouseover_in_learn_about_financing() throws Throwable {
		action.mouseoverinlearnaboutfinancing();


	    
	}
}
