package org.amazon.web.otomation.tests;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.HomePage;
import org.junit.Test;

public class HomeTest extends DriverSetup {

    @Test
    public void homeTest(){

        HomePage homePage = new HomePage();
        homePage.homePage();

    }
}
