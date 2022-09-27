package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	T1("User valid login"),
	T2("Dashboard user function");
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
