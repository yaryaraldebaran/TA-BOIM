package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	T1("Menambah daftar rincian biaya baru active"),
	T2("Menambah daftar rincian biaya baru inactive"),
	T3("Mengedit nama program di data pertama rincian biaya baru"),
	T4("Mengedit harga normal di data pertama rincian biaya baru"),
	T5("Mengedit diskon di data pertama rincian biaya baru"),
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
