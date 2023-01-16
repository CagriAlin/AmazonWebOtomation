package org.amazon.web.otomation.tests;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.HomePage;
import org.junit.Test;

public class SearchTest extends DriverSetup {

    @Test
    public void searchTest(){

        HomePage search = new HomePage();
        search.search();

    }
}