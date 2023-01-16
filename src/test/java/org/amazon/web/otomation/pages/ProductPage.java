package org.amazon.web.otomation.pages;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(DriverSetup.class);

    public ProductPage() {

        methods = new Methods();

    }

    public void productPage() {

        try {
            String productPrice1 = methods.productInfo(By.xpath("//span[contains(text(),'16.482')]"));
            String productName1 = methods.productInfo(By.xpath("//span[contains(text(),'Apple iPhone 11')]"));
            methods.click(xpath("//img[@data-image-index=6]"));
            logger.info("6. ürün açıldı.");
            String productName2 = methods.productInfo(By.xpath("//span[contains(text(),'Apple iPhone 11')]"));
            Assert.assertSame(productName1, productName2);
            logger.info("6. ürün açıldığı doğrulandı.");
            methods.waitBySeconds(1);
            methods.click(By.id("add-to-cart-button"));
            logger.info("Ürün sepete eklendi.");
            methods.waitBySecondslong(1);
            methods.click(xpath("//a[@class='a-link-normal close-button']"));
            methods.waitBySeconds(1);
            methods.click(By.id("nav-cart-count"));
            logger.info("Sepete gidildi.");
            String productName3 = methods.productInfo(By.xpath("//span[contains(text(),'Apple iPhone 11')]"));
            String productPrice2 = methods.productInfo(By.xpath("//span[contains(text(),'16.482')]"));
            Assert.assertSame(productName1, productName3);
            Assert.assertSame(productPrice1, productPrice2);
            methods.waitBySeconds(1);

        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
}
