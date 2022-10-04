Feature: Rincian Biaya
	Background: Background login
		When Admin login dan membuka halaman rincian biaya untuk melihat rb
		        
 Scenario: Melihat rincian biaya berdasarkan harga normal
  When RI003P Admin memilih opsi harga normal 
  Then RI003P Admin melihat rincian biaya berdasarkan harga normal
  Scenario: Melihat rincian biaya berdasarkan diskon
  When RI004P Admin memilih opsi diskon
  Then RI004P Admin melihat rincian biaya berdasarkan diskon
  Scenario: Melihat rincian biaya berdasarkan harga hasil diskon
  When RI005P Admin memilih opsi harga hasil diskon
  Then RI005P Admin melihat rincian biaya berdasarkan harga hasil diskon