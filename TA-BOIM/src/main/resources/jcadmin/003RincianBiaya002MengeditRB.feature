Feature: Rincian Biaya
	Background: Background login
		When Admin login dan membuka halaman rincian biaya edit
		And Admin klik tombol edit rincian biaya pertama edit
		        
 Scenario: Mengedit nama program di data pertama
  When RI010P Admin mengedit nama program dengan <nama program>
  And RI010P Admin menekan tombol simpan edit nama program
  Then RI010P Admin mengedit nama program
  Examples:
  |nama program|
  |Pemrograman cucumber baru|
  
 Scenario: Mengedit harga awal di data pertama
  When RI011P Admin mengedit harga awal dengan <harga awal>
  And RI011P Admin menekan tombol simpan edit harga awal
  Then RI011P Admin mengedit harga awal
 Examples:
 |harga awal|
 |50000|
 
  Scenario: Mengedit diskon di data pertama
  When RI012P Admin mengedit diskon dengan <diskon>
  And RI012P Admin menekan tombol simpan edit diskon
  Then RI012P Admin mengedit diskon
  Examples:
  |diskon|
  |30|
  
  Scenario: Mengedit keunggulan1 di data pertama
  When RI013P Admin mengedit keunggulan1 dengan <keunggulan1>
  And RI013P Admin menekan tombol simpan edit keunggulan1
  Then RI013P Admin mengedit keunggulan1
  Examples:
  |keunggulan1|
  |dapat link kerja|
  
  #Scenario: Mengedit keunggulan2 di data pertama
  #When RI014P Admin mengedit keunggulan2 dengan <keunggulan2>
  #And RI014P Admin menekan tombol simpan edit keunggulan2
  #Then RI014P Admin mengedit keunggulan2
    #Examples:
  #|keunggulan2|
  #|dapat link kerja|
  #
  #
   #Scenario: Mengedit keunggulan3 di data pertama
  #When RI015P Admin mengedit keunggulan3 dengan <keunggulan3>
  #And RI015P Admin menekan tombol simpan edit keunggulan3
  #Then RI015P Admin mengedit keunggulan3
    #Examples:
  #|keunggulan3|
  #|dapat link kerja|
  #
   #Scenario: Mengedit keunggulan4 di data pertama
  #When RI016P Admin mengedit keunggulan4 dengan <keunggulan4>
  #And RI016P Admin menekan tombol simpan edit keunggulan4
  #Then RI016P Admin mengedit keunggulan4
    #Examples:
  #|keunggulan4|
  #|dapat link kerja|
