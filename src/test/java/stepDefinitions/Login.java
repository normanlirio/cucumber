package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import static org.junit.Assert.assertEquals;

public class Login {
    private final LoginPage loginPage = new LoginPage();

    @When("User clicks on Sign in link and redirects to Login page")
    public void user_clicks_on_sign_in_link_and_redirects_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickLoginLink();
        loginPage.verifyForm();
    }

    @When("Enters valid Username and Password")
    public void enters_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.typeEmail(System.getProperty("userEmail"));
        loginPage.typePassword(System.getProperty("userPassword"));
        loginPage.clickLoginBtn();

    }
    @Then("User is successfully logged in")
    public void user_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Logout", loginPage.verifyLogin());
    }
}
