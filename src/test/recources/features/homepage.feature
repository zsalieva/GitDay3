@login
Feature:Home page
  As a team lead, when I enter the correct login information,
  I should be able to login
#Background: user on the login page <-- can be used for common test cases
 @Leader
  Scenario:Login as Team lead
   Given user on the login page
   When user logs in as a team lead
   Then homepage should be displayed
   And the Title should be correct

  @Member
 Scenario: Login as a team member
   Given user on the login page
   When user logs in as a team member
   Then homepage should be displayed

   @Teacher
  Scenario: Login as a Teacher member
    Given user on the login page
    When user logs in as a Teacher
    Then homepage should be displayed

