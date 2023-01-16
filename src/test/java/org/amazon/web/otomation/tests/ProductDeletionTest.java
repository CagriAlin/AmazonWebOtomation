package org.amazon.web.otomation.tests;

import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.BasketPage;
import org.junit.Test;

public class ProductDeletionTest extends DriverSetup{
    @Test
    public void productDeletionTest(){

        BasketPage productDeletion = new BasketPage();
        productDeletion.productDeletion();

    }

}
