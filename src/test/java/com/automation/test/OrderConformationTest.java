package com.automation.test;

import com.automation.Utils.Configreader;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OrderConformationTest extends BaseTest {


    @Test
    public void verifyUserCanPlaceOrder() {

        login.openWebsite();
        login.loginuser(Configreader.getConfigFile("login.username"), Configreader.getConfigFile("login.password"));

        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.clickOnAddToCartOfFirstItem();
        homePage.clickOnShoppingCartLink();

        Assert.assertTrue(cart.CheckBtnVef());
        cart.ClickCheckOut();

        Assert.assertTrue(check.PageVef());
        check.fillShippingInfo();
        check.ContBtn();

        Assert.assertTrue(view.FinishVef());
        view.FinishClick();

        Assert.assertTrue(conf.ConfirmationVef());
    }


}