package stepdefinitions;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	public String DealTitle;

	private HomePage HomePage = new HomePage(DriverFactory.getDriver());

@Given("user is on Home Page")
public void user_is_on_home_page() {
	DriverFactory.getDriver()
	.get("https://in.accounts.ikea.com/login?state=g6Fo2SBOSHg0NEg3WHljWm5WQVFsMUZjNmJzUTQtQ1pzRzBOcqN0aWTZIGlzcUFtSmFfVEhjUXR1aVlQd3lXb1YtOFlCTDZMLUcyo2NpZNkgUHhWdkhadUphcEVqek9zRFhZYXhOWHI1bTVyMlpRNXM&client=PxVvHZuJapEjzOsDXYaxNXr5m5r2ZQ5s&protocol=oauth2&redirect_uri=https%3A%2F%2Fwww.ikea.com%2Fin%2Fen%2Fprofile%2Flogin%2F&response_type=code&ui_locales=en-IN&code_chalenge=VLOgbMkUAQ9lv3rz_Iiz8-21dVyKvuZODPwRaDjDMmc&code_chalenge_method=S256&scope=openid%20profile%20email&audience=https%3A%2F%2Fretail.api.ikea.com&registration=%7B%22bveventid%22%3Anull%7D&consumer=OWF&auth0Client=eyJuYW1lIjoiYXV0aDAuanMiLCJ2ZXJzaW9uIjoiOS4xMi4yIn0%3D");
}

@When("Todays Deal button clicked")
public void todays_deal_button_clicked() {
	HomePage.TodaysDealsButton();
}

@Then("Verify {string} is present")
public void verify_is_present(String expected) {
	DealTitle=HomePage.DealOfTheDay();
	Assert.assertTrue(DealTitle.equals(expected));
}

}
