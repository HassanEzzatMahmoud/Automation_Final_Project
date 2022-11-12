@smoke
Feature: Search
  Scenario Outline: Search with productname
    When User enters "test1@gmail.com" & "P@ssw0rd"
    And User Clicks login button
    And User Search with "<productName>"
    Then Search result would match with "<productName>"



    Examples:
      |productName|
      |laptop     |
      |nike       |


  Scenario Outline: Search with SKU

    When User enters "test2@gmail.com" & "P@ssw0rd"
    And User Clicks login button
    And User Search with "<SKU>"
    And User Clicks on element
    Then Search result matchs with "<SKU>"

    Examples:
      |SKU|
      |AP_MBP_13    |


