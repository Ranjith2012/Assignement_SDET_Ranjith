package com.automations.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{

    @FindBy(id="checkout")
    WebElement checkOutBtn;

    @FindBy(className = "cart_item")
    List<WebElement> cartItemList;

    public boolean CheckBtnVef(){
        return checkOutBtn.isDisplayed();
    }

    public void ClickCheckOut(){
        checkOutBtn.click();
    }

    public  int TotalCartItems(){
        return cartItemList.size();
    }
}
