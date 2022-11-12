@smoke
Feature: Slider Click
  Background:
    Given User direct to homepage
  Scenario:User clicks on First slider
    When Clicks first slider
    Then User should redirected to relative slider result

  Scenario:User clicks on Second slider
    When Clicks second slider
    Then User should redirected to relative to second result

