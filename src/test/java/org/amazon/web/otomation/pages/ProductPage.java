package org.amazon.web.otomation.pages;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(DriverSetup.class);

    public ProductPage() {

        methods = new Methods();

    }

    public void productPage() {

        try {
            methods.click(By.xpath("//img[@data-image-index=6]"));
            logger.info("6. ürün açıldı.");
            methods.waitBySeconds(1);
            methods.click(By.id("add-to-cart-button"));
            logger.info("Ürün sepete eklendi.");
            methods.waitBySecondslong(1);
            methods.click(By.xpath("//a[@class='a-link-normal close-button']"));
            methods.waitBySeconds(1);
            methods.click(By.id("nav-cart-count"));
            logger.info("Sepete gidildi.");
            methods.waitBySeconds(1);

        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
}
