package cucumber.framework.runner.hrms.sceneoutlinefix;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.hrms.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginInvalid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public LoginInvalid() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}
	
	 
	@When("Browser open Web HRM Outlinee")
	public void browser_open_web_hrm_outlinee() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Browser open Web HRM Outlinee");
	}

	@When("^Enter invalid (.*) and (.*) Outlinee$")
	public void enter_invalid_password_and_username_outlinee(String username , String password) {
		System.out.println("user_enter_username_password_invalid uName : "+username+" pwd : "+password);
		loginPage.login(username, password);
		extentTest.log(LogStatus.PASS, "enter_invalid_password_and_username_outlinee");
	}

	@When("button login clicked Outlinee")
	public void button_login_clicked_outlinee() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "button login clicked Outlinee");
	}

	@Then("System check credentials invalid Outlinee")
	public void system_check_credentials_invalid_outlinee() {
		assertEquals(loginPage.msgInvalid(10), "Invalid credentials");
		extentTest.log(LogStatus.PASS, "System check credentials invalid Outlinee");
	}
}