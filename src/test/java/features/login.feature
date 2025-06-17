Feature:Login to ParaBank

  Scenario: Valid login

    Given user navigates to the login page
    When user enters username "john" and password "demo"
    And user clicks on login button
    Then user should be navigated to the home page
