Feature: Blog
Background: Background login
	Given Admin login dan masuk ke halaman blog untuk mengedit
  When Admin menekan tombol edit blog pertama
  
  Scenario Outline: Mengedit <nama> blog
  When <kode> Admin edit <nama> menjadi <publish>, <set to home>, <content preview>, <content>, blog
  And <kode> Admin klik simpan edit pada blog
  Then <kode> Admin telah mengedit
  Examples:
  |kode|nama|publish|set to home|content preview|content|
  |BL007P|publish|Active||||
  |BL009P|publish|No Active||||
  |BL010|set to home||Yes|||
  |BL011|set to home||No|||
  |BL012|content preview|||ini content prev||
  |BL013|content||||isi content artikel untuk blog|