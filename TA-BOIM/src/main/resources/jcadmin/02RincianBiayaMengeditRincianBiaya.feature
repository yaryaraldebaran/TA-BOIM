Feature: Rincian Biaya
	Background: Background login
		When Admin login dan membuka halaman rincian biaya
		And Admin klik tombol edit rincian biaya pertama
		        
 Scenario: Mengedit nama program di data pertama
  When Admin mengedit nama program dengan <nama program>
  And Admin menekan tombol simpan edit nama program
  Then Admin mengedit nama program
  Examples:
  |nama program|
  |Pemrograman cucumber|
  
 Scenario: Mengedit harga awal di data pertama
  When Admin mengedit harga awal dengan <harga awal>
  And Admin menekan tombol simpan edit harga awal
  Then Admin mengedit harga awal
 Examples:
 |harga awal|
 |50000|
 
  Scenario: Mengedit diskon di data pertama
  When Admin mengedit diskon dengan <diskon>
  And Admin menekan tombol simpan edit diskon
  Then Admin mengedit diskon
  Examples:
  |diskon|
  |30|