@scenario_outline

Feature: Verify the login

  Scenario Outline: verify the login by entering the credentials

    Given Navigates to login page

    When Enters the credentials
      | username   | password   |
      | <username> | <password> |

    Then verify the login status
      | message   |
      | <message> |

    Examples:
      | username | password    | message                   |
      | abcd     | Password123 | Your username is invalid! |
      | students | abcd123     | Your password is invalid! |
      | abcd     | ancd123     | Your username is invalid! |
      | student  | Password123 | Logged In Successfully    |

