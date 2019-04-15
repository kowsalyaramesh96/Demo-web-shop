package stepdefinition;

import cucumber.api.java.en.Given;
import utils.Driver;

public class HomePage extends Driver{
	@Given("^I navigate to the login page$")
	public void iNavigateToTheLoginPage() throws Throwable {
		getDriver().get("http://demowebshop.tricentis.com");
	}

}
