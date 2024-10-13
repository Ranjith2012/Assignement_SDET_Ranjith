package com.automations.steps;

import com.automations.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class homestpes {

    HomePage home = new HomePage();


    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(home.isHomePageDisplayed());
    }

    @When("user click on add to cart button of the first item")
    public void user_click_on_add_to_cart_button_of_the_first_item() {
        home.clickOnAddToCartOfFirstItem();
    }

    @Then("verify cart icon displays quantity one")
    public void verify_cart_icon_displays_quantity_one() {
        Assert.assertEquals(home.CheckCartnumber(),1);
    }

    @When("user click on cart icon")
    public void user_click_on_cart_icon() {
        home.clickOnShoppingCartLink();
    }

    @When("Sort product from Z to A")
    public void sortProductFromZToA() {
        home.sortByZtoA();
    }

    @Then("Verify product sorted by z to a")
    public void verifyProductSortedByZToA() {
        Assert.assertEquals(home.InventoryItemSortCheckFirstItem(),"Test.allTheThings() T-Shirt (Red)");
    }

    @And("Sort product from price high to low")
    public void sortProductFromPriceHighToLow() {
        home.sortByHighToLow();
    }

    @Then("Verify product sorted by price")
    public void verifyProductSortedByPrice() {
        Assert.assertEquals(home.InventoryItemPriceSortCheck(),"49.99");
    }

    @When("Add all items into cart")
    public void addAllItemsIntoCart() {
        home.AddToCartAllItem();
    }

    @Then("Verify cart icon quantity is equals to items you added in the cart")
    public void verifyCartIconQuantityIsEqualsToItemsYouAddedInTheCart() {
        Assert.assertEquals(home.CheckCartnumber(),6);
    }

    @When("Navigate to Cart Page")
    public void navigateToCartPage() {
        home.clickOnShoppingCartLink();
    }

    @Then("Verify remove button is not displayed on the home page")
    public void verifyRemoveButtonIsNotDisplayedOnTheHomePage() {
        Assert.assertTrue(home.checkAddToCartBtnPresent());
    }
}
