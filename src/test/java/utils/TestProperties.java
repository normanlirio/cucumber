package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public static Properties properties;

    public static void loadProperties() {
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("env.variable"));
            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}
