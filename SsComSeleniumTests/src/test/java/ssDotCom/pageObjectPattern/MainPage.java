package ssDotCom.pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class MainPage {
    public WebDriver driver;
    By realEstateLink = By.linkText("Real estate");
    By searchLink = By.linkText("Search");
    By searchField = By.id("ptxt");
    By searchBtn = By.id("sbtn");
    By priceSotrBtn = By.linkText("Price");
    By firstAdInList = By.name("mid[]");
    By secondAdInList = By.xpath("//tr[3]/td/input");
    By thirdAdInList = By.xpath("//tr[4]/td/input");
    By addToFaveFromListBtn = By.id("a_fav_sel");
    By okPopupBtn = By.id("alert_ok");
    By memoLinkBtn = By.linkText("Memo");
    By numberOfAdsInMemo = By.id("mnu_fav_id");
    // By lineNumber = By.name("filter_frm");
    By catLink = By.linkText("Cats, kittens");
    By firstAdInGroup = By.xpath("//td[3]/div[2]");
    By addToFaveFromADPagrBtn = By.id("a_fav");
    By mainPageBtn = By.xpath("//img");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage navigateToSearchPage() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(searchLink).click();
        return this;
    }

    public MainPage typeTextInSearchField(String searchText) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(searchField).sendKeys(searchText, Keys.RETURN);

        return this;
    }

    /* public MainPage submitSearching () {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(searchBtn).click();

        return this;
    }

     */
    public MainPage sortAdsFromExpensive() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(priceSotrBtn).click();
        Thread.sleep(1500);
        driver.findElement(priceSotrBtn).click();
        return this;
    }

    public MainPage chooseFirstThreeAdsInList() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(firstAdInList).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(secondAdInList).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(thirdAdInList).click();
        return this;
    }

    public MainPage addSeveralAdsToMemo() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(addToFaveFromListBtn).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(okPopupBtn).click();
        return this;
    }

    public MainPage navigateToMemoPage() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(memoLinkBtn).click();
        return this;
    }

    public String getNumberOfAdsInMemo() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String firstTitle = driver.findElement(numberOfAdsInMemo).getText();
        return firstTitle;
    }
    //String secondTitle = driver.findElement(secondAdInList).getText();
    //   String thirtTitle = driver.findElement(thirdAdInList).getText();

    public MainPage navigateToCats() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(catLink).click();
        return this;
    }

    public MainPage adFirstAdFromGroup() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(firstAdInGroup).click();
        return this;
    }

    public MainPage addToFaveFromAdPage() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(addToFaveFromADPagrBtn).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(okPopupBtn).click();
        return this;
    }

    public MainPage sortAdsFromChepiest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(priceSotrBtn).click();
        return this;
    }
    public MainPage navigateToMainPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(mainPageBtn).click();
        return this;
    }
}

