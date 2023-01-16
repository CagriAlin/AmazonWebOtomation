package org.amazon.web.otomation.pages;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static org.amazon.web.otomation.driverSetup.DriverSetup.driver;

public class PayingPage {

    Methods methods;
    Logger logger = LogManager.getLogger(DriverSetup.class);

    public PayingPage() {

        methods = new Methods();

    }

    public void payingPage() {

        try {
            //İLK DEFA ADRES GİRİLMEK İSTENİRSE
            /**
            methods.sendKey(By.id("address-ui-widgets-enterAddressFullName"),"Ömer Çağrı Alın");
            logger.info("Ad ve Soyad girildi.");
            methods.sendKey(By.id("address-ui-widgets-enterAddressPhoneNumber"),"5546788386");
            logger.info("Telefon numarası girildi.");
            methods.sendKey(By.id("address-ui-widgets-enterAddressLine1"),"Yeni Mahalle 45 Kasım");
            methods.sendKey(By.id("address-ui-widgets-enterAddressLine2"),"No:1");
            logger.info("Adres girildi.");
            methods.sendKey(By.id("address-ui-widgets-enterAddressCity"),"Hatay");
            logger.info("il girildi.");
            methods.sendKey(By.id("address-ui-widgets-enterAddressStateOrRegion"),"Kırıkhan");
            logger.info("İlçe.");
            methods.sendKey(By.id("address-ui-widgets-enterAddressDistrictOrCounty"),"Yeni Mh.");
            logger.info("Mahalle girildi.");
            methods.waitBySeconds(1);
            methods.click(By.id("address-ui-widgets-form-submit-button"));
            methods.waitBySeconds(1);
            methods.sendKey(By.id("tax-registration-number-field-tr"),"41683316866");
            logger.info("Kimlik kartı girildi.");
            methods.sendKey(By.id("business-legal-name-tr"),"Ömer Çağrı Alın");
            logger.info("Ad ve Soyad  girildi.");
            methods.waitBySeconds(1);
            methods.click(By.id("taxid-continue-enabled"));
            methods.waitBySeconds(1); **/

            methods.click(By.id("shipToThisAddressButton"));
            methods.waitBySecondslong(1);
            logger.info("Bu adresi kullan butonuna tıklandı.");
            methods.moveToElementAndClick(By.xpath("//a[contains(text(),'Kredi kartı veya banka kartı ekleyin')]"));
            methods.waitBySecondslong(1);
            methods.sendKey(By.xpath("//input[@name='addCreditCardNumber']"),"1222344456667888");
            logger.info("Kart bilgileri girildi.");
            methods.waitBySecondslong(1);
            methods.moveToElementAndClick(By.xpath("//input[@name='ppw-accountHolderName']"));
            methods.sendKey(By.xpath("//input[@name='ppw-accountHolderName']"),"Ömer Çağrı Alın");
            logger.info("Ad ve Soyad girildi.");
            methods.waitBySeconds(1);
            methods.moveToElementAndClick(By.id("pp-3YE1PB-28"));
            methods.waitBySeconds(1);
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//span[contains(text(),'Kart numarası doğru değil.')]")));
            logger.info("Kart bilgilerinn doğru olmadığı doğrulandı.");
            methods.waitBySeconds(1);
            methods.click(By.xpath("//i[@class='a-icon a-icon-close']"));
            methods.waitBySeconds(1);
            methods.click(By.xpath("//i[@class='a-icon a-icon-logo clickable-heading']"));
            methods.waitBySeconds(1);
            methods.click(By.id("a-autoid-1"));
            logger.info("Sepete dönüldü.");
            methods.waitBySeconds(1);

        }
        catch (Exception e){
            logger.error("Hata:"+e);
        }

    }
}
