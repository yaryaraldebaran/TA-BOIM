package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	B01("Menambah daftar rincian biaya baru active"),
	B02("Menambah daftar rincian biaya baru inactive"),
	B03("Mengedit nama program di data pertama rincian biaya baru"),
	B04("Mengedit harga normal di data pertama rincian biaya baru"),
	B05("Mengedit diskon di data pertama rincian biaya baru"),
	B06("Mengedit keunggulan1 di data pertama rincian biaya baru"),
	B07("Mengedit keunggulan2 di data pertama rincian biaya baru"),
	B08("Mengedit keunggulan3 di data pertama rincian biaya baru"),
	B09("Mengedit keunggulan4 di data pertama rincian biaya baru"),
	B010("Mengedit keunggulan5 di data pertama rincian biaya baru"),
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
