@smoke
Feature: Wishlist
  Background:
    Given User direct to Item
    When User Clicks favorit icon
  Scenario: User click on Items Favourit link
    Then Success Message is displayed

    Scenario:User checks that cart
      And  user clicks wishlist tab
      #Expected result
      Then QTY value is bigger than 0