package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By email;
    private By form;
    private By loginBtn;
    private By password;

    public LoginPage() {
        this.email = By.cssSelector("[data-qa='login-email']");
        this.form = By.tagName("form");
        this.loginBtn = By.cssSelector("[data-qa='login-button']");
        this.password = By.cssSelector("[data-qa='login-password']");
    }

    public void clickLoginBtn() {
        this.customActions.click(driver.findElement(this.loginBtn));
    }
    public void typeEmail(String email) {
        this.customActions.type(driver.findElement(this.email), email);
    }

    public void typePassword(String password) {
        this.customActions.type(driver.findElement(this.password), password);
    }

    public Boolean verifyForm() {
        return this.customActions.isVisible(driver.findElement(this.form));
    }

    public String verifyLogin() {
        return this.getNavBar().get(3).getText();
    }
}
