package com.automation.testpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage{

    @FindBy(css =".complete-header")
    WebElement msg;

    public boolean ConfirmationVef(){
        System.out.println(msg.getText());
        return msg.isDisplayed();
    }

}
