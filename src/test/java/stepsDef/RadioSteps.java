package stepsDef;

import com.test.SigninAction.RadioAction;
import com.test.Utill.TestBase;

import cucumber.api.java.en.Then;

public class RadioSteps extends TestBase{
	
	RadioAction action = new RadioAction();

	
	@Then("^Enter Laptop bag on Search field$")
	public void enter_Laptop_bag_on_Search_field() throws Throwable {
	action.EnterLaptopbagonSearchfield();
	}
		
	@Then("^click on search$")
	public void click_on_search() throws Throwable {
	   action.clickonsearch();
	}

	@Then("^click on For work radio button$")
	public void click_on_For_work_radio_button() throws Throwable {
		action.clickonForworkradiobutton();
	}
	@Then("^click on Notebook carrying case$")
	public void click_on_Notebook_carrying_case() throws Throwable {
	 action.clickonNotebookcarryingcase();
	}

	}


