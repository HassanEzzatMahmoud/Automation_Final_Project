@smoke
Feature: Login
  #Test Scenario one

  Scenario: User login with valid username/password

    When User enters "test2@gmail.com" & "P@ssw0rd"
    And User Clicks login button
    #Expected Result
    Then User could login successfully  & go to Homepage

  Scenario: User login with invalid username/password

    When User enters "rest@gmail.com" & "1234"
    And User Clicks login button
    #Expected Result
    Then Error Message is displayed