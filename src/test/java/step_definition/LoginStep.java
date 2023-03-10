package step_definition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.BaseClass;
import util.CommonMethods;

public class LoginStep extends CommonMethods{

	@Given("User is on home page")
	public void user_is_on_home_page() {
	    Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), "https://practice.automationtesting.in/");
	}
	@When("User clicks on myaccout link")
	public void user_clicks_on_myaccout_link() {
	    hp.accountLink.click();
	}
	@Then("Verify dashboard link is displayed")
	public void verify_dashboard_link_is_displayed() {
	    Assert.assertEquals(BaseClass.getDriver().getCurrentUrl(), "https://practice.automationtesting.in/my-account/");
	}

	
}
