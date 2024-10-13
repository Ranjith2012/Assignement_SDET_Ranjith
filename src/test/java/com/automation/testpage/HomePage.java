package com.automation.testpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    List<WebElement> addToCartBtnList;

    @FindBy(xpath = "//button[@id=\"react-burger-menu-btn\"]")
    WebElement hameButton;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutId;

    @FindBy(xpath = "//select[@class=\"product_sort_container\"]")
    WebElement SortByOption;

    @FindBy(xpath = "//div[@class=\"inventory_item_name \"]")
    List<WebElement> InvenListItemName;

    @FindBy(className = "inventory_item_price")
    List<WebElement> InvenListItemPrice;


    public boolean isHomePageDisplayed() {
        return shoppingCartLink.isDisplayed();
    }

    public void clickOnAddToCartOfFirstItem() {
        addToCartBtnList.get(0).click();
    }

    public void clickOnShoppingCartLink() {
        shoppingCartLink.click();
    }

    public int CheckCartnumber(){
        String num = shoppingCartLink.findElement(By.xpath("./span")).getText();
        int num1 = Integer.parseInt(num);
        return num1;

    }

    public void clickHamburgerAndClickLogOut(){
        hameButton.click();
        logoutId.click();
    }

    public void sortByZtoA(){
        SortByOption.click();
        SortByOption.findElement(By.xpath("./option[@value='za']")).click();
    }

    public String InventoryItemSortCheckFirstItem(){
        String Item = InvenListItemName.get(0).getText();
        return Item;
    }


    public void sortByHighToLow() {
        SortByOption.click();
        SortByOption.findElement(By.xpath("./option[@value='hilo']")).click();
    }

    public String InventoryItemPriceSortCheck(){
        String Item = InvenListItemPrice.get(0).getText();
        String price = Item.replace("$","");
        return price;
    }

    public void AddToCartAllItem(){
        for(WebElement w :addToCartBtnList){
            w.click();
        }
    }

    public boolean checkAddToCartBtnPresent(){

        for(WebElement w :addToCartBtnList){
            String s = w.getText();
            if(s.equals("Remove")){
                return false;
            }
        }
            return true;
    }


}
