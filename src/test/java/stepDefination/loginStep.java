package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginStep {
public WebDriver driver;
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize(); 
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String arg1) throws Throwable {
		driver.get("https://address-health-revamp-git-feat-address-zysktech.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	}

	 @And("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
	   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
		 driver.findElement(By.id("phone_number")).sendKeys(arg1);
			driver.findElement(By.id("password")).sendKeys(arg2);  
	   } 

	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

	@Then("^User must successfully login to the web page$")
	public void user_must_successfully_login_to_the_web_page() throws Throwable {
//		String ele = driver.findElement(By.xpath("//label[.='Choose infirmary']")).getText();
//		System.out.println(ele);
		if(driver.getCurrentUrl().equalsIgnoreCase(
			      "https://address-health-revamp-git-feat-address-zysktech.vercel.app/")){
			         System.out.println("Test Pass"); 
			      } else { 
			         System.out.println("Test Failed"); 
			      } 
		driver.quit();
		
	}

}
