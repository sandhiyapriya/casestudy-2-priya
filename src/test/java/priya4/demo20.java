package priya4;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class demo20 {
	@Given("enter valid username as {string}")
	public void enter_valid_username_as(String string) {
		System.out.println(string);
	}

	@And("password is {int}")
	public void password_is(Integer int1) {
		System.out.println(int1);
	}

	@And("pass is {double}")
	public void pass_is(Double c) {
		System.out.println(c);
	}

	@And("login is {string}")
	public void login_is(String d) {
		System.out.println(d);
	}


}
