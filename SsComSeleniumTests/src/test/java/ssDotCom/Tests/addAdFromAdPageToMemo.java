package ssDotCom.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ssDotCom.config.WebDriverCreate;
import ssDotCom.pageObjectPattern.MainPage;

import java.util.concurrent.TimeUnit;

import static ssDotCom.config.Data.LinkTo;

public class addAdFromAdPageToMemo {
    WebDriver driver = WebDriverCreate.getInstance();

    public MainPage mainPage;

    public addAdFromAdPageToMemo() throws Exception {
    }

    @BeforeClass
    public void setUp() {

    }

    {
        driver.get(LinkTo);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Test
    public void AddCornishToFavorite() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.navigateToMainPage();
        mainPage.navigateToCats();
        mainPage.sortAdsFromChepiest();
        mainPage.adFirstAdFromGroup();
        mainPage.addToFaveFromAdPage();
        mainPage.navigateToMemoPage();

        Assert.assertTrue(mainPage.getNumberOfAdsInMemo().contains("1"));

    }

    @AfterTest
    public void cleanUp() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }

}

