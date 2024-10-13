package com.automations.steps;

import com.automations.pages.ConfirmationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ConfirmationSteps {
    ConfirmationPage conf = new ConfirmationPage();
    @Then("verify user is on order confirmation page")
    public void verify_user_is_on_order_confirmation_page() {
        conf.ConfirmationVef();
    }

}
