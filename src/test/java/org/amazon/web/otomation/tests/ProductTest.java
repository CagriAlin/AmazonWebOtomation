package org.amazon.web.otomation.tests;


import org.amazon.web.otomation.driverSetup.DriverSetup;
import org.amazon.web.otomation.pages.ProductPage;
import org.junit.jupiter.api.Test;

public class ProductTest extends DriverSetup {
    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.productPage();
    }
}
