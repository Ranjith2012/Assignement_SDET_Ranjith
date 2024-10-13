package com.automations.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReviewPage extends BasePage{
    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(id = "back-to-products")
    WebElement backToHomeBtn;

    @FindBy(className = "inventory_item_price")
    List<WebElement> EachItemPrice;

    @FindBy(className = "summary_total_label")
    WebElement TotalPrice;

    @FindBy(className = "summary_tax_label")
    WebElement tax;

    public boolean FinishVef(){
        return finishBtn.isDisplayed();
    }

    public void FinishClick(){
        finishBtn.click();
    }

    public double EachItemAddedPricePlus(){
        double total =0;
        for(WebElement price : EachItemPrice){
            String s = price.getText();
            String s1 = s.replace("$","");
            double s2 = Double.parseDouble(s1);
            total+=s2;
        }
        return total;
    }

    public double getTax(){
        double ta=0;
        String val = tax.getText();
        String val1=val.replace("Tax: $","");
        ta += Double.parseDouble(val1);
        return ta;
    }

    public String getTotalPrice(){
        String price = TotalPrice.getText();
        String s1 = price.replace("Total: $","");
        //double total = Double.parseDouble(s1);
        return s1;
    }
    public void backToHome(){
        backToHomeBtn.click();
    }

}
