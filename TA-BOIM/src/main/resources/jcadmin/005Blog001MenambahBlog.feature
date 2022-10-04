Feature: Blog
 Scenario: Menambah blog baru
  Given Admin login dan masuk ke halaman blog
  When Admin menekan tombol tambah blog baru
  And Admin klik pilih gambar 
  And Admin mengisi field blog baru
  And Admin memilih opsi set to home yes
  Then admin klik tombol simpan