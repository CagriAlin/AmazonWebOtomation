package org.amazon.web.otomation.pages;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;
    Logger logger = LogManager.getLogger(DriverSetup.class);

    public HomePage(){

        methods = new Methods();

    }

    public void homePage(){

        try {
            logger.info("***AMAZON WEB SİTESİ OTOMASYON TESTİ BAŞLIYOR***");
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")));
            logger.info("Anasayfa açıldı.");
            methods.waitBySeconds(2);
            methods.click(By.id("sp-cc-accept"));
            logger.info("Çerezler kabul edildi.");
            methods.click(By.xpath("//a[@data-nav-ref='nav_custrec_signin']"));
            logger.info("Giriş için sayfa açıldı açıldı.");
            methods.waitBySeconds(1);
        }
        catch (Exception e) {
            logger.error("Hata: "+e);
        }

    }
    public void search(){

        try {
            methods.sendKey(By.id("twotabsearchtextbox"),"telefon");
            logger.info("Arama çubuğuna telefon yazıldı.");
            methods.waitBySeconds(1);
            methods.click(By.id("nav-search-submit-button"));
            logger.info("Telefon aratıldı.");
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//span[contains(text(),'\"telefon\"')]")));
            logger.info("Telefon aratılıldığı doğrulandı.");
            methods.waitBySeconds(1);
        }
        catch (Exception e) {
            logger.error("Hata: "+e);
        }

    }
}
