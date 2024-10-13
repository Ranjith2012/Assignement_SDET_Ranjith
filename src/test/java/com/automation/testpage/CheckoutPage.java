package com.automation.testpage;

import com.automation.Utils.Configreader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(xpath= "//span[@class='title'][contains(text(),'Checkout')]")
    WebElement checkOutVef;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "postal-code")
    WebElement zipCodeInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    public boolean PageVef(){
        return checkOutVef.isDisplayed();
    }

    public void fillShippingInfo() {
        firstNameInput.sendKeys(Configreader.getConfigFile("shipping.firstname"));
        lastNameInput.sendKeys(Configreader.getConfigFile("shipping.lastname"));
        zipCodeInput.sendKeys(Configreader.getConfigFile("shipping.zipcode"));
    }

    public void ContBtn(){
        continueBtn.click();
    }
}
