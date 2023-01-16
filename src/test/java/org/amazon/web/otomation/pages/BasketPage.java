package org.amazon.web.otomation.pages;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPage{
    Methods methods;
    Logger logger = LogManager.getLogger(DriverSetup.class);

    public BasketPage() {

        methods = new Methods();

    }

    public void basketPage() {

        try {
            methods.click(By.id("sc-buy-box-ptc-button"));
            logger.info("Alışverişi tamamla butonuna tıklanır.");
            methods.waitBySeconds(1);
        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
    public void productDeletion() {

        try {
            methods.click(By.xpath("//input[@data-action='delete']"));
            logger.info("Ürün sepetten silinir.");
            methods.waitBySeconds(1);
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//h1[contains(text(),'Amazon sepetiniz boş.')]")));
            logger.info("Sepetin boş olduğu doğrulanır.");
            methods.waitBySeconds(1);
        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
    public void logOut() {

        try {
            methods.click(By.id("nav-item-signout"));
            logger.info("Çıkış yapıldı.");
            methods.waitBySeconds(1);
        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
}
