#Provide this tag to the runner class to run the below feature.
@outline
@arise

Feature: login functionality

  Scenario Outline: verify the login by entering the credentials

    Given Navigates to login page

    When Enters the credentials
      | username   | password   |
      | <username> | <password> |

    Then verify the login status
      | text   |
      | <text> |

    Examples:
      | username | password    | text                      |
      | student  | Password123 | Logged In Successfully    |
      | invalid  | Password123 | Your username is invalid! |
      | student  | invalid     | Your password is invalid! |
      | invalid  | invalid     | Your username is invalid! |




