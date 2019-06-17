package priya4;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo19 {
	@Given("enter username as {string}")
	public void enter_username_as(String x) {
	    System.out.println(x);
	}

	@And("enter password as {string}")
	public void enter_password_as(String y) {
		 System.out.println(y);
	}

	@Then("click on Login button")
	public void click_on_Login_button() {
		System.out.println("logged in");
	}



}
