package testme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class priya66 {
	WebDriver driver;
	WebDriver wait;
	@Given("i want to open chrome")
	public void i_want_to_open_chrome() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
	    
	}

	@And("open testme app")
	public void open_testme_app() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
	}

	@Then("i want to enter username and password")
	public void i_want_to_enter_username_and_password() {
		
		driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");
		  driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

	@And("click on submit button and do logn")
	public void click_on_submit_button_and_do_logn() {
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"myInput\"]")));
		WebElement search=driver.findElement(By.name("products"));
		search.sendKeys("Headphone");
    driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
	}

	@And("add to cart")
	public void add_to_cart() {
		
		
		 driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
		  driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
		 
	}

	@And("make payment")
	public void make_payment() {
		
		  driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
		  driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
		  driver.findElement(By.cssSelector("#swit > div:nth-child(8) > div > label > i")).click();
		  driver.findElement(By.id("btn")).click();
		  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("sandhiya");
		  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("priyanivi");
		  driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	}

	@Then("close")
	public void close() {
	    driver.close();
	}



}
