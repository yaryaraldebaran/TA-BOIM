Feature: Blog  
  Scenario Outline: Menambah blog <publish>
    Given <kode test case> Admin login dan membuka blog untuk menambah
    And  <kode test case> Admin mengisi form tambah blog baru dengan publish <publish>
    And <kode test case> Admin menekan tombol simpan tambah blog baru
    Then <kode test case> Admin menambah blog baru active valid
    
   Examples:
   	|kode test case|publish|
   	|B001|active|
   	|B002|no active|