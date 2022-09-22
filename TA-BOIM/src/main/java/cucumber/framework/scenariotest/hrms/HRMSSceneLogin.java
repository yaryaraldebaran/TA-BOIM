package cucumber.framework.scenariotest.hrms;

public enum HRMSSceneLogin{
	

	T1("User invalid login"),
	T2("User valid login"),
	T3("Dashboard user function");
	
	private String testName;
	
	private HRMSSceneLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}