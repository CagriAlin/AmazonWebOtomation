package org.amazon.web.otomation.pages;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.methods.Methods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger(DriverSetup.class);

    public LoginPage(){

        methods = new Methods();

    }

    public void loginPage(){

        try {
            methods.sendKey(By.id("ap_email"),"omercagrialin@gmail.com");
            logger.info("Mail adresi girildi.");
            methods.waitBySeconds(1);
            methods.click(By.id("continue"));
            methods.waitBySeconds(1);
            methods.sendKey(By.id("ap_password"),"12345678.");
            logger.info("Şifre girildi.");
            methods.waitBySeconds(1);
            methods.click(By.id("auth-signin-button"));
            logger.info("Giriş yapıldı.");
            methods.waitBySeconds(1);
            Assert.assertTrue(methods.isElementVisiable(By.xpath("//span[contains(text(),'Ömer')]")));
            logger.info("Giriş yapıldığı doğrulandı.");
            methods.waitBySeconds(1);
        }

        catch (Exception e) {

            logger.error("Hata: "+e);
        }

    }

}
