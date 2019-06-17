package priya4;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class demo21 {
	@Given("i need to enter product name as {string}")
	public void i_need_to_enter_product_name_as(String x) {
	   System.out.println(x);
	}

	@And("add a product to cart as {int}")
	public void add_a_product_to_cart_as(Integer int1) {
		System.out.println(int1);
	}

	@And("make payment")
	public void make_payment() {
		System.out.println("done");
	}

	@Given("i need to click bank as {string}")
	public void i_need_to_click_bank_as(String string) {
		System.out.println(string);
	}

	@And("click on continue")
	public void click_on_continue() {
		System.out.println("ext page went");
	}

	@Given("i need to close th browser")
	public void i_need_to_close_th_browser() {
		System.out.println("browser closed");
	}


}
