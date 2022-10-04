Feature: Benefit
Background: Background login masuk ke benefit
	Given Admin login dan masuk ke halaman benefit untuk menambah
  When Admin menekan tombol tambah benefit
    
   Scenario: Menambah benefit baru
  When Admin menambah benefit baru
  And Admin klik simpan benefit baru 
  Then admin telah menambah benefit baru