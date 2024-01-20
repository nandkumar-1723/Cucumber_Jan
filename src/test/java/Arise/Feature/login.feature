#Provide this tag to the runner class to run the below feature.
@login_99

  Feature: login functionality

    Scenario: verify the login by entering valid username and valid password

#      Pre-condtions
      Given Navigates to login page

#      Actual action
      When Enters the credentials

#      Validation / outcome
      Then verify the login status
