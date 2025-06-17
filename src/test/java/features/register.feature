Feature:

  Scenario: Successful registration with valid details

    Given user navigates to the registration page
    When user enters registration details with username "jasmitha" and password "jayansh"
    And user clicks on the register button
    Then user should be redirected to the login page





