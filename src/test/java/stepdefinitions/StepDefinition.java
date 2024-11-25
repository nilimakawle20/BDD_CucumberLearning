package stepdefinitions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Before
	public void test()
	{
		System.out.println("Connected to db");
	}
	
	@After
	public void test1()
	{
		System.out.println("DB disconnected");
	}
	
	@Before("@test1")
	public void beforeTest1()
	{
		System.out.println("Before Test1 method");
	}
	
	@After("@test1")
	public void afterTest1()
	{
		System.out.println("After Test1 method");
	}
	
	@Before("@test2")
	public void beforeTest2()
	{
		System.out.println("Before Test2 method");
	}
	
	@After("@test2")
	public void afterTest2()
	{
		System.out.println("After Test2 method");
	}
	
	@Given("User opens the web application in the browser")
	public void user_opens_the_web_application_in_the_browser() {
		System.out.println("Application opened");
	}

	@Given("User will enter the {string}")
	public void user_will_enter_the(String string) {
		System.out.println("Hello");
		    
	}

	@When("User will click on login button")
	public void user_will_click_on_login_button() {
		System.out.println("Hi");
	}
	
	@Given("User will enter the username")
	public void user_will_enter_the_username() {
		System.out.println("New");
	}

	@Given("User will enter the password")
	public void user_will_enter_the_password() {
		System.out.println("Test");
	}
	
	@Then("User will be navigated to homepage")
	public void user_will_be_navigated_to_homepage() {
	  
	}

	@Then("the user will then go to Add to cart section")
	public void the_user_will_then_go_to_add_to_cart_section() {
	
	}

	@Then("the user will then go to favourites section")
	public void the_user_will_then_go_to_favourites_section() {
	  
	}

	@Then("the user will then go to Change User Setting section")
	public void the_user_will_then_go_to_change_user_setting_section() {
	   
	}


	@Then("User will be able to login in the homepage of the application")
	public void user_will_be_able_to_login_in_the_homepage_of_the_application() {
         System.out.println("Welcome");
	}
	
	@Then("User will be able to see the details")
	public void user_will_be_able_to_see_the_details() {
	    
	}


	@Then("User will be getting appropriate error message")
	public void user_will_be_getting_appropriate_error_message() {
		 System.out.println("Error");
	}
	
	
	
	@Given("User is on HRMlogin page")
	public void user_is_on_hr_mlogin_page() {
	  
	}

	@When("User will enter the credentials")
	public void user_will_enter_the_credentials(io.cucumber.datatable.DataTable dataTable) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		List<List<String>> signupForm=dataTable.asLists(String.class);
		
		String Username=signupForm.get(0).get(0);
		String Email=signupForm.get(0).get(1);
		String Mobile=signupForm.get(0).get(2);
		String DOB=signupForm.get(0).get(3);
		
		driver.findElement(By.name("name")).sendKeys(Username);
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("mobile")).sendKeys(Mobile);
		driver.findElement(By.name("dob")).sendKeys(DOB);
	   
	}

	@Then("User will be submitting the form")
	public void user_will_be_submitting_the_form() {
	   
	}

}
