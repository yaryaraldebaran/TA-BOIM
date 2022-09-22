Feature: Login Valid HRMS

  Scenario: User valid login
    When User go to Web HRM
    And User enter valid username password
    And User click button login
    Then User valid credentials