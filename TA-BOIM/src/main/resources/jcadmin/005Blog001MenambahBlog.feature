Feature: Blog  
  Scenario Outline: Menambah blog <publish>
    Given <kode test case> Admin login dan membuka blog untuk menambah
    And  <kode test case> Admin mengisi form tambah blog baru dengan publish <publish> dan to home <home>
    And <kode test case> Admin menekan tombol simpan tambah blog baru
    Then <kode test case> Admin menambah blog baru active valid
    
    
   Examples:
   	|kode test case|publish|home|
   	|BL002|active|yes|
   	|BL003|no active|yes|
   	|BL004|active|no|
   	|BL005|no active|no|