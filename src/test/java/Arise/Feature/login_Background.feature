#Provide this tag to the runner class to run the below feature.
@background
@arise

Feature: login functionality

  Background: navigating to the login page

        Given Navigates to login page

  @backgound_s1
  Scenario: verify the login by entering valid username and valid password

#      Actual action
    When Enters the credentials
      | username | password    |
      | student  | Password123 |


#      Validation / outcome
    Then verify the login status
      | text                   |
      | Logged In Successfully |

  @backgound_s1
  Scenario: verify the login by entering invalid username and valid password

#      Actual action
    When Enters the credentials
      | username | password    |
      | invalid  | Password123 |

#      Validation / outcome
    Then verify the login status
      | text                      |
      | Your username is invalid! |

  Scenario: verify the login by entering valid username and invalid password

  #      Actual action
    When Enters the credentials
      | username | password |
      | student  | invalid  |

#      Validation / outcome
    Then verify the login status
      | text                      |
      | Your password is invalid! |

  Scenario: verify the login by entering invalid username and invalid password

  #      Actual action
    When Enters the credentials
      | username | password |
      | invalid  | invalid  |

#      Validation / outcome
    Then verify the login status
      | text                      |
      | Your username is invalid! |
#
