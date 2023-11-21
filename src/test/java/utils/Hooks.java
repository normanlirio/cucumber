package utils;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        DriverHelper.initiateDriver();
        TestProperties.loadProperties();
    }


    @After
    public void tearDown() {
        DriverHelper.webDriver.close();
    }
}

