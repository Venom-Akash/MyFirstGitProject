Feature: Moneycontrol

Scenario Outline: LoginMoneyControl

Given User Open Chrome Browser

When User enter moneycontrol <URL>

Then User check title of the page

And user close the browser

Examples:
|URL|
|https://www.moneycontrol.com/|

