Feature: Blog  
  Scenario Outline: Menambah blog <publish>
    Given <kode test case> Admin login dan membuka blog untuk menambah
    And  <kode test case> Admin mengisi form tambah blog baru dengan publish <publish> dan to home <home>
    And <kode test case> Admin menekan tombol simpan tambah blog baru
    Then <kode test case> Admin menambah blog baru active valid
    
    
   Examples:
   	|kode test case|publish|home|
   	|B001|active|yes|
   	|B002|no active|yes|
   	|B001|active|no|
   	|B002|no active|no|