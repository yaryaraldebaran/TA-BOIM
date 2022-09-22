#Feature: Login User HRMS Outline
#
  #Scenario Outline: User invalid login
    #When User go to Web HRM Outline
    #And User enter <username> <password> invalid Outline
    #And User click button login Outline
    #Then User invalid credentials Outline
#
  #Scenario Outline: User valid login
    #When User enter <username> password <password>
    #And User click button login valid
    #Then User valid credentials
#
    #Examples: 
      #| username | password  |
      #| Admin    | Admin1234 |
      #| Admin    | adminn123  |
      #| Adminn   | Addmin123  |
      #| Admmin     | admin123 |
      #| Admins   | minad921  |
      #| Admin   | admin123  |
#
      #Examples: 
      #| uname | pwd      |
      #| Admin | admin123 |
      #| Admin | admin123 |
      #| Admin | admin123 |
      #| Admin | admin123 |
      #| Admin | admin123 |
      #
      #Examples: 
      #| username | password  | uname | pwd      |
      #| Admin    | Admin1234 | Admin | admin123 |
      #| Admin    | Admin321  | Admin | admin123 |
      #| Adminn   | Admin123  | Admin | admin123 |
      #| Admi     | admin1123 | Admin | admin123 |
      #| Admins   | minad921  | Admin | admin123 |