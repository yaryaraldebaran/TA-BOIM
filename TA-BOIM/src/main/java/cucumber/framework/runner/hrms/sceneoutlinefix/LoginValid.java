package cucumber.framework.runner.hrms.sceneoutlinefix;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.hrms.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginValid {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public LoginValid() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}
	
	@When("User go to Web HRM")
	public void user_go_to_Web_HRM() {
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "User go to Web HRM");
		
	}
	
	@And("User enter valid username password")
	public void user_enter_valid_username_password() {
		loginPage.login("Admin","admin123");
		extentTest.log(LogStatus.PASS, "User enter valid username password");
	}
	
	@And("User click button login")
	public void user_click_button_login() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click button login");
	}
	
	@Then("User valid credentials")
	public void user_valid_credentials() {
		String credentialsLogin = loginPage.getTxtEmpInfo(10);
		System.out.println("VALID USER INFO : "+credentialsLogin);
		assertEquals(credentialsLogin, "Employee Information");
		assertTrue(credentialsLogin.contains("Employee"));
		extentTest.log(LogStatus.PASS, "User valid credentials");
	}
	
}