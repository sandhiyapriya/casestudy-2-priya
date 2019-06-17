package case44;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class kkk {
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
	}

	@And("i write category name as{string}")
	public void i_write_category_name_as(String a) {
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
		Actions cc=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		cc.sendKeys(a).sendKeys(Keys.ENTER).build().perform();
	}

	@And("i write sub-category as {string}")
	public void i_write_sub_category_as(String b) {
		Actions cc=new Actions(driver);
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		 cc.sendKeys(b).sendKeys(Keys.ENTER).build().perform();
	}

	@And("i write product name as {string}")
	public void i_write_product_name_as(String c) {
		   driver.findElement(By.id("prodid")).sendKeys(c);
	}

	@And("i write price as {string}")
	public void i_write_price_as_(String d) {
		 driver.findElement(By.name("pricename")).sendKeys(d);
	}

	@And("i write quantity as {string}")
	public void i_write_quantity_as(String e) {
		 driver.findElement(By.name("Quantity")).sendKeys(e);
	       
	      
	       
	}

	@And("i write brand as {string}")
	public void i_write_brand_as(String f) {
		driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys(f);
	}

	@And("i write description as {string}")
	public void i_write_description_as(String g) {
		 driver.findElement(By.name("description")).sendKeys(g);
	}

	@Then("add some category")
	public void add_some_category() {
		//driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
	     
	}



}
