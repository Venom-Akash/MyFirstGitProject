Feature: loginofdifferntWebsites

  Scenario: LoginMoneyControl
    Given User Open Chrome Browser
    When User enter moneycontrol
    Then User check title of the page
    And user close the browser

  Scenario: google
    Given User Open Chrome Browser
    When User enter google
    Then User check title of the page
    And user close the browser
