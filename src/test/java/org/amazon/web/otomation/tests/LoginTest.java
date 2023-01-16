package org.amazon.web.otomation.tests;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends DriverSetup{

    @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.loginPage();


    }

}
