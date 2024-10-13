package com.automation.test;

import com.automation.Utils.Configreader;
import com.automation.Utils.DriverManager;
import com.automation.testpage.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;

public class BaseTest {
    Loginpage login;
    HomePage homePage;
    CartPage cart;
    CheckoutPage check;
    ConfirmationPage conf;
    ReviewPage view;

    @BeforeMethod
    public void setUp() {
        Configreader.initialProperties();
        DriverManager.createDriver();

        login = new Loginpage();
        homePage = new HomePage();
        cart = new CartPage();
        check = new CheckoutPage();
        conf = new ConfirmationPage();
        view = new ReviewPage();
    }

    @AfterMethod
    public void cleanUp() {
        DriverManager.getDriver().quit();
    }

}
