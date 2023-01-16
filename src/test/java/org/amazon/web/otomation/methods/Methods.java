package org.amazon.web.otomation.methods;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;

    public Methods() {

        driver = DriverSetup.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

    }

    public void moveToElementAndClick(By by){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(by);
        action.moveToElement(we).moveToElement(driver.findElement(by)).click().build().perform();
    }
    public void moveToElementAndClickXY(By by){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(by);
        action.moveToElement(we).moveByOffset(300,250).click().build().perform();
    }

    public WebElement findElement(By by) {

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public void click(By by) {

        findElement(by).click();

    }


    public void waitBySeconds(long seconds) {

        try {

            Thread.sleep(1000);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    public void waitBySecondslong(long seconds) {

        try {

            Thread.sleep(6000);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
    public boolean isElementVisiable(By by) {


        try {

            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            return true;

        } catch (Exception e) {

            return false;

        }
    }

    public void sendKey(By by, String text) {

        findElement(by).sendKeys(text);

    }


    public Select getSelect(By by) {
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text) {

        getSelect(by).selectByVisibleText(text);
    }

    public String productInfo(By by){

        return driver.findElement(by).getText();
    }

}
