package com.automation.test;

import com.automation.Utils.Configreader;
import com.automation.testpage.CartPage;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignementTestCases extends BaseTest{

    @Test
    public void SortByZtoA(){
        login.openWebsite();
        login.loginuser(Configreader.getConfigFile("login.username"),Configreader.getConfigFile("login.password"));
        homePage.isHomePageDisplayed();
        homePage.sortByZtoA();
        Assert.assertEquals(homePage.InventoryItemSortCheckFirstItem(),"Test.allTheThings() T-Shirt (Red)");

    }

    @Test
    public void SortByPrice(){
        login.openWebsite();
        login.loginuser(Configreader.getConfigFile("login.username"),Configreader.getConfigFile("login.password"));
        homePage.isHomePageDisplayed();
        homePage.sortByHighToLow();
        Assert.assertEquals(homePage.InventoryItemPriceSortCheck(),"49.99");
    }


    @Test
    public void AddAllItemToCart(){
        login.openWebsite();
        login.loginuser(Configreader.getConfigFile("login.username"),Configreader.getConfigFile("login.password"));
        homePage.AddToCartAllItem();
        Assert.assertEquals(homePage.CheckCartnumber(),6);
        homePage.clickOnShoppingCartLink();
        Assert.assertEquals(cart.TotalCartItems(),homePage.CheckCartnumber());
    }

    @Test
    public void VerifyTotalPrice(){
        login.openWebsite();
        login.loginuser(Configreader.getConfigFile("login.username"),Configreader.getConfigFile("login.password"));
        homePage.AddToCartAllItem();
        Assert.assertEquals(homePage.CheckCartnumber(),6);
        homePage.clickOnShoppingCartLink();
        cart.ClickCheckOut();
        check.fillShippingInfo();
        check.ContBtn();
        Assert.assertEquals(view.EachItemAddedPricePlus()+ view.getTax(),view.getTotalPrice());
    }

    @Test
    public void VerifyRemoveAllProducts(){
        login.openWebsite();
        login.loginuser(Configreader.getConfigFile("login.username"),Configreader.getConfigFile("login.password"));
        homePage.AddToCartAllItem();
        homePage.clickOnShoppingCartLink();
        cart.ClickCheckOut();
        check.fillShippingInfo();
        check.ContBtn();
        view.FinishClick();
        view.backToHome();
        homePage.isHomePageDisplayed();
        //Check Add To cart Button Present
        Assert.assertTrue(homePage.checkAddToCartBtnPresent());
    }
}
