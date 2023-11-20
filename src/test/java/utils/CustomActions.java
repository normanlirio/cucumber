package utils;

import org.openqa.selenium.WebElement;

public class CustomActions {

    public void click(WebElement element) {
        element.click();
    }
    public void type(WebElement element, String query) { element.sendKeys(query); }

    public Boolean isVisible(WebElement element) {
        return element.isDisplayed();
    }
}
