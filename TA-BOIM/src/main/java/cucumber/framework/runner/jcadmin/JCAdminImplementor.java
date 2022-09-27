package cucumber.framework.runner.jcadmin;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.framework.page.hrms.LoginPage;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.runner.hrms.sceneoutlinefix.SceneOutlineHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminImplementor {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB = new JCAdminRincianBiayaPage(); 
	
	public JCAdminImplementor() {
		driver = SceneOutlineHooks.driver;
		extentTest = SceneOutlineHooks.extentTest;
	}
	@When("User go to home")
	public void user_go_to_home() {
	    System.out.println("ini cucumber boim");
	}

	@And("User click rincian biaya button")
	public void user_click_rincian_biaya_button() {
		System.out.println("ini when kedua");
	}

	@And("User enter username, password, and email invalid")
	public void user_enter_username_password_and_email_invalid() {
	    System.out.println("ini and kedua");
	}

	@Then("User login valid")
	public void user_login_valid() {
	    System.out.println("ini then");
	}

}
