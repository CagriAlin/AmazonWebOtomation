package org.amazon.web.otomation.driverSetup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSetup {

    public static WebDriver driver;

    @Before
    public void setUp(){

        System.setProperty("web-driver.chrome.driver", "webDriver/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("disable-info bars");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-extensions");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        chromeOptions.merge(desiredCapabilities);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
