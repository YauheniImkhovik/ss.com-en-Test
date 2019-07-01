package ssDotCom.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ssDotCom.config.WebDriverCreate;
import ssDotCom.pageObjectPattern.MainPage;

import java.util.concurrent.TimeUnit;

import static ssDotCom.config.Data.LinkTo;
import static ssDotCom.config.Data.searchText;


public class addThreeAdsFromSearchToMemo {

    WebDriver driver = WebDriverCreate.getInstance();

    public MainPage mainPage;

    public addThreeAdsFromSearchToMemo() throws Exception {
    }


    @BeforeClass
    public void setUp() {

    }
     {
        driver.get(LinkTo);
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

     }

    @Test
    public void AddThreeCarToMemoThruSearch() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.navigateToMainPage();
        mainPage.navigateToSearchPage();
        mainPage.typeTextInSearchField(searchText);
        mainPage.sortAdsFromExpensive();
        mainPage.chooseFirstThreeAdsInList();
        mainPage.addSeveralAdsToMemo();
        mainPage.navigateToMemoPage();

      Assert.assertTrue(mainPage.getNumberOfAdsInMemo().contains("4")); // Сравнивается со значением "4", а не "3" т.к остаеться доп. Ad из первого теста

    }


}


