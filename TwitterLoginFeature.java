package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterLoginFeature {

	WebDriver driver;
	
	@Given("The Twitter website is Launched")
	public void the_Twitter_website_is_Launched() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003DWB744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@When("username is visible")
	public void username_is_visible() {
	  driver.findElement(By.xpath("//input[@name='text']")).isDisplayed();  
	}
	
	@Then("Enter userName text {string}")
	public void enter_userName_text(String string) {
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys(string);  
	}

	@When("next button is visible")
	public void next_button_is_visible() {
	  driver.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();  
	}

	@Then("click on next")
	public void click_on_next() {
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();   
	}
	
	@When("TwitterPassword is visible")
	public void twitterpassword_is_visible() throws InterruptedException {	
		Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
	}
	
	@Then("enter Password text {string}")
	public void enter_Password_text(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}
	

}
