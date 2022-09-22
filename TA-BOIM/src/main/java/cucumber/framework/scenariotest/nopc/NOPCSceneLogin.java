package cucumber.framework.scenariotest.nopc;

public enum NOPCSceneLogin {

	T1("User invalid login"),
	T2("User valid login"),
	T3("Dashboard user function");
	
	private String testName;
	
	private NOPCSceneLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
