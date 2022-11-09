package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpSkillTestFeature {
	WebDriver driver;
	
	@Given("Launch the elearning website")
	public void launch_the_elearning_website() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003DWB744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();  
	}

	@When("the Signup button visible")
	public void the_Signup_button_visible() {
		driver.findElement(By.xpath("//a[normalize-space()='Sign up!']")).isDisplayed();
	    
	}

	@Then("click on Signup button")
	public void click_on_Signup_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Sign up!']")).click();
		Thread.sleep(1000);
	   
	}

	@Then("set the FirstName")
	public void set_the_FirstName() {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hello1");
	    
	}

	@Then("set the LastName")
	public void set_the_LastName() {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("world21");
	    
	}

	@Then("set the e-mail")
	public void set_the_e_mail() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("helloooooo34@gmail.com");
	   
	}

	@Then("set the Username")
	public void set_the_Username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("HelloWorlddd34");
	    
	}

	@Then("set the Pass")
	public void set_the_Pass() {
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("123456");
	    
	}

	@Then("set the ConfirmPass")
	public void set_the_ConfirmPass() {
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys("123456");
	   
	}

	@When("the Register button visible")
	public void the_Register_button_visible() {
		driver.findElement(By.xpath("//button[@name='submit']")).isDisplayed();
	   
	}

	@Then("click on Register")
	public void click_on_Register() {
		driver.findElement(By.xpath("//button[@name='submit']")).click();
	    
	}

	@When("the Next button is visible")
	public void the_Next_button_is_visible() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='next']")).isDisplayed();
	    
	}

	@Then("click on Next button")
	public void click_on_Next_button() {
		driver.findElement(By.xpath("//button[@name='next']")).click();
	   
	}

	@When("userName dropdown vissible")
	public void username_dropdown_vissible() {
		driver.findElement(By.xpath("//a[@role='button']")).isDisplayed();
		
	   
	}

	@Then("click on DropDown")
	public void click_on_DropDown() {
		driver.findElement(By.xpath("//a[@role='button']")).click();   
	}

	@Then("Click on Profile")
	public void click_on_Profile() {
		driver.findElement(By.xpath("//a[normalize-space()='Profile']")).click();
	    
	}

	@When("the Messages button visible")
	public void the_Messages_button_visible() {
		driver.findElement(By.xpath("//a[normalize-space()='Messages']")).isDisplayed();
	    
	}

	@Then("Click on MessagesBtn")
	public void click_on_MessagesBtn() {
		driver.findElement(By.xpath("//a[normalize-space()='Messages']")).click();
	   
	}

	@When("the ComposeMessage button visible")
	public void the_ComposeMessage_button_visible() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@title='Compose message']")).isDisplayed();
	    
	}

	@Then("Click on CompMsg button")
	public void click_on_CompMsg_button() {
		driver.findElement(By.xpath("//img[@title='Compose message']")).click();
	    
	}

	@Then("set the SendTo field")
	public void set_the_SendTo_field() {
		//driver.findElement(By.className("select2-search__field")).sendKeys("hiiii@gmail.com");
	    
	}

	@Then("set the Subject")
	public void set_the_Subject() {
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Hello");
	    
	}


	@When("the SendMessage button visible")
	public void the_SendMessage_button_visible() {
		driver.findElement(By.name("compose")).isDisplayed();
	   
	}

	@Then("click on SendMessage")
	public void click_on_SendMessage() {
		driver.findElement(By.name("compose")).click();
	   
	}
	
	@Then("check the errorMessage")
	public void check_the_errorMessage() {
		String id=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		System.out.println(id);
		
	}
	
	@When("Edit Profile is visible")
	public void edit_Profile_is_visible() {
		driver.findElement(By.xpath("//a[@class='btn btn-link btn-sm btn-block']")).isDisplayed();
	   
	}

	@Then("click on editProfile")
	public void click_on_editProfile() {
		driver.findElement(By.xpath("//a[@class='btn btn-link btn-sm btn-block']")).click(); 
	}

	@Then("enter firstname")
	public void enter_firstname() {
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hiiiii");
	    
	}

	@Then("enter lastname")
	public void enter_lastname() {
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testttttttt");
	    
	}

	@Then("enter phoneNum")
	public void enter_phoneNum() {
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
	    
	}

	@When("Save button is visible")
	public void save_button_is_visible() {
	  driver.findElement(By.xpath("//button[@name='apply_change']")).isDisplayed(); 
	}

	@Then("click on Save")
	public void click_on_Save() {
		driver.findElement(By.xpath("//button[@name='apply_change']")).click();  
	}

	@Then("close brwdriver")
	public void close_brwdriver() {
		driver.close();  
	}


	
}
