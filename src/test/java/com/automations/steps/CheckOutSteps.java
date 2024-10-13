package com.automations.steps;

import com.automations.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckOutSteps {

    CheckoutPage check = new CheckoutPage();
    @Then("verify user is on checkout page")
    public void verify_user_is_on_checkout_page() {
        Assert.assertTrue(check.PageVef());
    }

    @When("user fill all checkout details")
    public void user_fill_all_checkout_details() {
        check.fillShippingInfo();
    }

    @When("click on Continue button")
    public void click_on_continue_button() {
        check.ContBtn();
    }
}
