package com.automations.steps;

import com.automations.pages.ReviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReviewSteps {

    ReviewPage view = new ReviewPage();

    @Then("verify user is on review page")
    public void verify_user_is_on_review_page() {
        Assert.assertTrue(view.FinishVef());
    }

    @When("user click on Finish button")
    public void user_click_on_finish_button() {
        view.FinishClick();
    }

    @Then("Verify total price is correct \\(it is equals to each item total and tax)")
    public void verifyTotalPriceIsCorrectItIsEqualsToEachItemTotalAndTax() {
        Assert.assertEquals(view.getTotalPrice(),"140.34");
    }

    @And("Click on back home")
    public void clickOnBackHome() {
        view.backToHome();
    }
}
