package cucumber.framework.runner.hrms.sceneoutlinefix;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.framework.constant.Constants;
import cucumber.framework.page.hrms.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginEmpty {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	private String strValidation ="";
	public LoginEmpty() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}

	@When("User go to Web HRM Outline")
	public void user_go_to_web_hrm_outline() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web HRM");
	}

	@When("User enter (.*) invalid Outline")
	public void user_enter_username_invalid_outline(String x) {
		System.out.println("user_enter_username_invalid_outline pwd : "+x);
		loginPage.login("", x);		
		extentTest.log(LogStatus.PASS, "User enter username invalid outline");
	}

	@When("User click button login empty username Outline")
	public void user_click_button_login_empty_username_outline() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click button login empty username Outline");
	}

	@Then("User invalid empty username credentials Outline")
	public void user_invalid_empty_username_credentials_outline() {
		strValidation = loginPage.getEmptyUserNameInfo(10);
		assertEquals(strValidation, "Required");
		extentTest.log(LogStatus.PASS, "User invalid empty username credentials Outline");
	}

	@Then("^User enter (.*) invalid Outline$")
	public void user_enter_password_invalid_outline(String y) {
		System.out.println("user_enter_password_invalid_outline uName : "+y);
		loginPage.login(y, "");
	    extentTest.log(LogStatus.PASS, "User enter Password invalid Outline");
	}

	@Then("User click button login empty password Outline")
	public void user_click_button_login_empty_password_outline() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click button login empty password Outline");
	}

	@Then("User invalid empty password credentials Outline")
	public void user_invalid_empty_password_credentials_outline() {
		strValidation = loginPage.getEmptyPasswordInfo(10);
		assertEquals(strValidation, "Required");
		extentTest.log(LogStatus.PASS, "User invalid empty password credentials Outline");
	}
}