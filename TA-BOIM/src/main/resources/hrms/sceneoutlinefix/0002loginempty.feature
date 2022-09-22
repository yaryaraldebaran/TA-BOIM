Feature: Login Invalid Username Password

  Scenario Outline: User invalid empty username and password Outline
    When User go to Web HRM Outline
    And User enter <username> invalid Outline
    And User click button login empty username Outline
    Then User invalid empty username credentials Outline
    And User enter <password> invalid Outline
    And User click button login empty password Outline
    Then User invalid empty password credentials Outline

#6 data
    Examples: 
      | username | password  |
      | Admin    | Admin1234 |
      | Admin    | adminn123 |
      | Adminn   | Addmin123 |
      | Admmin   | admin123  |
      | Admins   | minad921  |
      | Adminss    | admin1233  |
