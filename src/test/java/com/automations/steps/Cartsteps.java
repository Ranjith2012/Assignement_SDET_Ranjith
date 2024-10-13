package com.automations.steps;

import com.automations.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Cartsteps {

    CartPage cart = new CartPage();

    @Then("verify user is on cart page")
    public void verify_user_is_on_cart_page() {
        cart.CheckBtnVef();
    }

    @When("user click on checkout button")
    public void user_click_on_checkout_button() {
        cart.ClickCheckOut();
    }


    @Then("Verify on cart page total items equals to items you added in the cart")
    public void verifyOnCartPageTotalItemsEqualsToItemsYouAddedInTheCart() {
        Assert.assertEquals(cart.TotalCartItems(),6);
    }
}
