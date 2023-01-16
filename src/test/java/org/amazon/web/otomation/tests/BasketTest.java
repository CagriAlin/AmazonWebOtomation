package org.amazon.web.otomation.tests;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.BasketPage;
import org.junit.Test;

public class BasketTest extends DriverSetup {

    @Test
    public void basketTest(){

        BasketPage basketPage = new BasketPage();
        basketPage.basketPage();

    }
}
