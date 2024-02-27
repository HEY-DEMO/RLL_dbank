package signin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.signinpage;

public class signin {
	 private WebDriver driver;
	    private signinpage signin;

	    @Before
	    public void setUp() {
	    	System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
	        driver = new EdgeDriver();
	        signin = new signinpage(driver);
	    }

	    @After
	    public void tearDown() {
	        driver.quit();
	    }
	    @Given("^the user is on the sign-in page$")
	    public void the_user_is_on_the_sign_in_page() {
	        driver.get("http://dbankdemo.com/bank/login");
	    }

	    @When("^the user enters valid username and password$")
	    public void the_user_enters_valid_username_and_password() {
	        signin.enterUsername("vergil@gmail.com");
	        signin.enterPassword("Demo@123");
	    }

	    @And("^clicks on the sign-in button$")
	    public void clicks_on_the_sign_in_button() {
	        signin.clickSignInButton();
	    }

	  
	    @Then("the user should be successfully signed in")
	    public void the_user_should_be_successfully_signed_in() {
	        // Write code here that turns the phrase above into concrete actions
	        Assert.assertEquals(driver.getTitle(),"Digital Bank");
	    }
	    @When("^the user enters an invalid username and valid password$")
	    public void the_user_enters_an_invalid_username_and_valid_password() {
	        signin.enterUsername("invalidUsername");
	        signin.enterPassword("Demo@123");
	        signin.clickSignInButton();
	    }
	    @When("the user enters a valid username and invalid password")
	    public void the_user_enters_a_valid_username_and_invalid_password() {
	        signin.enterUsername("vergil@gmail.com");
	        signin.enterPassword("invalidPassword");
	    }
	    @When("the user leaves the username field empty and enters a valid password")
	    public void the_user_leaves_the_username_field_empty_and_enters_a_valid_password() {
	        signin.enterUsername("");
	        signin.enterPassword("Demo@123");
	    }
	    @Then("the user should not be signed in")
	    public void the_user_should_not_be_signed_in() {
	    	 Assert.assertEquals(driver.getTitle(),"Digital Bank");
	    }
	    @When("checks the Remember Me option")
	    public void checks_the_remember_me_option() {
	        signin.checkRememberMe();
	    }
	    @When("the user enters a valid username and leaves the password field empty")
	    public void the_user_enters_a_valid_username_and_leaves_the_password_field_empty() {
	    	  signin.enterUsername("vergil@gmail.com");
		        signin.enterPassword("");

	    }

}
