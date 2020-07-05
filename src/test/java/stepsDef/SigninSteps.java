package stepsDef;

import com.test.SigninAction.SigninAction;
import com.test.Utill.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SigninSteps extends TestBase{
	
	SigninAction action = new SigninAction();
	
	@Given("^launch \"([^\"]*)\"$")
	public void launch(String arg1) throws Throwable {
	 driver.get(prop.getProperty("url"));
	}

	@Then("^Click on the sign in button$")
	public void click_on_the_sign_in_button() throws Throwable {
	   action.Clickonthesigninbutton();
	}

	@Then("^Click on signINLink$")
	public void click_on_signINLink() throws Throwable {
	  action.ClickonsignINLink();
	}

	@Then("^enter username and password$")
	public void enter_username_and_password() throws Throwable {
	    action.Credential(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Then("^user click sign In$")
	public void user_click_sign_In() throws Throwable {
		action.clicksignin();
	}
	@Then("^verify user can login successfully$")
	public void verifyusercanloginsuccessfully() {
		action.verifyusercanloginsuccessfully();
		
}
	 
	
	


	
}


