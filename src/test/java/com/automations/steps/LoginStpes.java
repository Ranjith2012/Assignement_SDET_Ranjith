package com.automations.steps;

import com.automations.pages.Loginpage;
import com.automations.utils.Configreader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStpes {

    Loginpage login = new Loginpage();

    @Given("User open website")
    public void user_open_website() {
        login.openWebsite();
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {

    }

    @When("user login valid username and password")
    public void user_login_valid_username_and_password() {
        login.loginuser(Configreader.getConfigFile("login.username"),Configreader.getConfigFile("login.password"));
    }

}
