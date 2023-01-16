package org.amazon.web.otomation.tests;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.PayingPage;
import org.junit.Test;

public class PayingTest  extends DriverSetup {

    @Test
    public void payingTest(){

        PayingPage payingPage = new PayingPage();
        payingPage.payingPage();

    }
}

