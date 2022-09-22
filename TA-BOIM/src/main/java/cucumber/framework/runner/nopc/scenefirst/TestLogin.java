package cucumber.framework.runner.nopc.scenefirst;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.nopc.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLogin() {
		driver = SceneFirstHooks.driver;
		extentTest = SceneFirstHooks.extentTest;
	}
	
	
	@When("User go to Web NOPC")
	public void user_go_to_Web_NOPC() {
		driver.get(Constants.URL_NOPC);
		extentTest.log(LogStatus.PASS, "User go to Web NOPC");
		
	}
	
	@And("User enter username password invalid")
	public void user_enter_username_password_invalid() {
		loginPage.login("admin@yourstore", "admin1234");
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User click button login")
	public void user_click_button_login() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click button login");
	}
	
	@Then("User invalid credentials")
	public void user_invalid_credentials() {
		assertEquals(loginPage.msgInvalid(), "No customer account found");
		extentTest.log(LogStatus.PASS, "User invalid credentials");
	}
	
	@When("User enter username password valid")
	public void user_enter_username_password_valid() {
		loginPage.login("admin@yourstore.com", "admin");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@And("User click button login valid")
	public void user_click_button_login_valid() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click button login valid");
	}
	
	@Then("User valid credentials")
	public void user_valid_credentials() {
		
		System.out.println("VALID USER INFO : "+loginPage.getTxtEmpInfo());
		assertEquals(loginPage.getTxtEmpInfo(), "Logout");
		assertTrue(loginPage.getTxtEmpInfo().contains("Log"));
		extentTest.log(LogStatus.PASS, "User valid credentials");
	}
}