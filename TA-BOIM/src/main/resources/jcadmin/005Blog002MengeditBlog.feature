Feature: Blog
Background: Background login
	Given Admin login dan masuk ke halaman blog untuk mengedit
  When Admin menekan tombol edit blog pertama
#		
 Scenario: Mengedit judul blog
  When Admin edit judul blog
  And Admin klik simpan edit judul blog baru 
  Then admin mengedit judul blog baru
  
   #Scenario: Mengedit body preview blog
  #When Admin edit body preview blog
  #And Admin klik simpan edit body preview blog baru 
  #Then admin telah mengedit body preview blog baru
  
     #Scenario: Mengedit foto artikel blog
  #When Admin edit foto artikel blog
  #And Admin klik simpan edit foto artikel blog pertama 
  #Then admin telah mengedit foto artikel blog baru
  
   #Scenario: Mengedit PUBLISH artikel blog
  #When Admin edit PUBLISHOPT artikel blog
  #And Admin klik simpan edit publishopt blog pertama 
  #Then admin telah mengedit publishopt pada artikel blog baru