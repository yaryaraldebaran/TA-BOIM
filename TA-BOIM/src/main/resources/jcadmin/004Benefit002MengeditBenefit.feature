Feature: Benefit
Background: Background login masuk ke edit benefit
	Given Admin login dan masuk ke halaman benefit untuk mengedit benefit
  When Admin menekan tombol edit data benefit pertama
    
 Scenario: Mengedit judul1 benefit pertama
  When Admin mengedit judul1 benefit
  And Admin klik simpan edit judul1 benefit 
  Then Admin telah mengedit judul1 benefit
 Scenario: Mengedit deskripsi1 benefit pertama
 When Admin mengedit deskripsi1 benefit
 And Admin klik simpan edit deskripsi1 benefit
 Then Admin telah mengedit deskripsi1 benefit
  
 #Scenario: Mengedit judul2 benefit pertama
  #When Admin mengedit judul2 benefit
  #And Admin klik simpan edit judul2 benefit 
  #Then Admin telah mengedit judul2 benefit
   #Scenario: Mengedit deskripsi2 benefit pertama
 #When Admin mengedit deskripsi2 benefit
 #And Admin klik simpan edit deskripsi2 benefit
 #Then Admin telah mengedit deskripsi2 benefit
 #
 #Scenario: Mengedit judul3 benefit pertama
  #When Admin mengedit judul3 benefit
  #And Admin klik simpan edit judul3 benefit 
  #Then Admin telah mengedit judul3 benefit
   #Scenario: Mengedit deskripsi3 benefit pertama
 #When Admin mengedit deskripsi3 benefit
 #And Admin klik simpan edit deskripsi3 benefit
 #Then Admin telah mengedit deskripsi3 benefit
 #
 #
   #Scenario: Mengedit judul4 benefit pertama
  #When Admin mengedit judul4 benefit
  #And Admin klik simpan edit judul4 benefit 
  #Then Admin telah mengedit judul4 benefit
   #Scenario: Mengedit deskripsi3 benefit pertama
 #When Admin mengedit deskripsi3 benefit
 #And Admin klik simpan edit deskripsi3 benefit
 #Then Admin telah mengedit deskripsi3 benefit