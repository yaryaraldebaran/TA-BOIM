Feature: Rincian Biaya
	Background: Background login
		When Admin login dan membuka cari halaman rincian biaya untuk mencari rb
		
	Scenario: Mencari search rincian biaya berdasarkan nama program
	When RI018P Admin memilih opsi nama program
	Then RI018P Admin melihat hasil search cari nama program

	Scenario: Mencari search rincian biaya berdasarkan harga normal
When RI019P Admin memilih opsi harga normal
Then RI019P Admin melihat hasil search cari harga normal
  
 Scenario: Mencari search rincian biaya berdasarkan diskon
  When RI020P Admin memilih opsi diskon
  Then RI020P Admin melihat hasil search cari diskon
  
    Scenario: Mencari search rincian biaya berdasarkan harga diskon
  When RI021P Admin memilih opsi harga diskon
  Then RI021P Admin melihat hasil search cari harga diskon