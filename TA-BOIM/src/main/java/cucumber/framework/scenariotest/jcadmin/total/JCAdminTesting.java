package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	B001("Menambah daftar rincian biaya baru active"),
	B002("Mengedit nama program di data pertama"),
	B003("Mengedit harga awal di data pertama"),
	B004("Mengedit diskon di data pertama"),
	B005("Mengedit keunggulan1 di data pertama"),
	B006("Mengedit keunggulan2 di data pertama"),
	B007("Mengedit keunggulan3 di data pertama"),
	B008("Mengedit keunggulan4 di data pertama"),
	B009("Mengedit keunggulan5 di data pertama"),
	B010("Melihat rincian biaya berdasarkan harga normal"),
	B011("Melihat rincian biaya berdasarkan diskon"),
	B012("Melihat rincian biaya berdasarkan harga hasil diskon"),
	B013("Mencari search rincian biaya berdasarkan nama program"),
	B014("Mencari search rincian biaya berdasarkan harga normal"),
	B015("Mencari search rincian biaya berdasarkan diskon"),
	B016("Mencari search rincian biaya berdasarkan harga diskon"),
	B017("Menambah benefit baru"),
	B018("Mengedit judul1 benefit pertama"),
	B019("Mengedit deskripsi1 benefit pertama"),
	B020("Mengedit judul2 benefit pertama"),
	B021("Mengedit deskripsi2 benefit pertama"),
	B022("Mengedit judul3 benefit pertama"),
	B023("Mengedit deskripsi3 benefit pertama"),
	B024("Mengedit judul4 benefit pertama"),
	B025("Mengedit deskripsi3 benefit pertama"),
	B026("Menambah blog baru"),
	B027("Mengedit body preview blog"),
	B028("Mengedit foto artikel blog"),
	B029("Mengedit PUBLISH artikel blog"),
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
