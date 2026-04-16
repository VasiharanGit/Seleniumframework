Feature: Cart and Checkout functionality

  Background:
    Given user is logged in with valid credentials

  @cart
  Scenario: Add product to cart
    When user adds a product to the cart
    Then product should be displayed in the cart

  @cart
  Scenario: Remove product from cart
    Given user adds a product to the carts
    When user removes the product from the cart
    Then cart should be empty

  @checkout
  Scenario: Complete checkout process
    Given user adds a product to the cart
    And user navigates to the cart page
    When user clicks on checkout
    And user enters first name "John" last name "Doe" and postal code "600001"
    And user clicks on continue
    And user clicks on finish
    Then order should be placed successfully