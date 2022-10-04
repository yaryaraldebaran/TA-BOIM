Feature: Rincian Biaya
	Background: Background login
		When Admin login dan membuka halaman rincian biaya edit
		And Admin klik tombol edit rincian biaya pertama edit
		        
 Scenario: Mengedit nama program di data pertama
  When RI010P Admin mengedit nama program dengan <nama program>
  And RI010P Admin menekan tombol simpan edit nama program
  Then RI010P Admin mengedit nama program THEN <nama program>
  Examples:
  |nama program|
  |Pemrograman cucumber baru|
  
 Scenario: Mengedit harga awal di data pertama
  When RI011P Admin mengedit harga awal dengan <harga awal>
  And RI011P Admin menekan tombol simpan edit harga awal 
  Then RI011P Admin mengedit harga awal THEN <harga awal>
 Examples:
 |harga awal|
 |50000|
 
  Scenario: Mengedit diskon di data pertama
  When RI012P Admin mengedit diskon dengan <diskon>
  And RI012P Admin menekan tombol simpan edit diskon
  Then RI012P Admin mengedit diskon THEN <diskon>
  Examples:
  |diskon|
  |30|
  
  Scenario: Mengedit keunggulan1 di data pertama
  When RI013P Admin mengedit keunggulan1 dengan <keunggulan1>
  And RI013P Admin menekan tombol simpan edit keunggulan1
  Then RI013P Admin mengedit keunggulan1 THEN <keunggulan1>
  Examples:
  |keunggulan1|
  |dapat link kerja satu|
  
    Scenario: Mengedit keunggulan2 di data pertama
  When RI013P Admin mengedit keunggulan2 dengan <keunggulan2>
  And RI013P Admin menekan tombol simpan edit keunggulan2
  Then RI013P Admin mengedit keunggulan2 THEN <keunggulan2>
  Examples:
  |keunggulan2|
  |trainer hebat dua|
  
    Scenario: Mengedit keunggulan3 di data pertama
  When RI013P Admin mengedit keunggulan3 dengan <keunggulan3>
  And RI013P Admin menekan tombol simpan edit keunggulan3
  Then RI013P Admin mengedit keunggulan3 THEN <keunggulan3>
  Examples:
  |keunggulan3|
  |trainer berpengalaman tiga|
  
    Scenario: Mengedit keunggulan4 di data pertama
  When RI013P Admin mengedit keunggulan4 dengan <keunggulan4>
  And RI013P Admin menekan tombol simpan edit keunggulan4
  Then RI013P Admin mengedit keunggulan4 THEN <keunggulan4>
  Examples:
  |keunggulan4|
  |materi berkualitas empat|
  
    Scenario: Mengedit keunggulan5 di data pertama
  When RI013P Admin mengedit keunggulan5 dengan <keunggulan5>
  And RI013P Admin menekan tombol simpan edit keunggulan5
  Then RI013P Admin mengedit keunggulan5 THEN <keunggulan5>
  Examples:
  |keunggulan5|
  |materi lengkap lima|
