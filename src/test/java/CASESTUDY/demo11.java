package CASESTUDY;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo11 {
	WebDriver driver;
	WebDriverWait wait;
	@Given("i have to enter url and open web")
	public void i_have_to_enter_url_and_open_web() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
	}
	@Then("i have to enter username as admin")
	public void i_have_to_enter_username_as_admin() {
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  driver.findElement(By.name("userName")).sendKeys("admin");
	 
	}

	@And("i have to enter an admin password")
	public void i_have_to_enter_an_admin_password() {
		driver.findElement(By.name("password")).sendKeys("Password456");
	}

   @And("i have to click on login button")
	public void i_have_to_click_on_login_button() {
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
			a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
	 a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		   driver.findElement(By.id("prodid")).sendKeys("HP");
		   driver.findElement(By.name("pricename")).sendKeys("30000");
	       driver.findElement(By.name("Quantity")).sendKeys("5");
	       driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys("HP");
	       driver.findElement(By.name("description")).sendKeys("this is a hp product");
	       driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
	       driver.findElement(By.linkText("SignOut")).click();
	       driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
			  driver.findElement(By.name("userName")).sendKeys("Lalitha");
			 driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");
			  driver.findElement(By.cssSelector("input[type='submit']")).click();
			  WebElement search=driver.findElement(By.name("products"));
				search.sendKeys("Headphone");
		    driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
   }
   @Then("i have to enter all mandatory details")
   public void i_have_to_enter_all_mandatory_details() {
	  /* driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
			a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
	 a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		   driver.findElement(By.id("prodid")).sendKeys("HP");
		   driver.findElement(By.name("pricename")).sendKeys("30000");
	       driver.findElement(By.name("Quantity")).sendKeys("5");
	       driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys("HP");
	       driver.findElement(By.name("description")).sendKeys("this is a hp product");
       
   }

   @And("i click on addproduct button")
   public void i_click_on_addproduct_button() {
	   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
       driver.findElement(By.linkText("SignOut")).click();
   }*/

}
}