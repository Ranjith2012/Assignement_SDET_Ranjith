Feature: Assignments Features

  Background:
    Given User open website
    Then verify user is on login page
    When user login valid username and password

  Scenario: Test1
    When Sort product from Z to A
    Then Verify product sorted by z to a

  Scenario: Test2
    And Sort product from price high to low
    Then Verify product sorted by price

  Scenario: Test3
    When Add all items into cart
    Then Verify cart icon quantity is equals to items you added in the cart
    When Navigate to Cart Page
    Then  Verify on cart page total items equals to items you added in the cart

  Scenario: Test4
    When Add all items into cart
    Then Verify cart icon quantity is equals to items you added in the cart
    When Navigate to Cart Page
    And user click on checkout button
    And user fill all checkout details
    And click on Continue button
    Then  Verify total price is correct (it is equals to each item total and tax)

  Scenario: Test5
    When Add all items into cart
    Then Verify cart icon quantity is equals to items you added in the cart
    When Navigate to Cart Page
    And user click on checkout button
    And user fill all checkout details
    And click on Continue button
    And user click on Finish button
    And Click on back home
    Then Verify remove button is not displayed on the home page

