package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.UserCredentials;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @When("User enters invalid {string} or {string}")
    public void userEntersInvalidOr(String email, String password) {
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
    }

    @Then("User should see {string}")
    public void userShouldSee(String arg0) {
        assertEquals(arg0, loginPage.verifyErrorLoginMessage());
    }

    @When("User types invalid email or password")
    public void userTypesInvalidUsernameOrPassword(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        for (Map<String, String> row : list) {
            loginPage.typeEmail(row.get("email"));
            loginPage.typePassword(row.get("password"));
            loginPage.clickLoginBtn();
            loginPage.verifyErrorLoginMessage();
        }
    }

    @Then("User should see message")
    public void userShouldSeeMessage() {
        System.out.println("message");
    }
}
