Feature: Rincian Biaya   
  Scenario: User valid login dan tambah data rincian
    When User go to home
    And User click rincian biaya button 
    And User enter username, password, and email invalid
    Then User login valid