package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CustomActions;
import utils.DriverHelper;
import utils.TestProperties;

import java.util.List;
import java.util.Properties;

abstract public class BasePage {

    private By container;
    private By home;
    private By products;
    private By cart;
    private By login;
    private By logout;
    private By deleteAccount;
    private By testCases;
    private By apiTesting;
    private By videoTutorials;
    private By contactUs;
    private By loggedInAs;

    protected final CustomActions customActions;
    protected WebDriver driver;

    public BasePage() {
        this.customActions = new CustomActions();
        this.driver = DriverHelper.webDriver;
        initHomeElements();
    }

    public List<WebElement> getNavBar() {
        return driver.findElements(this.container);
    }
    public void visitPage(String url) {
        this.driver.get(TestProperties.properties.getProperty("base.url") + url);
    }
    public void clickHomeLink() {
        this.customActions.click(driver.findElement(home));
    }
    public void clickLoginLink() {
        this.customActions.click(driver.findElements(this.container).get(3));
    }
    public void clickProductsLink() {
        this.customActions.click(driver.findElement(products));
    }
    public Boolean verifyNavbar() {
        return this.customActions.isVisible(driver.findElement(container));
    }

    private void initHomeElements() {
        this.container = By.tagName("li");
        this.login = By.className("fa");
        this.products = By.className("card_travel");
    }
}
