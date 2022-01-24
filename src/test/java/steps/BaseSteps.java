package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.selenium.Settings;

import static utils.selenium.Driver.browser;

public class BaseSteps {

    @Given("^A user is on the base page$")
    public void a_user_is_on_the_base_page() throws Throwable {
        String baseUrl = Settings.baseUrl;
        browser().navigate().to(baseUrl);
        System.out.println("Welcome to Product - Selenium Automation Framework");
        //throw new PendingException();
    }
    @Then("^they see the page title contains \"([^\"]*)\"$")
    public void they_see_the_page_title_contains_something(String strArg1) throws Throwable {

        System.out.println("Welcome to Product - Selenium Automation Framework");
        //throw new PendingException();
    }
}
