package priya5;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.cucumber.datatable.DataTable;

public class demo31 {
	@Given("login")
	public void login() {
	    System.out.println("open");
	}

	@And("enter username and password")
	public void enter_username_and_password(io.cucumber.datatable.DataTable dt) {
		
		List<Map<String,String,String,String,String,String,String>> list=dt.asMaps(String.class,String.class,String.class,String.class,String.class,String.class,String.class);
		for(int i=0;i<list.size();i++)
		{
			 System.out.println(list.get(i).get("username"));
		System.out.println(list.get(i).get("password"));
		}
	}

	@And("close")
	public void close() {
		 System.out.println("close");
	}



}
