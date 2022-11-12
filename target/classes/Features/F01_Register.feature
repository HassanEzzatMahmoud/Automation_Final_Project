@smoke

Feature:User is able to reigster with valid criteria

  Scenario: User can Register with valid fields

    Given User direct to registration page
    When user Enters valid criteria "Hassan","Ezzat","test2@gmail.com", "P@ssw0rd","P@ssw0rd"
    And User Clicks Register
    Then User register successfully