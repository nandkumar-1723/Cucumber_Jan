#Provide this tag to the runner class to run the below feature.
@login_99

Feature: login functionality

  Scenario: verify the login by entering valid username and valid password

#      Pre-condtions
    Given Navigates to login page

#      Actual action
    When Enters the credentials
      | username | password    |
      | student  | Password123 |


#      Validation / outcome
    Then verify the login status
      | text                   |
      | Logged In Successfully |

  Scenario: verify the login by entering invalid username and valid password

      #      Pre-condtions
    Given Navigates to login page

#      Actual action
    When Enters the credentials
      | username | password    |
      | invalid  | Password123 |

#      Validation / outcome
    Then verify the login status
      | text                      |
      | Your username is invalid! |

  Scenario: verify the login by entering valid username and invalid password
              #      Pre-condtions
    Given Navigates to login page

#      Actual action
    When Enters the credentials
      | username | password |
      | student  | invalid  |

#      Validation / outcome
    Then verify the login status
      | text                      |
      | Your password is invalid! |

  Scenario: verify the login by entering invalid username and invalid password
                  #      Pre-condtions
    Given Navigates to login page

#      Actual action
    When Enters the credentials
      | username | password |
      | invalid  | invalid  |

#      Validation / outcome
    Then verify the login status
      | text                      |
      | Your username is invalid! |
#
