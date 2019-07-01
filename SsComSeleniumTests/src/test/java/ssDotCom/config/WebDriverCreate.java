package ssDotCom.config;


import org.openqa.selenium.WebDriver;

public class WebDriverCreate {

    private static WebDriver driver;

    public static WebDriver getInstance() throws Exception {
        if (null == driver) {
            driver = CreatorOfWebDriver.Create("chrome");
        }
        return driver;
    }
}
