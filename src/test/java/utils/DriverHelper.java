package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Properties;

public class DriverHelper {

    public static WebDriver webDriver;

    public static void initiateDriver() {

        switch (System.getProperty("webDriver")) {
            case "chrome" : {
                webDriver = new ChromeDriver();
                break;
            }
            case "firefox" : {
                webDriver = new FirefoxDriver();
                break;
            }
            default: {
                webDriver = new InternetExplorerDriver();
            }
        }

        webDriver.manage().window().maximize();
    }
}
