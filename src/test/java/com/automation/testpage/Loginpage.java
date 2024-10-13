package com.automation.testpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage{

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void loginuser(String name, String password){
        username.sendKeys(name);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }


    public void openWebsite() {
        driver.get("https://www.saucedemo.com/");
    }

    public boolean CheckLoginPage() {
        return loginBtn.isDisplayed();
    }

}
