
  
package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

@Given("user is on login page")
public void user_is_on_login_page() {
	DriverFactory.getDriver()
	.get("https://www.ikea.com/in/en/profile/login");
}

@When("user enters email {string}")
public void user_enters_email(String username) {
	
		loginPage.getemail(username);
}

@When("user enters password {string}")
public void user_enters_password(String password) throws InterruptedException {
	loginPage.getpwd(password);
	
}

@When("user clicks Login button")
public void user_clicks_login_button() {
	loginPage.loginbutton();
	
}

@Then("Page title should be {string}")
public void page_title_should_be(String expectedTitleName) {
	title=loginPage.getLoginTitle();
	Assert.assertTrue(title.contains(expectedTitleName));
}


	
	  
	}



