Feature: Rincian Biaya   
  Scenario Outline: Menambah daftar rincian biaya baru active
    Given <kode test case> Admin login dan membuka halaman rincian biaya tambah
    When <kode test case> Admin klik tombol tambah
    And  <kode test case> Admin mengisi form tambah dengan publish <status>
    And <kode test case> Admin menekan tombol simpan tambah
    Then <kode test case> Admin menambah rincian biaya active valid
    
   Examples:
   	|status | kode test case|
   	|Active | RI006P|
   	|InActive | RI007P|