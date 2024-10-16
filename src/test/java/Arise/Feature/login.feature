@login
@sanity

Feature: login functionality

#  First test case
  Scenario: verify the login by entering invalid username and valid password

    Given Navigates to login page

    When Enters the credentials
      | username | password    |
      | username | Password123 |

    Then verify the login status
      | message                   |
      | Your username is invalid! |

# second test case
  Scenario: verify the login by entering valid username and invalid password

    Given Navigates to login page

    When Enters the credentials
      | username | password |
      | student  | password |

    Then verify the login status
      | message                   |
      | Your password is invalid! |

#    third test case
  Scenario: verify the login by entering invalid username and invalid password

    Given Navigates to login page

    When Enters the credentials
      | username | password |
      | username | password |

    Then verify the login status
      | message                   |
      | Your username is invalid! |

#    fourth test case
  Scenario: verify the login by entering valid username and valid password

    Given Navigates to login page

    When Enters the credentials
      | username | password    |
      | student  | Password123 |

    Then verify the login status
      | message                |
      | Logged In Successfully |