package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAndLogoutTest extends BaseTest{

    @Test
    public void test1(){
        login.openWebsite();
        login.loginuser("standard_user","secret_sauce");
        homePage.clickOnAddToCartOfFirstItem();
        Assert.assertEquals(homePage.CheckCartnumber(),1);
        homePage.clickHamburgerAndClickLogOut();
        Assert.assertTrue(login.CheckLoginPage());
        login.loginuser("standard_user","secret_sauce");
        homePage.isHomePageDisplayed();
        Assert.assertEquals(homePage.CheckCartnumber(),1);



    }
}
