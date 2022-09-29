package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	T1("Menambah daftar rincian biaya baru active"),
	T2("Menambah daftar rincian biaya baru inactive"),
	T3("Mengedit nama program di data pertama");
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
