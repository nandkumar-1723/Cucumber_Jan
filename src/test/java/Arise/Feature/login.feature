@Login_123

Feature: Login functionality

  Scenario: verify the login by entering valid username and password

    Given Navigates to login page

    When Enters the credentials
      | username | password    |
      | student  | Password123 |

    Then Verify the user status

  Scenario: verify the login by entering invalid username and valid password

    Given Navigates to login page

    When Enters the credentials
      | username   | password    |
      | student123 | Password123 |

    Then Verify the user status for wrong credentials

  Scenario: verify the login by entering valid username and invalid password

    Given Navigates to login page

    When Enters the credentials
      | username | password |
      | student  | Pass123  |

    Then Verify the user status for wrong credentials

  Scenario: verify the login by entering invalid username and invalid password

    Given Navigates to login page

    When Enters the credentials
      | username   | password |
      | student123 | pass1234 |

    Then Verify the user status for wrong credentials

