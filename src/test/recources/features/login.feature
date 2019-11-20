Feature: Login functionality
  @wip
  Scenario: teacher login
    Given user on the login page
    # use teacher login info
    When user logs in using "myemail@gmail.com" and "mysecurepassword"
    Then Homepage should be displayed
    And title should be "homepage"
    And there should be 44 menu options


  @wip
  Scenario: Leader login
    Given user on the login page
    # use Leador login info
    When user logs in using "myemail@gmail.com" and "mysecurepassword"
    Then Homepage should be displayed
    And title should be "homepage"



