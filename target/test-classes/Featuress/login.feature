Feature: Login functionality of SauceDemo

  Background:
    Given user is on the login page

  @login @positive
  Scenario: Successful login with valid credentials
    When user enters username "standard_user" and password "secret_sauce"
    And user clicks on login button
    Then user should be navigated to the products page

  @login @negative
  Scenario Outline: Unsuccessful login with invalid credentials
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    Then user should see error message

    Examples:
      | username        | password       |
      | invalid_user    | secret_sauce   |
      | standard_user   | wrong_pass     |
      |                 | secret_sauce   |