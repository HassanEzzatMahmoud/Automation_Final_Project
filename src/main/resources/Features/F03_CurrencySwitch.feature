@smoke
Feature: User is able to switch currency
  Scenario:Logged in user able to switch currency successfully
    When User enters "test2@gmail.com" & "P@ssw0rd"
    And User Clicks login button
    And User Switch currency
    Then Currency switched Successfully
