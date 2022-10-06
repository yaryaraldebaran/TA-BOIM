Feature: Benefit
Background: Background login masuk ke edit benefit
	When Admin login dan masuk ke halaman benefit untuk mengedit benefit
  And Admin menekan tombol edit data benefit pertama
  
 Scenario Outline: <kode case> Mengedit <judulke> benefit pertama
  When <kode case> Admin mengedit <judulke> benefit menjadi <judul> dan <deskripsi ke> menjadi <deskripsi> dan publish menjadi <publishOpt>
  And <kode case> Admin klik simpan edit <judulke> benefit 
  Then <kode case> Admin telah mengedit <judulke> benefit
  
 Examples:
 |kode case|judulke|judul|deskripsi ke|deskripsi|publishOpt|
 |BE004P|judul1|edit judul ke 1||||
 |BE006P|judul2|edit judul ke 2||||
 |BE008P|judul3|edit judul ke 3||||
 |BE010P|judul4|edit judul ke 4||||
 |BE005P|||deskripsi1|edit deskripsi satu||
 |BE007P|||deskripsi2|edit deskripsi dua||
 |BE009P|||deskripsi3|edit deskripsi tiga||
 |BE011P|||deskripsi4|edit deskripsi empat||
 |BE002P|||||No Active|
 |BE003P|||||Active|