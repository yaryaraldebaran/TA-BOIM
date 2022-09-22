package cucumber.framework.runner.hrms.sceneoutlinefix;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.page.hrms.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard {

	WebDriver driver;
	private static ExtentTest extentTest;
	private DashboardPage dashboardPage = new DashboardPage();
	
	public Dashboard() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}
	
	@When("User click menu Dashboard Outline")
	public void user_click_menu_dashboard_Outline() {
//		Hooks.delay(1);
		dashboardPage.goToMenuDashboard();
		extentTest.log(LogStatus.PASS, "User click menu Dashboard");
	}
	
	@Then("User on menu Dashboard")
	public void user_on_menu_dashboard() {
		//Sengaja fail untuk uji fungsi screenshot
		assertEquals(dashboardPage.getTxtDashboardPage(), "Launching Soo");
		extentTest.log(LogStatus.PASS, "User on menu Dashboard");
	}	
}