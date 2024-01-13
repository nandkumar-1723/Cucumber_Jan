Feature: login functionality

  Scenario: verify the login by entering the valid username and password

    Given Launch the browser and navigates to login page

    When Enters the username and password

    Then User should be on home page

    Scenario: verify the login by entering invalid username and password

      Given Launch the browser and navigates to login page

      When Enter the invalid username and password

      Then User should get the error message


