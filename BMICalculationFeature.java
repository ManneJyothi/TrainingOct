package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BMICalculationFeature {
	WebDriver driver;
	@Given("the calculator website is launched")
	public void the_calculator_website_is_launched() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003DWB744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net");
		driver.manage().window().maximize();    
	}

	@Then("validate the title of page")
	public void validate_the_title_of_page() {
		String expectedTitle1=driver.getTitle();
		//System.out.println(expectedTitle1);
		String actualTitle="Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";
		Assert.assertEquals(actualTitle, expectedTitle1);
	}

	@When("BMI calculator visible")
	public void bmi_calculator_visible() {
	 driver.findElement(By.xpath("//a[normalize-space()='BMI Calculator']")).isDisplayed(); 
	}

	@Then("click on BMI calculator")
	public void click_on_BMI_calculator() {
		driver.findElement(By.xpath("//a[normalize-space()='BMI Calculator']")).click();  
	}

	@Then("Validate the titile of page again")
	public void validate_the_titile_of_page_again() {
	    String expectedTitle2=driver.getTitle();
	    //System.out.println(expectedTitle2);
		String actualTitle2= "BMI Calculator";
	    Assert.assertEquals(expectedTitle2, actualTitle2);
	    
	}

	@Then("set Age {string}")
	public void set_Age(String string) {
   driver.findElement(By.xpath("//input[@id='cage']")).clear();
	   driver.findElement(By.xpath("//input[@id='cage']")).sendKeys(string);
	}

	@Then("set Height {string}")
	public void set_Height(String string) {
		driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
		driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys(string);
	}

	@Then("set Weight {string}")
	public void set_Weight(String string) {
		driver.findElement(By.xpath("//input[@id='ckg']")).clear();
		driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys(string);
	    
	}

	@Then("click on calculate BMI")
	public void click_on_calculate_BMI() {
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	    
	}

	@When("the BMI results visible")
	public void the_BMI_results_visible() {
	   System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[4]/div[1]/b[1]")).getText());
	   System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[4]/ul[1]/li[1]")).getText());
	   System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[4]/ul[1]/li[2]")).getText());
	   System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[4]/ul[1]/li[3]")).getText());
	}

	@Then("Capture the BMI results")
	public void capture_the_BMI_results() {
	   
	}

	@Then("Close driver")
	public void close_driver() {
	  driver.close();  
	}


}
