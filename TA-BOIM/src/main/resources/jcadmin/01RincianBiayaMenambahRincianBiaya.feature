Feature: Rincian Biaya   
  Scenario Outline: Menambah daftar rincian biaya baru active
    Given Admin login dan membuka halaman rincian biaya
    When Admin klik tombol tambah
    And  Admin mengisi form dengan publish <status>
    And Admin menekan tombol simpan
    Then Admin menambah rincian biaya active valid
    
   Examples:
   	|status|
   	|Active|
   	|InActive|