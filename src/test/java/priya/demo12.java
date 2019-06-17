package priya;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo12 {
	@Given("i enter username")
	public void i_enter_username() {
	   System.out.println("priya");
	}

	@And("i enter password")
	public void i_enter_password() {
	   System.out.println("nivi");
	}

	@And("click on login button")
	public void click_on_login_button() {
	    System.out.println("button");
	}

	@Then("it direct to homepage")
	public void it_direct_to_homepage() {
	   System.out.println("home");
	}

}
