package case5;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class nmm {
	WebDriver driver;
	@Given("i want to open url")
	public void i_want_to_open_url() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
	}

	@And("login in testme as admin")
	public void login_in_testme_as_admin() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		  driver.findElement(By.name("userName")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("Password456");
		  driver.findElement(By.name("Login")).click();
		  driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
	}

	@And("mandatory fields")
	public void mandatory_fields(io.cucumber.datatable.DataTable dt) {
		List<Map<String,String>> list=dt.asMaps(String.class,String.class);
		for(int i=0;i<list.size();i++)
		{
			 System.out.println(list.get(i).get("Category Name"));
		System.out.println(list.get(i).get("Product Name"));
		}
		driver.findElement(By.name("pricename")).sendKeys("30000");
	       driver.findElement(By.name("Quantity")).sendKeys("5");
	       driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys("HP");
	       driver.findElement(By.name("description")).sendKeys("this is a hp product");
	      
	}

	@Then("add some category")
	public void add_some_category() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
	    
	}



}
