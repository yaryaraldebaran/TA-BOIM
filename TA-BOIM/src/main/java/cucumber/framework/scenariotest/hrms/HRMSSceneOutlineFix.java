package cucumber.framework.scenariotest.hrms;

public enum HRMSSceneOutlineFix{
	

	T1("User invalid login Outlinee"),// 6 skenario
	T2("User invalid empty username and password Outline"), // 6 skenario
	T3("User valid login"),// 1 skenario
	T4("Dashboard user function");//1 skenario
	
	private String testName;
	
	private HRMSSceneOutlineFix(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}