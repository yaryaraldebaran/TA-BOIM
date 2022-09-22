Feature: Login Invalid Username Password

  Scenario Outline: User invalid login Outlinee
    When Browser open Web HRM Outlinee
    And Enter invalid <password> and <username> Outlinee
    And button login clicked Outlinee
    Then System check credentials invalid Outlinee

#6 data
    Examples: 
      | username | password  |
      | Admin    | Admin1234 |
      | Admin    | adminn123 |
      | Adminn   | Addmin123 |
      | Admmin   | admin123  |
      | Admins   | minad921  |
      | Adminss    | admin1233  |
     