package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class BaseDefinition {

    @Given("User is on home page")
    public void user_is_on_homepage() {
        new LoginPage().visitPage("/");
    }
}
