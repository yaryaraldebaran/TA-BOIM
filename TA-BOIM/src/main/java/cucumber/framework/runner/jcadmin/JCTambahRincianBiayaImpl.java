package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.hrms.LoginPage;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.runner.hrms.sceneoutlinefix.SceneOutlineHooks;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCTambahRincianBiayaImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCTambahRincianBiayaImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminRB = new JCAdminRincianBiayaPage();
		
	}
	
	@Given("Admin login dan membuka halaman rincian biaya")
	public void admin_login_dan_membuka_halaman_rincian_biaya() {
	    JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	}

	@When("Admin klik tombol tambah")
	public void admin_klik_tombol_tambah() {
	    JCAdminRB.goToTambahRB();
	}

	@When("^Admin mengisi form dengan publish (.*)$")
	public void admin_mengisi_form_dengan_publish_active(String stat) {
		JCAdminRB.tambahDataRincianBiayaPublish(stat);
	}

	@When("Admin menekan tombol simpan")
	public void admin_menekan_tombol_simpan() {
	    JCAdminRB.clickSimpan();
	}

	@Then("Admin menambah rincian biaya active valid")
	public void admin_menambah_rincian_biaya_active_valid() {
	    assertTrue(JCAdminRB.getTxtSuccess().contains("berhasil"));
		
	}

}
