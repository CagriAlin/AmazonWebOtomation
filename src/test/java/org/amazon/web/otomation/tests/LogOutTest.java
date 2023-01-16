package org.amazon.web.otomation.tests;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.BasketPage;
import org.junit.Test;

public class LogOutTest extends DriverSetup {

    @Test
    public void logOutTest(){

        BasketPage logOut = new BasketPage();
        logOut.logOut();

    }
}

