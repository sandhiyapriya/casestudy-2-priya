package priya2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo14 {
	@Given("I write username as {string}")
	public void i_write_username_as(String x) {
	  System.out.println(x);
	}

	@And("^i write password as \"([^\"]*)\"$")
	public void i_write_password_as(String y) {
	   System.out.println(y);
	}

	@And("submit login")
	public void submit_login() {
		System.out.println("login successful");
	}

	@Then("search in homepage")
	public void search_in_homepage() {
	    System.out.println("homepage displayed");
	}

	@Then("click product")
	public void click_product() {
	  System.out.println("headphone");
	}

	@When("product clicked add to cart")
	public void product_clicked_add_to_cart() {
	    System.out.println(" cart added");
	}

	@Then("close")
	public void close() {
	  System.out.println("closed");
	}



}
