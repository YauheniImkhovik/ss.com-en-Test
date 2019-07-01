package ssDotCom.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;


public class FirefoxDriverCreator extends CreatorOfWebDriver {
    @Override
    public WebDriver FactoryMethod() {
        FirefoxBinary path = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
        FirefoxProfile profile = new FirefoxProfile();
        WebDriver driver = new FirefoxDriver();

        return driver;
    }
}
