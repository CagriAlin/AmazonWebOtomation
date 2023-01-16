package org.amazon.web.otomation.tests;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.*;
import org.amazon.web.otomation.tests.*;
import org.junit.Test;

public class MainTest extends DriverSetup{

    @Test
    public void mainTest(){

        HomeTest homeTest = new HomeTest();
        homeTest.homeTest();
        LoginTest loginTest = new LoginTest();
        loginTest.loginTest();
        SearchTest searchTest = new SearchTest();
        searchTest.searchTest();
        ProductTest productTest = new ProductTest();
        productTest.productTest();
        BasketTest basketTest = new BasketTest();
        basketTest.basketTest();
        PayingTest payingTest = new PayingTest();
        payingTest.payingTest();
        ProductDeletionTest productDeletionTest = new ProductDeletionTest();
        productDeletionTest.productDeletionTest();
        LogOutTest logOutTest = new LogOutTest();
        logOutTest.logOutTest();
    }
}
